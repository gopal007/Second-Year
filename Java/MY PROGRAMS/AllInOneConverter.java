import java.util.Arrays;
import java.util.Scanner;

       class AllInOneConverter
            {
	            public static void main(String [] args )
	                {
	                     	System.out.printf("\n\n\t\t\t\t YOU ARE CURRENTLY USING GOPAL'S DECIMAL TO OCTAL CONVERTER \n\n\n");
		                    Scanner scan = new Scanner(System.in);
					start:
                        for(;;)				
						{							
							
							
					    octalc:
                           for(;;)
                            {							   
	                        findanother_octal:
		  
	                            for(;;)  
	                                {
	
		                               System.out.println("ENTER DECIMAL NUM TO FIND ITS OCTAL EQUIVALENT ");
		                               int dnum = scan.nextInt() ;
		                               int ddnum = dnum , count = 0;
		  
		  
		                               for( int i = 0  ; ; i++)
		                                   {
			                                   //int b = ddnum % 8 ;
			                                   ddnum = ddnum / 8 ;
			                                   count++;
			                                   if(ddnum==0)
			                                     {
				                                     break;
			                                     }
		                                   }
		  
		  
		  
		                               int octal [] = new int [count];

		                               for(int a = 0 ; a < count ;a++)
		                                   {
			                                    octal[a] = dnum % 8 ;
			                                    dnum = dnum / 8 ;
		                                    }
		  
		  
		                               System.out.print("\n\nOCTAL EQUIVALENT IS :  ");
		                               for(int a = (count - 1) ; a >= 0 ; a--)
		                                   {
			                                   System.out.printf(octal[a]+" ");
		                                   }
		  
	                                   System.out.println("\n\nDO YOU WANT FIND OCTAL EQUIVALENT FOR ANOTHER NUMBER ?     (Y/N) ");
			                           char key = scan.next().charAt(0);
			                           if(key=='y'  || key=='Y')
			                              {
				                              continue findanother_octal;
			                              }
			                          else{
			                          	  break;
									      }
			                        }
	                        }
		            
		  
		  
		  
		  
	        
			
			            binaryc:
			                for(;;)
		                    {
	                         findanother_binary:	
							 
                                for(;;)
								{            
						              System.out.println("ENTER DECIMAL NUM TO FIND ITS BINARY EQUIVALENT ");
		                              int dnum = scan.nextInt() ;
		                              int ddnum = dnum , count = 0;
		  
		  
		                              for( int i = 0  ; ; i++)
		                                    {
			                                 //int b = ddnum % 2 ;
			                                 ddnum = ddnum / 2 ;
			                                 count++;
			                                 if(ddnum==0)
			                                    {
				                                  break;
			                                    }
		                                    }
		  
		  
		  
		                              int binum [] = new int [count];

		                              for(int a = 0 ; a < count ;a++)
		                                    {
			                                  binum[a] = dnum % 2 ;
			                                  dnum = dnum / 2 ;
		                                    }
		  
		  
		                              System.out.print("\n\nBINARY EQUIVALENT IS :  ");
		                              for(int a = (count - 1) ; a >= 0 ; a--)
		                                   {
			                                 System.out.printf(binum[a]+" ");
		                                   }
		  
		                              System.out.printf("\n\n");
		  
		                              System.out.println("\n\nDO YOU WANT FIND BINARY EQUIVALENT FOR ANOTHER NUMBER ?     (Y/N) ");
		                              char key = scan.next().charAt(0);
		  
			                          if(key=='y'  || key=='Y')
			                          {
				                        continue findanother_binary;
			                          }
			                          else
			                          {
				                         break;
			                          }
		  
		  
	                            }
		                    }
		  
		  
	
	  
                        hexadecimalc:      
		                    for(;;)
							{
	                         findanother_hexadecimal:
                                for(;;)
	                            {		  
		                              System.out.println("ENTER DECIMAL NUM TO FIND ITS HEXADECIMAL EQUIVALENT ");
									  int dnum = scan.nextInt() ;
									  int ddnum = dnum , count = 0;
		  
		  
									  for( int i = 0  ; ; i++)
										{
											//int b = ddnum % 16 ;
											ddnum = ddnum / 16 ;
											count++;
											if(ddnum==0)
											   {
													break;
												}
		                                }
		  
		  
		  
									  int hexnum [] = new int [count];
		  

									  for(int a = 0 ; a < count ;a++)
											{
												int b = dnum % 16 ;
												if(b==10)
													{
														b = 'A' ;
													}
			  
												if(b==11)
													{
														b = 'B' ;
													}
			  
												if(b==12)
													{
														b = 'C' ;
													}
			  
												if(b==13)
													{
														b = 'D' ;
													}
			  
												if(b==14)
													{
														b = 'E' ;
													}
			  
												if(b==15)
													{
														b = 'F' ;
													}
			  
												hexnum[a] = b ; 
												dnum = dnum / 16 ;
											}
		  
									  char g;
									  System.out.print("\n\n HEXADECIMAL EQUIVALENT IS :  ");
									  for(int a = (count - 1) ; a >= 0 ; a--)
		                                    {
			                                  if(hexnum[a]>64)
											  {
			                                       g=(char)hexnum[a];
			                                       System.out.print(g+" ");
			                                  }
			                                  else{
				                                   System.out.print(hexnum[a]+" ");
			                                     }
		                                    }
		  
									  System.out.printf("\n\n");
		  
		                              System.out.println("\n\nDO YOU WANT FIND HEXADECIMAL EQUIVALENT FOR ANOTHER NUMBER ?     (Y/N) ");
			                          char key = scan.next().charAt(0);
			                          if(key=='y'  || key=='Y')
			                             {
				                            continue findanother_hexadecimal;
			                             }
			                          else
			                             {
				                            break;
			                             }
		  
	                            }
		                    }
							
							System.out.println("WHICH CONVERTER YOU WANT TO USE : (INPUT CORRESPONDING NUMBER)");
							System.out.println("1. DECIMAL TO OCTAL.");
							System.out.println("2. DECIMAL TO BINARY.");
							System.out.println("3. DECIMAL TO HEXADECIMAL.");
							
							
							int c = scan.nextInt();
							
							if(c==1)
							{
								continue octalc;
							}
							else if(c==2)
							{
								continue binaryc;
							}
							else if(c==3)
							{
								continue hexadecimalc;
							}
							else
							{
								System.out.println("WRONG INPUT METHOD ");
								continue start;
							}

						}
					}
			}
	  
  