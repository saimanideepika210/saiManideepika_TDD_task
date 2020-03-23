package com.epam.TDDtask;

public class RemoveACharacters {

	public String remove(String string) {
		String result = string;
		int stringLength = string.length();
		
		if(string.charAt(0)!= 'A'  && string.charAt(1)!= 'A') {
			result=string;
		}
	        if(string.charAt(0) == 'A' && string.charAt(1)!= 'A') {
			result = string.substring(1,stringLength);
		}
		if(string.charAt(1)== 'A' && string.charAt(0)!= 'A') {
			result = string.charAt(0) + string.substring(2,stringLength);
		}
		if(string.charAt(0)== 'A'  && string.charAt(1)== 'A') {
			result=string.substring(2,stringLength);
		}
	
		return result;
	}

}



