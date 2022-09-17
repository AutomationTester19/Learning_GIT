package com.git.learning.packages;

import java.util.HashMap;

public class loginPage {

	public static void enterLoginDetails(String userName, String passWord) {

		System.out.println(userName);
		System.out.println(passWord);
	}

	public HashMap<String, String> enterFormDetails(HashMap<String, String> data) {

		HashMap<String, String> inputData = new HashMap<String, String>();
		data.put("name", "test");
		data.put("eid", "123");
		data.put("salary", "10000");
		return inputData;
	}
}
