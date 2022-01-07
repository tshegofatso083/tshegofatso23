	
/***********************************************************************************************************************************************************************
                 
                                                                    MAPHAKANE TSHEGOFATSO

                                                                    CHALLENGES 2


************************************************************************************************************************************************************************/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


import java.util.Scanner;


public class Challenges {

     public static void main(String[] args) {
          

          LinkedList<String> list=new LinkedList<String>();
          Scanner sc = new Scanner(System.in);
           

 int userChoice;
 boolean quit = false;

            do {
try{

        System.out.println("MENU");
        System.out.println("1: Add Record");
        System.out.println("2: Update Record");
        System.out.println("3: Delete Record");
        System.out.println("4: Display Record");
        System.out.print("Enter your selection : ");
        System.out.print("Your choice, 0 to quit: "+"\n");
        userChoice = sc.nextInt();

                  switch (userChoice) {

                  case 1:    // user Records
                 
                              // prompt mame
                        System.out.println("\n"+"What is your name:");
	                String name = sc.next();
	                System.out.println("What is your surname:");
	                String surname = sc.next();
	                System.out.println("What is your email:");
	                String email = sc.next();
	                System.out.println("Enter date in format dd/MM/yyyy: ");
		        String date_of_birth = sc.next();
		 
                               //validate date
	      	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");    // define a formatter;
	                LocalDate theDate = LocalDate.parse(date_of_birth, formatter);

		               // display it using the same formatter

	     	        String backToStr = formatter.format(theDate);
		        String year = backToStr.split( "/")[2];
	                int age = 2021 - Integer.parseInt(year);

	                System.out.println("You are " +age+ "years old"+"\n");

	                      //add the values on the List
                   
                       list.add(name);
                       list.add(surname);
                       list.add(email);
                       list.add(date_of_birth);

                       System.out.println("Hello= " +name +" "+surname+ " "+"your details have been saved to the database");
                       System.out.println("UserList: " + list);

 System.out.println("##########################################################################################################################################################");
      break;
   
/********************************************************************************************************************************************************************************/
                  case 2: // Update

                            
                       // access middle element
                 String middle1 = list.get(list.size()/2);
                 //System.out.println("\n"+"Middle Element: " + middle1);
                 System.out.println("What is your email:");
                 String email2 = sc.next();

                   if (email2.equals(middle1)) {

                            System.out.println("What is your name:");
	                    String name1 = sc.next();
	                    System.out.println("What is your surname:");
	                    String surname1 = sc.next();
	                    System.out.println("What is your email:");
	                    String email1 = sc.next();

	                    System.out.println("Enter date in format dd/MM/yyyy: ");
		            String date_of_birth1 = sc.next();
		
	      	            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");    // define a formatter;
                            LocalDate theDate1 = LocalDate.parse(date_of_birth1, formatter1);
		
		               // display it using the same formatter
	     	           String backToStr1 = formatter1.format(theDate1);
		
	                   String year1 = backToStr1.split( "/")[2];
	                   int age1 = 2021 - Integer.parseInt(year1);
	                   System.out.println("You are " +age1+ "years old"+"\n");

                           System.out.println("Hello= " +name1 +" "+surname1+ " "+"your details has been updated database");


                           list.set(0, name1);
                           list.set(1, surname1);
                           list.set(2, email1);
                           list.set(3, date_of_birth1);
                           System.out.println("Updated UserList contains : " + list);
                         }
                      else {
                           System.out.println("ERROR:Element not found in UserList  " );
                
                            }
 System.out.println("##########################################################################################################################################################");
                      break;
  
              
/********************************************************************************************************************************************************************/    
                   case 3: //Delete

  
                    // access middle element
               String middle = list.get(list.size()/2);
               System.out.println("\n"+"Middle Element: " + middle);

               System.out.println("What is your email:");
               String email3 = sc.next();


               if (email3.equals(middle)) {
               System.out.println("Element  found"+ list);

                  // remove all the elements
              list.clear();
              System.out.println("Your UserList Is Succesfully deleted: ");

                }
            else {
            System.out.println("ERROR:Element not found in UserList  " );
                
            }
 System.out.println("##########################################################################################################################################################");
                        break;
/***********************************************************************************************************************************************************************/
            case 4: //Display 

            //System.out.println("\n"+"Hello= " +name +" "+surname+ " "+"your details have been saved to the database");
            System.out.println("UserList: " + list);

System.out.println("##########################################################################################################################################################");
break;
     
/***********************************************************************************************************************************************************************/
            case 0:

                        quit = true;

                        break;

                  default:

                        System.out.println("\n"+" Sorry Wrong choice.");

                        break;

                  }

                  }
            catch(Exception e) {
                System.out.println("PLEASE ENTER A CORRECT VALUES!!");
            }

              // System.out.println();

            } while (!quit);

            System.out.println("Good Bye!");

 System.out.println("##########################################################################################################################################################");

      }

}
