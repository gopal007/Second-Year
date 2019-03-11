  
  import java.util.*;
  import java.io.*;
  
  class Properties4
  
  {
	  public static void main(String args[])
	  throws Exception
	  {
		  
		  FileReader fr = new FileReader("txt.Gopal");
		  
		  Properties p = new Properties();
		  
          p.load(reader);		  
		  System.out.println(p.getProperty("COMP"));
		  
		  
	  }
	  
  }
		  