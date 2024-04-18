package ourProject;
import java.util.Scanner;

public class Lecturers extends Akademic {

	private Areas lecturerLocation;
	private Student student;
	private int courseCount = 0; //Öğretmenlerin alabileceği maksimum ders miktarını hesaplamak için sayaç eklendi. Kodlar içinde ayarlanmalı.
	Scanner input = new Scanner(System.in);
	
	private Courses courseList[] = new Courses[10];
	
	
	//Constructor
	public Lecturers(String name_Surname, String id, String department, String lecturerOffice) {
		super(name_Surname, id, department);
		this.lecturerLocation.setOffice(lecturerOffice);
		
	}
	
	
	//Getters and setters
	public Areas getLecturerLocation() { //Hocanın dersliğini gösteren metot.
		return lecturerLocation;
	}

	public void setLecturerLocation(Areas lecturerLocation) { //Hocanın dersliğini ayarlayan metot
		this.lecturerLocation = lecturerLocation;
	}

	/*
	public Student getStudent() { //Bunlar secretary metoduna benziyor. Gecenin geç saatinde beynim yandı. Mantık yoksa silebiriz
		return student;
	}

	public void setStudent(Student student) {  //Bunlar secretary metoduna benziyor. Gecenin geç saatinde beynim yandı. Mantık yoksa silebiriz
		this.student = student;
	}

	 */
	
	public int getGivenCourses()  //Burada düşündüğüm şey for döngüsü içinde öğretmenin verdiği dersleri yazdırmak.
	{
		return courseCount;
	}

	/*
	public void setGivenCourses(int givenCourses) { 
		this.givenCourses = givenCourses;
	}
	*/
	

	//Methods
	@Override
	public void personalInformation()
	{
		System.out.println("Name and Surname: "+getName_Surname());
		System.out.println("ID: "+ getID());
		System.out.println("Total number of courses given: "+ getGivenCourses()); //Daha tanımlanmadı.
		System.out.println("Department: "+getDepartment());
		System.out.println("Office room number: "+lecturerLocation.getOffice()); //Ofis çağırma yeri burası.
	}
	
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
			System.out.println("Ogretmen verebilecegi maksimum dersi vermektedir.");
		}
		else
		{
			courseList[courseCount] = new Courses(name,courseCode,credit,isOverGraduate);
			courseCount++;
		}
		
	}
	
	public void setObCourse(Courses course) //Bu direkt Main üzerinde Courses Class oluşturulduktan sonra Courses Class'ının elementini Lecturers Class objesine atıyor.
	{
		
		
		if(courseCount > 9)
		{
			System.out.println("Ogretmen verecegi maksimim ders sayisini veriyor");
		}
		else
		{
			courseList[courseCount] = course;
			courseCount++;
			
		}
	}
	
	/*
	 * Student nesnesinin içinde çoğu işlem durur vaziyette. Buradaki kurs ekleme ve çıkarma işlemleri sekreter için ayrılmış haldedir.
	 * 
	 * 
	 */
	
	
	//public void

	
	
	

}
