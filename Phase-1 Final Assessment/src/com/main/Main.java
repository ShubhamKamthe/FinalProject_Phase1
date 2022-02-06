package com.main;

import java.io.IOException;

import com.locker.Application;



public class Main {

	public static void main(String[] args)throws IOException{
		System.out.println("Program Started");
		Application  fa=new Application();
		try {
		fa.Menu();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Program Ended");
	}

}
