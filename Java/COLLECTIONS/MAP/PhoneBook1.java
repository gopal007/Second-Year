  import java.util.*;
  import java.io.*;
  
  class PhoneBook1
  
  {
  
       public static void main(String args[])
       throws Exception
       {
		   
	    Properties p = new Properties ();
		
		p.setProperty("Pooja","89998");
        p.setProperty("Pooja","22120");
		p.setProperty("Gopal","97663");
		p.setProperty("Gitesh","9421");
		p.setProperty("Nilesh","8329");
		p.setProperty("chetan","738584");
	
	
	FileOutputStream fos = new FileOutputStream("txt.Phonebook");
	
	p.store(fos , "THIS IS PHONE BOOK");
	
	   }
	   
  }
		
		
		