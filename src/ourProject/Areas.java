package ourProject;

public class Areas {

	private String studentClass;
	private String office;
	private String socialArea;
	
	//Constructor
	//Constructor değer almıyor çünkü her çağırılacak alana göre set ayarları yapılacak.
	public Areas() {
		
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSocialArea() {
		return socialArea;
	}

	public void setSocialArea(String socialArea) {
		this.socialArea = socialArea;
	}
	
	
	
	
}
