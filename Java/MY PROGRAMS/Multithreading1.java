  // MULTITHREADING.......concurrent execution of more than one thread/process.
  //  OS provides Scheduler....
  //  Thread is created by 2 ways     1. by extending thread class      2. by implementing runnable interface.......BOTH THEM EXIST IN java.lang.package
  // thread is executed by calling run method....... which is like main method of thread.
  // thread is created with some properties like     1. id   2. name   3. priority(1 - 10)
  // void setName()
  // void setPriority(num)
  // getState()
  
  class EvenThread extends Thread
  
     {
		 public void run()
		 
		 {
			 for(int i = 0; i < 20 ; i = i+2)
			 {
				 System.out.println("EVEN THREAD :" + i);
			 }
			 
		 }
		 
	 }
	 
	 
  class OddThread extends Thread
  
     {
		 public void run()
		 
		 {
			 for(int j = 1 ; j < 22 ; j = j+2)
			 {
				 System.out.println("ODD THREAD :" + j);
			 }
			 
		 }
		 
	 }
	 
	 
  class StrThread extends Thread
  
     {
		 public void run()
		 {
			 for(int k = 0 ;k < 10 ; k++)
			 {
				 System.out.println("STRING THREAD : GOPAL");
			 }
			 
		 }
		 
	 }
	 
	 
	 class Multithreading1
	 
	   {
		   public static void main(String [] p )
		   
		   {
			   
			   EvenThread e = new EvenThread();
			   OddThread  o = new OddThread();
			   StrThread  s = new StrThread();
			   
			   
			   long   ei = e.getId();
			   String en = e.getName();
			   int    ep = e.getPriority();
			   
			   System.out.println("EVEN THREAD : ");
			   System.out.println("ID        : " + ei);
			   System.out.println("NAME      : " + en);
			   System.out.println("PRIORITY  : " + ep);
			   System.out.println();
			   
			   
			   long   oi = o.getId();
			   String on = o.getName();
			   int    op = o.getPriority();
			   
			   System.out.println("ODD THREAD : ");
			   System.out.println("ID         : " + oi);
			   System.out.println("NAME       : " + on);
			   System.out.println("PRIORITY   : " + op);
			   System.out.println();
			   
			   
			   long   si = s.getId();
			   String sn = s.getName();
			   int    sp = s.getPriority();
			   
			   System.out.println("STRING THREAD : ");
			   System.out.println("ID        : " + si);
			   System.out.println("NAME      : " + sn);
			   System.out.println("PRIORITY  : " + sp);
			   System.out.println();
			   
			   
			  
			   
			   e.start();
			   o.start();
			   s.start();
			   
			   
			   
		   }
		   
	   }