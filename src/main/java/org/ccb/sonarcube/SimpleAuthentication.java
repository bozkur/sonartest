package org.ccb.sonarcube;

import java.util.Arrays;

public class SimpleAuthentication {

	public boolean authenticate(String username, char[] password) {
		return ("user".equals(username) && Arrays.equals("password".toCharArray(), password));
	}
}
