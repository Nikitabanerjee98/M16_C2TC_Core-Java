package com.cg.exception;

import java.io.IOException;

public class Program6 {
	void myMethod(int num)throws IOException, ClassNotFoundException
	{ 
     if(num==1)
        throw new IOException("IOException Occurred");
     else
        throw new ClassNotFoundException("ClassNotFoundException");
	}

	public static void main(String[] args) {
		 try
		   { 
			   Program6  obj=new Program6 (); 
		        obj.myMethod(1); 
		    }
		    catch(Exception ex){
		     System.out.println(ex);
		    } 
		

	}

}
