//printer Class
package com.surya.test;

import com.surya.dp.Printer;

public class SingletonTest1 {

	public static void main(String[] args) throws Exception {
		
		//Class.forName("com.surya.dp.Printer");
		
          Printer p1 = Printer.getInstance();
          Printer p2 = Printer.getInstance();
          System.out.println(p1.hashCode()+"   "+p2.hashCode());
          System.out.println("p1==p2? "+(p1==p2));
          
		
	} // main
} // class
  