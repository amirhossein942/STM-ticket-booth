
public class OPUScard 
{
	private String name;
	private String card_type;
	private int expiryMonth;
	private int expiryYear;
	
	//default constructor
	public OPUScard() 
	{
	name= null; //null because it's a String
	card_type= null;
	expiryMonth=0;
	expiryYear=0;
	}
	
	//constructor with 4 parameters
	public OPUScard(String card_type, String name, int expiryMonth, int expiryYear) 
	{
		this.card_type = card_type;
		this.name = name;
		this.expiryMonth= expiryMonth;
		this.expiryYear = expiryYear;
	}
	
	
	//copy constructor
		OPUScard(OPUScard copyO)
		{
			this.card_type = copyO.card_type;
			this.name = copyO.name;
			this.expiryMonth= copyO.expiryMonth;
			this.expiryYear = copyO.expiryYear;
		}
	
	//accessor method
	public String getcard_type() 
	{
		this.card_type = card_type;
		return card_type;
	}
	public String getname() 
	{
		this.name = name;
		return name;
	}
	public int getexpiryMonth() 
	{
		this.expiryMonth = expiryMonth;
		return expiryMonth;
	}
	public int getexpiryYear() 
	{
		this.expiryYear = expiryYear;
		return expiryYear;
	}
	
	//mutator method
	
	public void setexpiryMonth(int expiryMonth) 
	{
		if (expiryMonth >= 1 && expiryMonth <= 12)
			this.expiryMonth = expiryMonth;
		
	    else
	        this.expiryMonth = 0;
	}
	public void setexpiryYear(int expiryYear) 
	{
		this.expiryYear = expiryYear;
	}
	
	//toString method
	public String toString() 
	{
        String expirydate;
		
		if(expiryMonth<10)  
		expirydate= "0"+expiryMonth + "/" + expiryYear;
		
		else
			expirydate= expiryMonth+ "/" + expiryYear;
		
		return "You have " + card_type + "Name of the owner:" + name + " The expiry date: "+  expirydate ;
	}
	
	//equals method
	public boolean equals(OPUScard card) 
	{
		return card_type == card.card_type && name == card.name && expiryMonth == card.expiryMonth && expiryYear == card.expiryYear;
	} 

}



