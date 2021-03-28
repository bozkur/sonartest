package org.ccb.sonarcube;

public class SimpleAuthentication {

	public boolean authenticate(String username, String password) {
		if ("user".equals(username) && "Test".equals(password)) {
			return true;
		}
		return false;
 	}
}
