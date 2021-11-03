package student.com.xworkz.xworkzapp.studentdDAO;

import student.com.xworkz.xworkzapp.studentDTO.StudentDto;

public interface StudentDao {
	public void addStudentsDetails(StudentDto dto);

	public void displayAll();

	public void displayByEmial(String email);

	public void updateByUSN(String studentUSN,String location);

	public void updateByName(String studentName,long phoneNo);
	public void deleteByStudentName(String studentName);
}
