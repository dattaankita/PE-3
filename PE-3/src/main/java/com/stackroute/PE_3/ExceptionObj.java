package com.stackroute.PE_3;

public class ExceptionObj {
	public static void main(String args[]) throws Exception{
		try {
			throw new Exception("null");
		}
	
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Finally Block");
	}
	}
}
