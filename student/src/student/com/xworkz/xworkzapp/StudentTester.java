package student.com.xworkz.xworkzapp;

import student.com.xworkz.xworkzapp.studentDTO.StudentDto;
import student.com.xworkz.xworkzapp.studentService.StudentService;
import student.com.xworkz.xworkzapp.studentService.StudentServiceImpl;

public class StudentTester {

	public static void main(String[] args) {
StudentDto studentDto1=new StudentDto("Rahman","4ca16cs403","mandya",7676416332l,"muheeth78@gmail.com");
StudentDto studentDto2=new StudentDto("mohammed","4ca16cs401","mandya",7676416332l,"mohammed78@gmail.com");
StudentDto studentDto3=new StudentDto("muheeth","4ca16cs404","mysore",7676416332l,"muheeth78@gmail.com");
StudentDto studentDto4=new StudentDto("nayyer","4ca16cs405","mudder",98040135452l,"nayyer24@gmail.com");
StudentDto studentDto5=new StudentDto("sadiq","4ca16cs406","mandya",8904013848l,"sadiq7@gmail.com");
StudentService studentService=new StudentServiceImpl();
studentService.addStudentsDetails(studentDto1);
studentService.addStudentsDetails(studentDto2);
studentService.addStudentsDetails(studentDto3);
studentService.addStudentsDetails(studentDto4);
studentService.addStudentsDetails(studentDto5);
studentService.displayAll();
studentService.displayByEmial("sadiq7@gmail.com");
studentService.updateByName("nayyer",9449064146l);
studentService.displayAll();
studentService.updateByUSN("4ca16cs401","malavalli");
studentService.displayAll();
studentService.deleteByStudentName("sadiq");
studentService.displayAll();
	}

}
