  import java.util.*;
  import java.io.*;
  
  class Properties3
  
  {
	  public static void main(String args[])
	  throws Exception
	  {
		  Properties G = new Properties();
		  
		  G.setProperty("COMP","SAMSUNG");
		  G.setProperty("MODL","GALAXY ON 7");
		  G.setProperty("RAM","2 gb");
		  G.setProperty("CMR","FRONT 5.0 REAR 13.0");
		  G.setProperty("CLR","BLACK");
		  G.setProperty("BTR","1400 mAH");
		  G.setProperty("PRICE","10800 Rupees Only");
		  
		  FileOutputStream fos = new FileOutputStream ("txt.Gopal");
		  
		  G.store(fos , "THIS ARE THE SPECIFICATIONS OF GOPAL'S MOBLE");
		  
	  }
	  
  }
		  