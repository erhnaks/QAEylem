package com.qa.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputOutputRead {

	public static void main(String[] args) {
		  try( FileInputStream fin=new FileInputStream("C:\\Users\\erhan\\eclipse-workspace\\com.qa.junitTesting\\src\\main\\resources\\IOStream");    
		       BufferedInputStream bin=new BufferedInputStream(fin); ){
		   int i;    
		      while((i=bin.read())!=-1){    
		       System.out.print((char)i);    
		      }    
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		 }
	}