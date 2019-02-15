package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class update 
{
	public static void main(String arg[])
	{
		try
		{
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			Student student=(Student)session.get(Student.class,1001);
			
			Transaction tran=session.beginTransaction();
			student.setStudentName("tejas");
			session.update(student);
			tran.commit();
			
			session.close();
			
			System.out.println("Student Object is Updated");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}