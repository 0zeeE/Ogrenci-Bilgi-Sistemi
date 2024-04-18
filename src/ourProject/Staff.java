package ourProject;

public abstract class Staff extends University {
	
	
	private String staffType;
	private int workingHour;
	
	
	Areas staffLocation = new Areas();
	
	//Constructor
	public Staff(String name_surname, String id, int workingHour,String staffType, Areas staffLocation)
	{
		super(name_surname,id);
		this.workingHour = workingHour;
		this.staffType = staffType;
		this.staffLocation = staffLocation;
	}
	
	//Getter and Setter
	
	public int getWorkingHour()
	{
		return workingHour;
	}
	
	public void setWorkingHour(int workingHour)
	{
		this.workingHour = workingHour;
	}
	
	public String getStaffType()
	{
		return this.staffType;
	}
	public void setStaffType(String staffType)
	{
		this.staffType = staffType;
	}
	
	//Burada yaptığım Areas objesinden çekeğim konumun bilgisini almak
	public String getStaffLocation()
	{
		return staffLocation.getSocialArea();
	}
	//Burada yaptığım Areas objesinden çekeğim konumun bilgisini değiştirmek
	public void setStaffLocation(String locale)
	{
		 staffLocation.setSocialArea(locale);
	}
	 
	
	
	//Other Methods
	
	


}
