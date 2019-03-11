  // ADDING CUSTOM OBJECT TO HASH SET.....
  
  /*   BULK/SET  OPERATION OF SET....
       1.  S1.addAll(S2)      2.  S1.removeAll(S2)    3.  S1.retainAll()                                             */     
  
  import java.util.*;
  
  class Book
  {
	  int Id,Quantity;            // Instance variable....
	  String Name,Auther,Publisher;
	  
	  public Book(int Id, String Name,String Auther,String Publisher, int Quantity)
	  {
		 this.Id = Id;
		 this.Name = Name;
		 this.Auther = Auther;
		 this.Publisher = Publisher;
		 this.Quantity = Quantity;
	  }
	  
  }
  
  class HashSetTest2
  
   {
	    public static void main(String Books[])
		{
			HashSet<Book> hs=new HashSet<Book>();
			 
			 Book b1=new Book(784,"CHAVA","SHIVAJI SAWANT","MARATHA PUBLICATION",15);
			 Book b2=new Book(951,"HALF GIRLFRIEND","CHETAN BHAGAT","RUPA PUBLICATION",10);
			 Book b3=new Book(101,"FIVE POINT SOMEONE","CHETAN BHAGAT","RUPA PUBLICATION",23);
			 Book b4=new Book(584,"REVOLUTION 20 20","CHETAN BHAGAT","RUPA PUBLICATION",25);
			 
			 hs.add(b1);
			 hs.add(b2);
			 hs.add(b3);
			 hs.add(b4);
			 
			 for(Book b : hs)
			 {
			 System.out.println(b);                                                                  // PRINTS TYPE AND ADDRESS..... 
			 }
			 
			  System.out.println(); 
			  
			  for(Book b : hs)
			  {
				   System.out.println(); 
				   System.out.println("ID OF BOOK :         "+b.Id);
				   System.out.println("NAME OF BOOK :       "+b.Name);
				   System.out.println("AUTHER OF BOOK :     "+b.Auther);
				   System.out.println("PUBLISHER :          "+b.Publisher);
				   System.out.println("AVAILABLE QUANTITY : "+b.Quantity); 
			  }
		}			  
  }
  