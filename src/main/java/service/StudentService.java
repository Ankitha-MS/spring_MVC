package service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import dao.StudentDao;
import dto.Student;

@Component
public class StudentService {
	@Autowired
	StudentDao dao;

	public String save(Student student, String date, ModelMap map) {
		int totalMarks = student.getEnglish() + student.getMaths() + student.getScience();
		double percentage = totalMarks / 3.0;
		String fail = "Fail";
		String firstclass = "FirstClass";
		String secondclass = "SecondClass";
		String distinction = "Distinction";
		if (percentage < 35 || student.getEnglish() < 35 || student.getMaths() < 35 || student.getScience() < 35) {
			student.setResult(fail);
		} else if (percentage > 35 && percentage < 60) {
			student.setResult(secondclass);
		} else if (percentage > 60 && percentage < 85) {
			student.setResult(firstclass);
		} else if (percentage >= 85) {
			student.setResult(distinction);
		}
		student.setPercentage(percentage);
		student.setDob(LocalDate.parse(date));
		dao.save(student);
		map.put("pass", "data stored");
		return "Home";
	}

	public String fetch(ModelMap map) {
		List<Student> list = dao.fetch();
		if (list.isEmpty()) {
			map.put("fail", "data not Found");
			return "Home";
		} else {
			map.put("pass", "data  Found");
			map.put("list", list);
			return "Fetch";
		}
	}

	public String edit(int id,ModelMap map)
	{
		Student student=dao.fetch(id);
		if(student==null)
		{
			map.put("fail", "Data Already Deleted");
			return "Home";
		}
		else
		{
			map.put("student", student);
		    return "Edit";
		}
		
	}
	public String update(Student student, String date, ModelMap map) {
		
		int totalMarks=student.getEnglish()+student.getMaths()+student.getScience();
		double percentage=totalMarks/3.0;
		String fail="Fail";
		String firstclass="FirstClass";
		String secondclass="SecondClass";
		String distinction="Distinction";
		if (percentage<35||student.getEnglish()<35||student.getMaths()<35||student.getScience()<35) 
		{
			student.setResult(fail);
		}
		else if (percentage>35&&percentage<60) 
		{
			student.setResult(secondclass);
		}else if (percentage>60&&percentage<85) 
		{
			student.setResult(firstclass);
		}
		else if(percentage>=85){
			student.setResult(distinction);
		}
		student.setPercentage(percentage);
		student.setDob(LocalDate.parse(date));
		dao.update(student);
		map.put("pass", "data updated successfully");
		List<Student> list = dao.fetch();
		if (list.isEmpty()) {
			map.put("fail", "data not Found");
			return "Home";
		} else {
			map.put("pass", "data  Found");
			map.put("list", list);
			return "Fetch";
		}
	    
	}

	public String delete(int id, ModelMap map) {
		Student student = dao.fetch(id);
		if (student == null) {
			map.put("fail", "Data Already Deleted");
		} else {
			dao.delete(student);
			map.put("pass", "Data Deleted Sucess");
		}

		List<Student> list = dao.fetch();
		if (list.isEmpty()) {
			map.put("fail", "data not Found");
			return "Home";
		} else {
			map.put("pass", "data  Found");
			map.put("list", list);
			return "Fetch";
		}
	}

	

}
