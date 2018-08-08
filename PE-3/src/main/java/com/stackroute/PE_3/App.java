package com.stackroute.PE_3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public boolean isCons(String str) {
	      String []arr= str.split(",");
	      int x=arr.length;int k=1;
	      int a[]=new int[x];
    
          for(int i=0;i<x;i++) {
    	       a[i]=(Integer.parseInt(arr[i]));
          }
          Arrays.sort(a);
          for(int i=0;i<x-1;i++) {
    	      if(a[i]+1==a[i+1]){
    		     /* //return false;
    		      break;*/
    	    	  k++;
    	      }
          }
          if(k==x) {
    	  return true;}
          else return false;
     }
     public String[][] isChess(){
	    String[][] c=new String[6][6];
	    for(int i=0;i<6;i++) {
		    for(int j=0;j<6;j++) {
			    if((i+j)%2 == 0) {
				    c[i][j] = "WW|";
	    }
			else
				c[i][j] = "BB|";
	    }
	}
	return c;
 }
public String sizeNegative(int i) throws NegativeArraySizeException{
	String l = "NegativeArraySizeException";
	try
    {   int x=0;
		if(x<i) {
			throw new NegativeArraySizeException("NegativeArraySizeException");
		}      
    }catch(NegativeArraySizeException e) {
          return  e.getMessage();
    }
	return l;
}


public String nullPointer(String ptr, int i) {
	
	String s = null;
	try
    {
        if (s.equals(ptr))
            return "Same";
        else
            return "Not Same";            
    }
    catch(NullPointerException e)
    {
        return "NullPointerException";
    }
	
}

public String outofbound(int[] arr, int index) throws IndexOutOfBoundsException {
	String l = "IndexOutOfBoundsException";
	try
    {   int size=arr.length;
		if(index>size) {
			throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
		}      
    }catch(IndexOutOfBoundsException e) {
          return  e.getMessage();
    }
	return l;
}

}


