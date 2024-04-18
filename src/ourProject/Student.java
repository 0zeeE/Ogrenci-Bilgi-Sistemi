package ourProject;
import java.util.Scanner;


public class Student extends Akademic {

	

	private int studentType; // 1-> under 2-> Master 3->Doctoral
	// STUDENT TYPE BU SEKILDE ALIYORUM KI DERSLERIN TIPLERI TANIMLANIRKEN DERS ESLESMESI YAPTIRILSIN.
	
	private int courseCount = 0; //courseCount bir öğrencinin alabileceği max dersi sayacak bir int olacak. Bir kontrol sistemi ile denetlenecek.
	
	private  Scanner input = new Scanner(System.in);
	
	private Courses[] courseList = new Courses[50];  //Maksimum kurs sayısını 50 belirledim. Duruma göre değiştirilebilir.
	//private Areas[] classrooms = new Areas[20]; // Maksimum derslik sayisini 20 belirledim. Duruma göre değiştirilebilir. IMPLEMENT EDILMELI
	
	
	
	

	//Constructor
	public Student(String name_Surname, String id, String department,int studentType ) {
		super(name_Surname, id, department);
		this.studentType = studentType ;
	}
	
	
	
	//Getters and setters
	public int getStudentType() {  //Numerik dönüşüm için
		return studentType;
	}

	
	public void setStudentType(int studentType) {
		this.studentType = studentType;
	}

	//Tanımlanacak bir courses array'i ile burasını kontrol etmeyi düşünüyorum arkadaşlar.
	public Courses getCourse(int i) {
		return courseList[i];
	}
	
	public int getCourseCount()
	{
		return courseCount;
	}

	//Methods
	
	//HAZIR
	public void setCourse() { //Bu fonksiyon el ile girilip oluşturulacak dersler için kullanılıyor.
		
		String name;
		String courseCode;
		int credit;
		int b;
		boolean isOverGraduate;
		
		System.out.println(getName_Surname() + " Ogrencisine:");
		System.out.println("Girilecek dersin adi: ");   //nextLine komutu /n escape operatörü bulana kadar çalışan bir komut. input.nextInt şeklinde kullansa idim
		name = input.nextLine(); 					  //nextint metodunu /n olarak alıp diğer input u almaya giderdi.
		System.out.println("Girilecek dersin kodu: ");
		courseCode = input.nextLine();
		System.out.println("Dersin Kredisi: ");
		credit =Integer.parseInt(input.nextLine()); //input.nextLine();
		System.out.println("Lisans(1) YüksekLisans(2)");
		
		b = Integer.parseInt(input.nextLine()); //input.nextLine();
		
		if(b == 1){ isOverGraduate = false; }
		else {isOverGraduate = true;}
		
		if(courseCount > 9)
		{
			System.out.println("Ogrenci alacagi maksimim ders sayisini aliyor");
		}
		else
		{
			courseList[courseCount] = new Courses(name,courseCode,credit,isOverGraduate);
			courseCount++;
		}
		
		
		
	}
	//HAZIR
	public void setObCourse(Courses course) //Bu direkt Main üzerinde Courses Class oluşturulduktan sonra Courses Class'ını Student Class objesine atıyor.
	{
		
		
		if(courseCount > 9)
		{
			System.out.println("Ogrenci alacagi maksimim ders sayisini aliyor");
		}
		else
		{
			courseList[courseCount] = course;
			courseCount++;
			
		}
	}
	
	public void setCourseClassroom(String location, int i)
	{
		courseList[i].setClassroomLoc(location);
	}
	
	public String getCourseClassroom(int i)
	{
		return  courseList[i].getClassroomLoc();
	}
	
	//HAZIR
	public void displaySelCourse(int i) //HAZIR
	{
		System.out.println(getName_Surname() +" Ogrencisinin aldigi ders bilgisi: ");
		System.out.println("Course name: "+courseList[i].getCourseName());
		System.out.println("Course code: "+courseList[i].getCourseCode());
		System.out.println("Course credit: "+courseList[i].getCredit());
		System.out.println("Is this course OverGraduate: "+courseList[i].isOverGraduate());
		System.out.println();
	}
	
	public void setVisaNote(int note, int i) //HAZIR //Öğrencinin vize notunu ayarlar.
	{
		courseList[i].setVisaNote(note);
	}
	
	public double getVisaNote(int i) //HAZIR
	{
		return courseList[i].getVisaNote();
	}
	
	public void setFinalNote(int note, int i) //HAZIR
	{
		courseList[i].setFinalNote(note);
	}
	
	public double getFinalNote(int i)  //HAZIR
	{
		return courseList[i].getFinalNote();
	}
	
	public void calcCourseNote(int i) //HAZIR //i degeri courseList adındaki course object arrayinin elemanlarını belirten bir tamsayı. Bu kullanıcıdan alınacak bir sayi. 
	{
		double genNote = courseList[i].getVisaNote() * 0.6 + courseList[i].getFinalNote() * 0.4;
		courseList[i].setGeneralNote(genNote);
		courseList[i].calcletterNote();
	}
	
	public double getCourseNote(int i) //HAZIR
	{
		return courseList[i].getGeneralNote();
	}
	
	public String getLetterNote(int i) //HAZIR
	{
		return courseList[i].getLetterNote();
	}
	
	public void calcGPA() //HAZIR //President dep ayrıca her seferinde güncel GPA kullansın diyorsanız bunu da gönderebilirsiniz.
	{
		double totalPoints = 0;
		double totalCredits = 0;
		double tempGPA = 0;
		
		for(int i =0; i< courseCount;i++)
		{
			totalPoints += courseList[i].getSuccessNote() * courseList[i].getCredit();
			totalCredits += courseList[i].getCredit();
		}
		tempGPA = totalPoints/totalCredits;
		
		setGPA(tempGPA);
		
	
	}
	
	
	




	//Methods
	@Override
	public void personalInformation() //HAZIR
	{
		System.out.println("Name and Surname: "+getName_Surname());
		System.out.println("ID: "+ getID());
		System.out.println("Total number of courses taken: " +getCourseCount()); //Daha tanımlanmadı.
		System.out.println("GPA: "+getGPA());
		System.out.println("Department: "+getDepartment());
	}



	
}
