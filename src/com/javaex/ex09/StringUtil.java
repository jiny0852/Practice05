package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] s){
       
        //메소드 내용작성
    	String result = "";
    	
    	for (int i = 0 ; i < s.length; i++) {
    		result += s[i]; 
    	}
        
    	
    	return result;
    }

}
