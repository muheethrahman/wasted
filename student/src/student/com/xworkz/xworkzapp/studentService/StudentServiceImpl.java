package student.com.xworkz.xworkzapp.studentService;

import student.com.xworkz.xworkzapp.studentDTO.StudentDto;
import student.com.xworkz.xworkzapp.studentdDAO.StudentDao;
import student.com.xworkz.xworkzapp.studentdDAO.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
private StudentDao studentDao=new StudentDaoImpl();
	@Override
	public void addStudentsDetails(StudentDto dto) {
		if (dto.getStudentName() != null) {
			studentDao.addStudentsDetails(dto);
		}
		else {
			System.out.println("enter the details ");
		}		
	}

	@Override
	public void displayAll() {
		studentDao.displayAll();
	}

	@Override
	public void displayByEmial(String email) {
		studentDao.displayByEmial(email);		
	}

	@Override
	public void updateByUSN(String studentUSN,String location) {
		studentDao.updateByUSN(studentUSN, location);		
	}

	@Override
	public void updateByName(String studentName,long phoneNo) {
		studentDao.updateByName(studentName, phoneNo);		
	}

	@Override
	public void deleteByStudentName(String studentName) {
		studentDao.deleteByStudentName(studentName);		
	}

}
