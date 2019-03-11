 import java.io.*;
 
 class FileRead1
 {
	 public static void main(String args [])
	 throws IOException
	 {
		 FileOutputStream dis =new FileOutputStream("second.txt");
		 
		 FileInputStream fin = new FileInputStream("first.txt");
		 
		 int ch;
		 
		 while((ch=fin.read()) != -1)
		 {
			 dis.write((char)ch);
		 }
		 fin.close();
		 dis.close();
		 
	 }
 }
		 
		 