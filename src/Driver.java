/* 
 * -------------------------------------------------------------------------------------------------------
 * Assignement 4
 * This Program is Created by Cristian Gasparesc 40209205 and Amirhossein Tavakkoly 40203604
 * COMP 248 Section P - Fall 2021
 * -------------------------------------------------------------------------------------------------------
 * its purpose is to generate a ticketbooth where you can interact choose different options of services provided  */

import  java.util.Scanner;

public class Driver {

	//choose which method to apply according to the user's input 
    public static void chosen_array(Ticketbooth chosen_array) //shows content of chosen_array
    {
    
        System.out.println(chosen_array.toString());
    }
	
	//3 array of OPUS cards that we use in our ticketbooth objects. 
    static OPUScard[] Opus1 = {new OPUScard("STL","Rahiil",3,2034)};
    
    static OPUScard[] Opus2 = {new OPUScard("STM","Rahool",7,2032)}; //change these later
    
    static OPUScard[] Opus3 = {new OPUScard("REM","Raheel",12,2026),
                                new OPUScard("STM","Rahaal",1,2025),
                                new OPUScard("RTL","Rahuul",11,2022)};
    
    static Ticketbooth ticketbooth_0 = new Ticketbooth(new Tickets(0,2,0,0,0), Opus1);//5 testing ticketbooths using data provided
    
    static Ticketbooth ticketbooth_1 = new Ticketbooth(new Tickets(0,2,0,0,0),Opus2);
    
    static Ticketbooth ticketbooth_2 = new Ticketbooth(new Tickets(0,0,5,0,0),Opus3);
    
    static Ticketbooth ticketbooth_3 = new Ticketbooth(new Tickets(3,3,3,3,3),null);
    
    static Ticketbooth ticketbooth_4 = new Ticketbooth(new Tickets(3,3,3,3,3),null);
    
    
    //creating an array of our testing ticketbooths to use in the options of services below.
    static Ticketbooth[] TicketBooth_Array = {ticketbooth_0, ticketbooth_1, ticketbooth_2,ticketbooth_3,ticketbooth_4};
	
	
    
	public static void main(String[] args)
	{
	
	
		
		System.out.println("========================================================================"); //Greet Display
		System.out.printf("%63s","Welcome to Concordia 2021 Fall Geek's Ticketbooth Application");
		System.out.println("\n========================================================================");
		
		int user_input;
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("\nWhat would you like to do?"); //Ticketbooth Display 
		System.out.println("1. See the content of all Ticketbooths");
		System.out.println("2. See the content of one Ticketbooth");
		System.out.println("3. List Ticketbooths with same content of ticket's values");
		System.out.println("4. List Ticketbooths with same Tickets amount");
		System.out.println("5. List Ticketbooths with same Tickets amount of tickets values and same number of OPUS");
		System.out.println("6. Add a OPUS card to an existing Ticketbooth");
		System.out.println("7. Add a OPUS card to an existing Ticketbooth");
		System.out.println("8.Update the expiry date of an existing OPUS card");
		System.out.println("9. Add Tickets to a Ticketbooth");
		System.out.println("0. To quit");
		
		System.out.println("\nPlease enter your choice and press <Enter>:");
		user_input = scan.nextInt();
		
		  while (user_input > 9  || user_input < 0) //input validity
	       {
			  System.out.println("Sorry that is not a valid choice. Try Again. (1 to 9) \n");
			  
			  System.out.println("What would you like to do?");
				System.out.println("1. See the content of all Ticketbooths");
				System.out.println("2. See the content of one Ticketbooth");
				System.out.println("3. List Ticketbooths with same content of ticket's values");
				System.out.println("4. List Ticketbooths with same Tickets amount");
				System.out.println("5. List Ticketbooths with same Tickets amount of tickets values and same number of OPUS");
				System.out.println("6. Add a OPUS card to an existing Ticketbooth");
				System.out.println("7. Add a OPUS card to an existing Ticketbooth");
				System.out.println("8.Update the expiry date of an existing OPUS card");
				System.out.println("9. Add Tickets to a Ticketbooth");
				System.out.println("0. To quit");
				
			  System.out.println("\nPlease enter your choice and press <Enter>:");
				user_input = scan.nextInt();}
				
				boolean End = false; //for case 0 when user inputs 0 Program ends
				
			do {	
				switch (user_input) 
				{
				
				case 0: //case of the program ending
					
                    System.out.println("Thank you for using Concrodia Fall Geek's Ticketbooth application");
                    End = true;
                    scan.close(); //make eclipse happy :)
                    
                    break;
                    
				case 1: // for this case the program displays content of each ticketbooth
					
					System.out.println("Ticketbooth #0: \n"+ ticketbooth_0.toString());
					
			        System.out.println("Ticketbooth #1: \n"+ ticketbooth_1.toString());
			        
			        System.out.println("Ticketbooth #2: \n"+ ticketbooth_2.toString());
			        
			        System.out.println("Ticketbooth #3: \n"+ ticketbooth_3.toString());
			        
			        System.out.println("Ticketbooth #4: \n"+ ticketbooth_4.toString());
			        
                    break;
                    
				case 2:
					
					System.out.print("Which  Ticketbooth  do  you  want  to  see  the  content  of?  (Enter  number  0  to  4): ");
					
                    int user_Ticketbooth_choice = scan.nextInt();
                    
                    //user validity for ticketbooth choice
                    while(user_Ticketbooth_choice > 4 || user_Ticketbooth_choice < 0 )
                    {
                        System.out.print("Sorry but there is no Ticketbooth number" + user_Ticketbooth_choice + "\n-->Try again: (Enter number 0 to 4)");
                        
                        user_Ticketbooth_choice = scan.nextInt();
                    }
                    
                    chosen_array(TicketBooth_Array[user_Ticketbooth_choice]);
                    
                    break;
                    
				case 3: //in this case we display the ticketbooths with the same total value
	                 
					for (int i=0; i<TicketBooth_Array.length; i++) //using nested for loops to compare the ticketbooths total value
			        {
			            for (int j=i+1; j<TicketBooth_Array.length; j++)
			            {
			                if (TicketBooth_Array[i].Value_of_Tickets_Compared(TicketBooth_Array[j]))
			                	
			                    System.out.println("Ticketbooths " + i + " and " + j + " both have " + TicketBooth_Array[i].Tickets_Total_Value() + "\n");
			            }
			        }
	      
	                    break;

				case 4: //in this case we display the ticketbooths with the same ticket distribution
	                    
					for (int i=0; i<TicketBooth_Array.length; i++) //using nested for loops to compare the ticketbooths ticket arrangement
			        {
			            for (int j=i+1; j<TicketBooth_Array.length; j++)
			            {
			                if (TicketBooth_Array[i].Ticket_Type_Compared(TicketBooth_Array[j]))
			                {
			                    System.out.println("Ticketbooths " + i + " and " + j + " both have " + TicketBooth_Array[i].tickets.toString() + "\n");

			                }
			            }
			        }

	                    System.out.println();
	                    break;

				case 5: //in this case we display the ticketbooths that are exactly the same
	                 
					 for (int i=0; i<TicketBooth_Array.length; i++)
				        {
				            for (int j=i+1; j<TicketBooth_Array.length; j++)
				            {
				                if (TicketBooth_Array[i].equals(TicketBooth_Array[j]))
				                    System.out.println("Ticketbooths " + i + " and " + j + "\n");
				            }
				        }
					 
	                    break;
	                    
				case 6://in this case we add an OPUS card to any ticketbooth depending on the user input
					
                    System.out.print("Which Ticketbooth do you want to add a OPUS card to? (Enter number 0 to 4): ");
                        
                    int input_which_TicketBooth = scan.nextInt();
                    
                   
                    while(input_which_TicketBooth > 4 && input_which_TicketBooth < 0)  //user validity check
                    	
                    {
                        System.out.print("input not between 0 and 4 \n Try again: ");
                        
                        input_which_TicketBooth = scan.nextInt();
                    }
                    
                    //info to complete transaction
                    System.out.print("Please enter the following information so that we may complete the transaction-" +
                            "\n  -->  Type  of  OPUS  card  (STL,  RTL,  etc  ..): ");
                    
                    String type_of_card = scan.next();
                    
                    scan.nextLine(); //extra scan to fix input bug
                    
                    System.out.print("  -->  Full  name  on  OPUS  card: ");
                    String name = scan.nextLine();
                    
                    System.out.print("  -->  Expiry  month  number  and  year  (seperate  by  a  space): ");
                    int month_of_card = scan.nextInt();
                    int year_of_card = scan.nextInt();

                    //using an external method (below) to add Opus cards.
                    add_OPUScard(TicketBooth_Array[input_which_TicketBooth],
                    new OPUScard(type_of_card,name,month_of_card,year_of_card));

                    break;
                    
				case 7://in this case we remove an OPUS card from any ticketbooth depending on the user input
					
                    System.out.print("Which Ticketbooth do you want to remove a OPUS card from? (Enter number 0 to 4): ");
                    
                    int remove = scan.nextInt();
                    
                   
                    while(remove > 4) //user validity check
                    {
                        System.out.print("input not between 0 and 4 \n  Try again: ");
                        remove = scan.nextInt();
                    }
                    
                    System.out.print("(Enter a card number 0 to 4):");
                    int number = scan.nextInt();
                    
                    
                    Remove_Opus_From_Ticketbooth(TicketBooth_Array[remove], number);
                    
                    break;
                    
				case 8: //we update the chosen Opus Card's expiry date from any Ticketbooth
					
                    System.out.print("Which Ticketbooth do you want to update a OPUS card from? (Enter number 0 to 4): ");
                    int update = scan.nextInt();                    
                    
                    while(update > 4) //user validity
                    {
                        System.out.print("input not between 0 and 4 \n  Try again: ");
                        update = scan.nextInt();
                    }

                    int range = TicketBooth_Array[update].Number_OpusCards()-1;
                    
                    if(range<0)
                    {	
                        System.out.println("This Ticketbooth does not have any card(s)\n");
                        continue;
                    }

                    System.out.print("Which card do you want to update? (Enter card number 0 to "+range+"):");
                    int choice = scan.nextInt();
                    while(choice>range)
                    {
                        System.out.print("Sorry  but  there  is  no  card  number " + choice +
                                "\n-->  Try  again:\n(Enter card number 0 to "+range+"):");
                        choice = scan.nextInt();
                    }

                    System.out.print("-->  Enter  new  expiry  month  number  and  year  (seperate  by  a  space): ");
                    int newMonth = scan.nextInt();
                    int newYear = scan.nextInt();
                    
                    //call method called updateCard(see info about method below)
                    //updateCard(TicketBooth_Array[update], choice,newMonth,newYear);
                    if (choice<TicketBooth_Array[update].Number_OpusCards()) {
                    	TicketBooth_Array[update].Update_ExpiryDate(newMonth, newYear, TicketBooth_Array[update].Opus_Array[choice]);
                    	System.out.println("Updated!");
                    }
                    else 
                    {
                    	System.out.print("three legged hooker in a KFC parking lot at 3 AM on a hot Sunny Sunday");
                    }
                    break;
                    
				case 9: // program updates the number of tickets in the desired ticketbooth based on the user's input 
                    System.out.print("Which  Ticketbooth  do  you  want  to  add  Tickets  to?  (Enter  number  0  to  4): ");
                    int tb = scan.nextInt();

                    while(tb>4){
                        System.out.print("Number is not between 0 and 4! \n-->Try again: ");
                        tb = scan.nextInt();
                    }

                    System.out.print("How  many  regular,  junior,  senior,  daily  and  weekly  do  you  want  to  add? " +
                            "\nEnter 5 numbers seperated by a space): ");
                    
                    //call method called addTick(see info about method below)
                    TicketBooth_Array[tb].Add_Tickets_To_TicketBooth(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()) ;

                    break;
	            }
				
				System.out.println("Thank you for using Concordia Fall Geek's Ticketbooth application");
				
		
	}while(End = true);
			
	}

	//Used Methods for some cases
	
	//method of case 6
	
	 public static void add_OPUScard(Ticketbooth chosenTicketbooth, OPUScard new_card)
	 
	    {
	        OPUScard temporaryCard = new OPUScard(new_card);
	        
	        System.out.println("You now have "+chosenTicketbooth.addOpusCard(temporaryCard)+" card(s)!");
	    }
	 
	 //method of case 7
	 public static void Remove_Opus_From_Ticketbooth(Ticketbooth chosenTicketbooth, int i)
	 {
	        if(chosenTicketbooth.Number_OpusCards()==0) //check if Opus Card Array is null (empty)
	        {
	            System.out.println("No cards in this TicketBooth\n");
	        }
	        
	        else if( i < chosenTicketbooth.Number_OpusCards()) //check if Opus Card Array is full
	        {
	           chosenTicketbooth.Remove_Opus_Card(chosenTicketbooth.Opus_Array[i]);
	        }
	        
	        else
	        {
	           System.out.println("Wrong Index");
	        }

	    }
	 
	
	
	 
}

