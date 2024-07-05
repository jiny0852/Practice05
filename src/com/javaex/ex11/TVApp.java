package com.javaex.ex11;

public class TVApp {

	public static void main(String[] args) {
		
		TV tv = new TV(7, 20, false);
		
		tv.status(); 
		
		//1
		tv.power(true);
		tv.volume(120); //100으로 유지
		tv.status();  
		
		//2
		tv.volume(false);
		tv.status();  
		
		//3
		tv.channel(0);
		tv.status();  
		
		//4
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();  
		
		//5
		tv.power(false);
		tv.status();  
		
		//////////////////////////////////
		/*
		tv.channel(true);
		tv.volume(false);
		tv.status();
		
		tv.power(true);
		tv.channel(255);
		tv.channel(true);
		tv.volume(true);
		tv.status();
		
		tv.volume(0);
		tv.volume(false);
		tv.status();
		*/
	}

}
