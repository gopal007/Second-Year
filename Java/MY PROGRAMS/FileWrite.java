 import java.io.*;
 
 class FileWrite
 {
	 public static void main(String args [])
	 throws IOException
	 {
		 DataInputStream dis = new DataInputStream(System.in);
		 
		 FileOutputStream fout = new FileOutputStream("first.txt");
		 
		 System.out.println("Enter text ( end with @)");
		 
		 char ch;
		 
		 while((ch=(char)dis.read()) != '@')
		 {
			 fout.write(ch);
		 }
		 fout.close();
		 
	 }
 }
		 
		 