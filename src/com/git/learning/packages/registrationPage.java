package com.git.learning.packages;

import java.util.HashMap;

public class registrationPage {

	
	public HashMap<String, String> registerContact() {
		
		String contact_id=" ";
		String contact_Name=" ";
		String ph_num=" ";
		
		HashMap<String,String> contactMap = new HashMap<String,String>();
		contactMap.put("contactId", contact_id);
		contactMap.put("contactName", contact_Name);
		contactMap.put("ph_Num", ph_num);

		return contactMap;	
	}
}
