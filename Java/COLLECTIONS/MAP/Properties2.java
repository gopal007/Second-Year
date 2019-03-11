  
  
  import java.util.*;
  import java.io.*;
  
  class Properties2
  
  {
	  public static void main(String args[])
	  throws Exception
	  {
		  FileReader reader = new FileReader("db.Properties");
		  
		  Properties p =new  Properties();
		  
		  p.load(reader);                          // LOADS DATA FROM READER OBJECT.....
		  
		  System.out.println(p.getProperty("NAME"));
		  System.out.println(p.getProperty("AGE"));
		  
	  }
  }