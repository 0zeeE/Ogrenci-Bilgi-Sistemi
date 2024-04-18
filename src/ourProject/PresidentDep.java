package ourProject;

public class PresidentDep extends Akademic {

	//Constructor
	public PresidentDep(String name_Surname, String id, String department) {
		super(name_Surname, id, department);
		
	}
	
	
	@Override
	public void personalInformation()
	{
		System.out.println("Name and Surname: "+getName_Surname());
		System.out.println("ID: "+ getID());
		System.out.println("Type: President of Department");
		System.out.println("Department: "+getDepartment());
	}
	
	public void giveDegree() //Başkan şartları sağlayan öğrencilere diplomalarını verecek.
	{
		
	}
	

	
	
}
