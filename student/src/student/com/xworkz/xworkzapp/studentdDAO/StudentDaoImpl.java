package student.com.xworkz.xworkzapp.studentdDAO;

import student.com.xworkz.xworkzapp.studentDTO.StudentDto;

public class StudentDaoImpl implements StudentDao{
StudentDto[] studentDetails=new StudentDto[5];
int index=0;


	@Override
	public void addStudentsDetails(StudentDto dto) {
		studentDetails[index]=dto;
		index++;
		
	}

	@Override
	public void displayAll() {
		for(int i=0;i<index;i++) {
			if(studentDetails!=null) {
				System.out.println("Student Details are :"+studentDetails[i].getStudentName()+" "+studentDetails[i].getStudentUSN()+" "+
						studentDetails[i].getEmail()+" "+studentDetails[i].getPhoneNo()+" "+studentDetails[i].getLocation());
		}
		}
	}

	@Override
	public void displayByEmial(String email) {
		for(int i=0;i<index;i++) {
			if(studentDetails[i].getEmail()==email) {
				
				System.out.println("Student Details are :"+studentDetails[i].getStudentName()+" "+studentDetails[i].getStudentUSN()+" "+
						studentDetails[i].getEmail()+" "+studentDetails[i].getPhoneNo()+" "+studentDetails[i].getLocation());
			}
	}
	}

	@Override
	public void updateByUSN(String studentUSN,String location) {
		for(int i=0;i<index;i++) {
			if(studentDetails[i].getStudentUSN()==studentUSN) {		
				studentDetails[i].setLocation(location);
	}
		}
	}

	@Override
	public void updateByName(String studentName,long phoneNo) {
		for(int i=0;i<index;i++) {
			if(studentDetails[i].getStudentName()==studentName) {		
				studentDetails[i].setPhoneNo(phoneNo);
	}
		}
	}

	@Override
	public void deleteByStudentName(String studentName) {
		for(int i=0;i<index;i++) {
			if(studentDetails[i].getStudentName()==studentName) {
				studentDetails[i]=null;
			}
	}

}
}
