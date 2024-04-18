package ourProject;

public class MainTest {

	public static void main(String[] args) {
		
		
		Courses BM101 = new Courses("Bilgisayar programlama 1","BM101",5,false);
		Courses BM102 = new Courses("Bilgisayar programlama 2","BM102",4,false);
		Courses muzik = new Courses("Muzik Tarihi","tech1",2,false);
		
		
		
		Student s1 = new Student("Ozgur Ertekin","521","Muhendislik", 1 );
		Student s2 = new Student("Betul Ozipek","654","Muhendislik",1);
		Student s3 = new Student("Bahadır xxx","123","Muhendislik",1);
		
		s1.setObCourse(BM101);
		s1.setObCourse(BM102);
		s1.setObCourse(muzik);
		//s1.setCourseClassroom("400", 0);
		//s1.setCourseClassroom("Kesit kafe", 1);
		s1.setVisaNote(60, 0); //BM101 
		s1.setFinalNote(80, 0); //BM101
		s1.setVisaNote(70, 1); //BM102
		s1.setFinalNote(90, 1); //BM102
		s1.setVisaNote(100, 2); //Muzik
		s1.setFinalNote(95, 2); //Muzik
		
		
		//s1.displaySelCourse(0);
		//s1.displaySelCourse(1);
		//s1.displaySelCourse(2);
		//System.out.println(s1.getFinalNote(2));
		//System.out.println(s1.getVisaNote(0));
		
		s1.calcCourseNote(0);
		s1.calcCourseNote(1);
		s1.calcCourseNote(2);
		s1.calcGPA();
		System.out.println();
		System.out.println(s1.getGPA());
	
		
		//s1.personalInformation();
		//System.out.println("BM101 sinif: " + s1.getCourseClassroom(0));
		//System.out.println("BM101 sinif: " + s1.getCourseClassroom(1));
		
		/*
		System.out.println("BM101: " +s1.getLetterNote(0));
		System.out.println("BM102: " +s1.getLetterNote(1));
		System.out.println("BM103: " +s1.getLetterNote(2));
		System.out.println();
		System.out.println("Ogrencinin GPA notu : " + s1.getGPA());
		*/
		//System.out.println(s1.getCourseNote(0));
		
		//s3.setObCourse(randomCourse);
		//s3.setObCourse(randomCurse);
		
		
		//s1.setCourse();
		
		//s1.setCourse();
		
		//s2.setCourse();
		
		//s1.displaySelCourse(0);
		//System.out.println("Diger ders");
		//s1.displaySelCourse(1);
		//System.out.println("Diger ders");
		//s2.displaySelCourse(0);
		
		//s3.displaySelCourse(0);
		//s3.displaySelCourse(1);
		
		
		
		//Tüm nesneler oluşturulduktan sonra final sekreter ve başkan şifresi ve bilgileri burada yazılacak.
		//Sistemin çalışma yeri burasıdır.

		
				
				
	}

}
