package org.ccb.sonarcube.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class JdbcExample {
	private static final Logger LOG = Logger.getLogger(JdbcExample.class.getName()); 
	public static void main(String[] args) throws SQLException {
		var url = "jdbc:derby:memory:testDb;create=true";
		try (Connection connection = DriverManager.getConnection(url)) {
			try (Statement statement = connection.createStatement()) {
				statement.execute("CREATE TABLE PERSON (name VARCHAR(64), surname VARCHAR(64))");
				statement.execute("INSERT INTO PERSON VALUES ('test', 'user')");
				statement.execute("INSERT INTO PERSON VALUES ('test2', 'user')");

				String searchedUser = (args.length == 0 )? "test" : args[0]; 
				/*ResultSet resultSet = statement
						.executeQuery("SELECT * FROM PERSON WHERE name like '%" + searchedUser + "%'");*/
				PreparedStatement pstatement = connection.prepareStatement("SELECT * FROM PERSON WHERE name like ?");
				pstatement.setString(1, searchedUser);
				ResultSet resultSet = pstatement.executeQuery();
				getRecords(resultSet).stream().map(Object::toString).forEach(LOG::info);
			}
		}
	}

	private static List<Person> getRecords(ResultSet resultSet) throws SQLException {
		List<Person> records = new ArrayList<>();
		while (resultSet.next()) {
			records.add(new Person(resultSet.getString("name"), resultSet.getString("surname")));
		}
		return records;
	}

	private static class Person {
		private final String name;
		private final String surname;

		private Person(String name, String surname) {
			super();
			this.name = name;
			this.surname = surname;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", surname=" + surname + "]";
		}

	}
}
