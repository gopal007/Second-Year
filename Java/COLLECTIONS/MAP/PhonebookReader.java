  
  
  import java.util.*;
  import java.io.*;
  
  class PhonebookReader
  
  {
	  public static void main(String args[])
	  throws Exception
	  {
	      Scanner scan = new Scanner(System.in);
		  FileReader reader = new FileReader("txt.Phonebook");
		  
		  Properties p =new  Properties();
		  
		  p.load(reader);                          // LOADS DATA FROM READER OBJECT.....
		  
		  System.out.println("ENTER WHOSE NUM U WNT 2 SER. : ");
		  String key = scan.next();

		  System.out.println(p.getProperty(key));
		  
	  }
  }