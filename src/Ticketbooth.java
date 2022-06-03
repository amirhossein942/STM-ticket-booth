import java.util.Scanner;



public class Ticketbooth 
{
    public Tickets tickets;
	public OPUScard [] Opus_Array;
	
	public Ticketbooth() //default constructor
	{
		
	}
	
	public Ticketbooth(Tickets tickets, OPUScard [] Opus_Array) 
	{
		 this.tickets =  tickets;
		 
		 if(Opus_Array!=null) //privacy leak condition
		 {
	            OPUScard [] Opus_Array_Copy = new OPUScard [Opus_Array.length];
	            
	            for (int i = 0; i<Opus_Array.length; i= i + 1)
	            {
	            	Opus_Array_Copy[i] = Opus_Array[i];
	            }
	            
	            
	     this.Opus_Array =  Opus_Array; //setting the object array parameter as its copy
		 }
	}
	
		 public boolean Value_of_Tickets_Compared(Ticketbooth ticketbooth_new)
		 {
		        return (this.tickets.ticketsTotal()==ticketbooth_new.tickets.ticketsTotal());
		 }
		 
		 public boolean Ticket_Type_Compared(Ticketbooth ticketbooth_new)
		 {
		        return(this.tickets.equals(ticketbooth_new.tickets));
		 }
		 
		 public double Tickets_Total_Value()
		 {
		        return this.tickets.ticketsTotal();
		 }
		 
		 public int Number_OpusCards()
		 {
		        return this.Opus_Array.length;
		 }
		 
		 public int addOpusCard(OPUScard newOpusCard)
		 {
		        if(this.Opus_Array==null) //ticketbooth not having any cards
		        {
		            OPUScard[] Opus_Array2 = new OPUScard[1];
		            Opus_Array2[0]= newOpusCard;
		      
		            this.Opus_Array = Opus_Array2;

		            return Opus_Array.length;
		        }
		        
		        
		        OPUScard[] New_Opus_Array = new OPUScard[this.Opus_Array.length + 1]; //add new OPUS card to a ticketbooth
		        
		        for (int i = 0; i < this.Opus_Array.length; i=i+1) 
		        {
		        New_Opus_Array[i] = this.Opus_Array[i];
		        }
		        
		        New_Opus_Array[this.Opus_Array.length] = newOpusCard;
		        this.Opus_Array=New_Opus_Array;
		        return Opus_Array.length; //number of Opus Cards after addition
		 }
		  
		 private boolean contains(OPUScard iterator) 
		    {
		        for(int i=0; i<Opus_Array.length; i++)
		            if (Opus_Array[i]==iterator) 
		            {
		                return true;
		            }

		        return false;
		    }
		 
		 public boolean Remove_Opus_Card(OPUScard remove)
		 {
		  if(contains(remove))
		  {
		    OPUScard[] New_Opus_Array2 = new OPUScard[this.Opus_Array.length-1];
		      
		     for(int i = 0,j = 0;i<this.Opus_Array.length;i=i+1)
		      {
		         if(this.Opus_Array[i]!=remove)
		         {
		           New_Opus_Array2[j= j+ 1]=this.Opus_Array[i];
		         }
		      }
		        
		         this.Opus_Array = New_Opus_Array2;
		         return true;
		    }
		         return false;
		    }
		 
		 public void Update_ExpiryDate(int newMonth,int newYear, OPUScard newCard)
		 {
		   for(OPUScard Verification_Opus_Card:this.Opus_Array)
			   
		      if (Verification_Opus_Card==newCard) 
		        {
		          newCard.setexpiryMonth(newMonth);
		          newCard.setexpiryYear(newYear);
		        }
		  }
		 
		 
		 public double Add_Tickets_To_TicketBooth(int RegularTicket,int JuniorTicket,int SeniorTicket,int DailyTicket,int WeeklyTicket)
		 {
		        this.tickets.addTickets(RegularTicket, JuniorTicket, SeniorTicket,DailyTicket, WeeklyTicket);
		        
		        return this.tickets.ticketsTotal();
		 }
		 
		 public boolean equals(Ticketbooth secondTicketbooth)
		 {
		        return (this.Tickets_Total_Value()==secondTicketbooth.Tickets_Total_Value()&&this.Number_OpusCards()==secondTicketbooth.Number_OpusCards());
		 }
		 
		 private String toString2() 
		 {
		     String string = ""; 
		         if(this.Opus_Array!=null)  //Ticketbooth with cards
		         {

		            for(int j=0; j<Opus_Array.length;j++)
		            {
		               string += Opus_Array[j].toString()+"\n";
		            }
		            
		          }
		         
		       else //Ticketbooth with no cards
		       {
		                string = "No OPUS cards\n";
		       }
		        return string;
		   }
		 
		 
		 public String toString()
		 {
		        return "Details of Tickets: " +this.tickets.toString() + "\n" + "Details of OPUS cards: " + toString2();
		 }
		 
		 public String Tickets_BreakDown()
		 {
		        Tickets Breakdown = new Tickets(this.tickets); 
		        
		        return Breakdown.toString();
          }
	
		}

