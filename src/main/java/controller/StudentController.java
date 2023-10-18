package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.StudentDao;
import dto.Student;
import service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	StudentService service;
	@GetMapping("/")
	public String loadHome()
	{
		return "Home";
	}
	@GetMapping("/insert")
	public String loadInsert()
	{
		return "Insert";
	}
	@PostMapping("/insert")
	public String insert(@ModelAttribute Student student,@RequestParam String date,ModelMap map)
	{
		return service.save(student,date,map);
	}
	 @GetMapping("/fetch")
	public String fetch(ModelMap map)
	{
		 return service.fetch(map);
	}
	 @GetMapping("/edit")
		public String edit(@RequestParam int id, ModelMap map)
		{
			return service.edit(id,map);
		}
	 @PostMapping("/update")
	 public String update(@ModelAttribute Student student,@RequestParam String date,ModelMap map)
	 {
		return service.update(student,date,map);
		 
	 }
	 @GetMapping("/delete")
	 public String delete(@RequestParam int id,ModelMap map)
	 {
		return service.delete(id, map);
		 
	 }
}
