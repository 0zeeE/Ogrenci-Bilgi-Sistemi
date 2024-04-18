package ourProject;

public class Courses {

	private String courseName;
	private String courseCode;
	private double generalNote;
	private double visaNote;
	private double finalNote;
	private int credit;
	private double successNote;
	private String letterNote;
	private boolean isOverGraduate;
	
	private Areas classroomLoc = new Areas(); //Spesifik dersin dersliğini gösteren bir obje
	
	
	//Constructor
	/*
	*Buradaki constructor sadece Lecturers ve Students constructor'ına gönderilecek değerler için böyle tanimlandi.	
	*/
	public Courses(String courseName,String courseCode, int credit, boolean isOverGraduate) {
		
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.credit = credit;
		this.isOverGraduate = isOverGraduate;
	}

	//Getters and Setters
	public String getCourseName()
	{
		return courseName;
	}
	
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	
	public String getCourseCode()
	{
		return courseCode;
	}
	
	public void setCourseCode(String courseCode)
	{
		this.courseCode = courseCode;
	}
	
	public String getClassroomLoc() //HAZIR //Dersin Dersliğini Alan metot
	{
		return classroomLoc.getStudentClass();
	}
	
	public void setClassroomLoc(String location) //HAZIR
	{
		classroomLoc.setStudentClass(location);
	}
	
	public double getGeneralNote() {
		return generalNote;
	}

	public void setGeneralNote(double generalNote) {
		this.generalNote = generalNote;
	}

	public double getVisaNote() {
		return visaNote;
	}

	public void setVisaNote(double visaNote) {
		this.visaNote = visaNote;
	}

	public double getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(double finalNote) {
		this.finalNote = finalNote;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public double getSuccessNote() //GPA hesabında kullanılmak için çağırılacak bir metot.
	{
		return successNote;
	}

	public boolean isOverGraduate() { //Bu Lisans ve Lisansüstü derslerin çakışıp aynı anda alınmaması için tasarlanmış bir blok.
		return isOverGraduate;
	}

	public void setOverGraduate(boolean isOverGraduate) { //Derslerin Lisans mı yoksa Lisansüstü için mi yapıldığını değiştiren metot.
		this.isOverGraduate = isOverGraduate;
	}
	
	//Methods
	
	public void calcletterNote()//HAZIR  //Genel ortalama bulunduktann sonra genel harf notu ve GPA hesabı için başarı notunu hesaplayan bir metot.
	{
		double genNote = getGeneralNote();
		if(genNote >= 90 && genNote <= 100) 
		{
			successNote = 4.00;
			letterNote = "AA";
		}
		else if(genNote >= 85 && genNote <= 89) 
		{
			successNote = 3.50;
			letterNote = "BA";
		}
		else if(genNote >= 80 && genNote <= 84) 
		{
			successNote = 3.00;
			letterNote = "BB";
		}
		else if(genNote >= 75 && genNote <= 79) 
		{
			successNote = 2.50;
			letterNote = "BC";
		}
		else if(genNote >= 65 && genNote <= 74) 
		{
			successNote = 2.00;
			letterNote = "CC";
		}
		else if(genNote >= 60 && genNote <= 64) 
		{
			successNote = 1.50;
			letterNote = "DC";
		}
		else if(genNote >= 55 && genNote <= 59) 
		{
			successNote = 1.00;
			letterNote = "DD";
		}
		else if(genNote >= 50 && genNote <= 54) 
		{
			successNote = 0.50;
			letterNote = "FD";
		}
		else if(genNote >= 0 && genNote <= 49) 
		{
			successNote = 0.00;
			letterNote = "FF";
		}
		
		
	}
	
	public String getLetterNote()//HAZIR //Öğrenci için döndürülecek bir bilgi sistemi.
	{
		return letterNote;
	}
	
	public void courseInformation()
	{
		System.out.println("Course name: "+getCourseName());
		System.out.println("Course code: ");
		System.out.println("Course credit: "+getCredit());
		System.out.println();
	}
	
	
	
	
	
	
	
}
