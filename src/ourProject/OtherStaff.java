package ourProject;

public class OtherStaff extends Staff {

	
	
	//Constructor
	public OtherStaff(String name_surname, String id, int workingHour, String staffType, Areas staffLocation) {
		super(name_surname, id, workingHour,staffType,staffLocation);		
	}
	
	
	
	@Override
	public void personalInformation()
	{
		System.out.println("Name and Surname: "+getName_Surname());
		System.out.println("ID: "+getID());
		System.out.println("Working hours: "+getWorkingHour());
		System.out.println("Staff type: " +getStaffType());
		System.out.println("Work Area: "+ staffLocation.getSocialArea() ); //Staff için socialArea değerini atadım şimdilik
	}
	
	
	
	
}
