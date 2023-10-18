package dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dto.Student;

@Component
public class StudentDao
{
	@Autowired
	EntityManager manager;

	public void save(Student student)
	{
		manager.getTransaction().begin();
		manager.persist(student);
		manager.getTransaction().commit();
		
	}
	public  List<Student> fetch()
	{
		return manager.createQuery("select x from Student x").getResultList();
	}
	
	public Student fetch(int id)
	{
		return manager.find(Student.class, id);
		
	}
	public void update(Student student)
	{
		manager.getTransaction().begin();
		manager.merge(student);
		manager.getTransaction().commit();
	}
	
	public void delete(Student student) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.remove(student);
		manager.getTransaction().commit();
	}



}
