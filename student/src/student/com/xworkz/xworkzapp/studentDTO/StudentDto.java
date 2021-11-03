package student.com.xworkz.xworkzapp.studentDTO;

public class StudentDto {
	private String studentName;
	private String studentUSN;
	private String location;
	private long phoneNo;
	private String email;
	public StudentDto(String studentName, String studentUSN, String location, long phoneNo, String email) {
		super();
		this.studentName = studentName;
		this.studentUSN = studentUSN;
		this.location = location;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentUSN() {
		return studentUSN;
	}
	public void setStudentUSN(String studentUSN) {
		this.studentUSN = studentUSN;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
