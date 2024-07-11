package com.sp.main.NamedQuery2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.sp.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("main-persistence");
       EntityManager em=emf.createEntityManager();
       
       try {
    	   
    	TypedQuery<Employee> query = em.createNamedQuery("Allemployeedetails", Employee.class);
       	List<Employee> std_list = query.getResultList();
       	for(Employee std : std_list)
       	{
       		System.out.println("Id : "+std.getEmployee_id());
       	
       		System.out.println("-----------------------------");
       	}
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
    }
}
