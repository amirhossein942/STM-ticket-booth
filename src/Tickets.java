//ticket class
public class Tickets 
{
	//ticket types (later represent the number of tickets of each type)
		private int RegularTicket; //age type tickets
		private int JuniorTicket;
		private int SeniorTicket; 
		
		private int DailyTicket; //duration type tickets
		private int WeeklyTicket;
		
	// Ticket Prices (Static Constants)
		private static final double PriceRegularTicket = 3.50;
		private static final double PriceJuniorTicket = 2.50;
		private static final double  PriceSeniorTicket = 1;
		private static final double PriceDailyTicket = 10;
		private static final double PriceWeeklyTicket = 40;
		
		
		public Tickets() //Default constructor 
		{
			RegularTicket=0;
			JuniorTicket=0;
			SeniorTicket=0;
			DailyTicket=0;
			WeeklyTicket=0;		
		}
		
		//Constructor With 5 integer parameters 
		public Tickets(int RegularTicket, int JuniorTicket, int SeniorTicket, int DailyTicket,int WeeklyTicket ) 
		{
			this.RegularTicket = RegularTicket;
			this.JuniorTicket = JuniorTicket;
			this.SeniorTicket = SeniorTicket; 
			this.DailyTicket = DailyTicket;
			this.WeeklyTicket = WeeklyTicket;
		}
		
		//copy constructor
		Tickets(Tickets copyT)
		{
			this.RegularTicket = copyT.RegularTicket;
			this.JuniorTicket = copyT.JuniorTicket;
			this.SeniorTicket = copyT.SeniorTicket;
			this.DailyTicket = copyT.DailyTicket;
			this.WeeklyTicket = copyT.WeeklyTicket;
		}
		
		//Accessor Method
		public int getRegularTicket() 
		{
			this.RegularTicket = RegularTicket;
			return this.RegularTicket;
		}
		
		public int getJuniorTicket() 
		{
			this.JuniorTicket = JuniorTicket;
			return JuniorTicket;
		}
		
		public int getSeniorTicket() 
		{
			this.SeniorTicket = SeniorTicket;
			return SeniorTicket;
		}
		
		public int getDailyTicket() 
		{
			this.DailyTicket = DailyTicket;
			return DailyTicket;
		}
		
		public int getWeeklyTicket() 
		{
			this.WeeklyTicket = WeeklyTicket;
			return WeeklyTicket;
		}
		
		//Mutators Method
		public void setRegularTicket(int RegularTicket) 
		{
			this.RegularTicket = RegularTicket;
		}
		
		public void setJuniorTicket(int JuniorTicket) 
		{
			this.JuniorTicket = JuniorTicket;
		}
		
		public void setSeniorTicket(int SeniorTicket) 
		{
			this.SeniorTicket = SeniorTicket;
		}
		
		public void setDailyTicket(int DailyTicket) 
		{
			this.DailyTicket = DailyTicket;
		}
		
		public void setWeeklyTicket(int WeeklyTicket) 
		{
			this.WeeklyTicket = WeeklyTicket;
		}
		
		//addTickets Method
		public void addTickets(int RegularTicket,int JuniorTicket,int SeniorTicket,int DailyTicket,int WeeklyTicket) 
		{
			this.RegularTicket += RegularTicket;
			this.JuniorTicket += JuniorTicket;
			this.SeniorTicket += SeniorTicket;
			this.DailyTicket += DailyTicket;
			this.WeeklyTicket += WeeklyTicket;
			
			//return addTickets(RegularTicket, JuniorTicket, SeniorTicket, DailyTicket, WeeklyTicket);
		}
		
		// ticketsTotal method
		public double ticketsTotal() 
		{
			double total;
			total = PriceRegularTicket*RegularTicket+PriceJuniorTicket*JuniorTicket+PriceSeniorTicket*SeniorTicket+PriceDailyTicket*DailyTicket+PriceWeeklyTicket*WeeklyTicket;
			
			return total;
		}
		
		// toString method 
		public String toString() 
		{
			return "Tickets:\n " + " RegularTicket: " + RegularTicket + " JuniorTicket: " +JuniorTicket + " SeniorTicket: " + SeniorTicket + " DailyTicket: " + DailyTicket +" WeeklyTicket: " +  WeeklyTicket ; 
		} 
		
		// equals method
		public boolean equals(Tickets ticket) 
		{
			return RegularTicket==ticket.RegularTicket && JuniorTicket == ticket.JuniorTicket && SeniorTicket == ticket.SeniorTicket && DailyTicket == ticket.DailyTicket&& WeeklyTicket == ticket.WeeklyTicket;
		}
		

	}

