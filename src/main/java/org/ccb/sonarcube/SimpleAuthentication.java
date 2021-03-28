package org.ccb.sonarcube;

public class SimpleAuthentication {

	public boolean authenticate(String username, String password) {
	 return ("user".equals(username) && "Test".equals(password));
 	}
}
