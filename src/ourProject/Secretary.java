package ourProject;

public class Secretary extends Staff {
	
	Student student;
	Lecturers Lecturer;
	Courses Course;

	public Secretary(String name_surname, String id, int workingHour, String staffType, Areas staffLocation) {
		super(name_surname, id, workingHour,staffType,staffLocation);		
	}
	
	@Override
	public void personalInformation()
	{
		System.out.println("Name and Surname: "+getName_Surname());
		System.out.println("ID: "+getID());
		System.out.println("Working hours: "+getWorkingHour());
		System.out.println("Staff type: " +getStaffType());
		System.out.println("Office No: "+ staffLocation.getOffice() ); //Secretary için  getOffice değerini atadım şimdilik
	}
	
	public void setCourseLecturer() //Seçilecek dersin hocasını ayarlamak için
	{
		
	}
	public void setCourseClass() // Atanacak derslerin sınıf yerlerini ayarlamak için modifiye edilecek
	{
		
	}
	public void setSocialArea() //Staff üyelerinin konumlarını değiştirmek için
	{
		
	}
	
	public void setStudentCourse(Student student, Courses Course) //Öğrenciyi bir derse atama yapmak için
	{
		
	}
	
	public void removeStudentFromCourse(Student student, Courses Course) //Öğrenciyi bir dersten çıkarmak için
	{
		
	}
	
	public void setCourseTeacher(Lecturers Lecturer, Courses Course) //Öğretmeni verilen derse atama yapmak için kullanılacak.
	{
		
	}
	
	
	
	
}
