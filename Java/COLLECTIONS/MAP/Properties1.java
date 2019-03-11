

  // Properties is a subtype of hashtable.....
  
  import java.util.*;
  import java.io.*;
  
  class Properties1
  
  {
	  public static void main(String args[])
	  throws Exception
	  {
		  Properties p = new Properties ();
		  
		  p.setProperty("NAME","GOPAL ASHOK GAWANDE");
		  p.setProperty("AGE","19");
		  p.setProperty("COLLEGE","SGGS");
		  
		  FileOutputStream fos = new FileOutputStream("db.Properties");
		  
		  p.store( fos , "this is property file");
		  
	  }
	  
  }
		  