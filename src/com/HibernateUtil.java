package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	public static void main(String arg[])
	{
		try
		{
			Configuration config=new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			Transaction tran=session.beginTransaction();
			com.Student std=new com.Student();
			std.setStudentId(1002);
			std.setStudentName("vishal");
			std.setFees(88888);
			session.save(std);
			tran.commit();
			
			System.out.println("Student Record Saved");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}