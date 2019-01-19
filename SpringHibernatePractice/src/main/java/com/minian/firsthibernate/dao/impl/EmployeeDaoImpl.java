package com.minian.firsthibernate.dao.impl;
import com.minian.firsthibernate.dao.EmployeeDao;
import com.minian.firsthibernate.model.Employee;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
public class EmployeeDaoImpl implements EmployeeDao {
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private SessionFactory sessionFactory;


    public void save(Employee e) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(e);
        tx.commit();
        session.close();


    }
//    public Employee getUserById(Long user_id) {
//        Session session = null;
//        Employee user = null;
//        try {
//            session = HibernateUtil.getSessionFactory().openSession();
//            user =  session.get(Employee.class,user_id);
//            Hibernate.initialize(user);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (session != null && session.isOpen()) {
//                session.close();
//            }
//        }
//        return user;
//    }


//    @SuppressWarnings("unchecked");
    public List<Employee> getAllEmployees() {
        Session session = this.sessionFactory.openSession();
        List<Employee> employees = (List<Employee>)session.createQuery("from Employee").list();
        session.close();
        return employees;

    }

    public Boolean delete(int eId) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Employee e = (Employee) session.load(Employee.class,eId);
        if(e!= null){
            session.delete(e);
        }
        tx.commit();
        session.close();
        return true;
    }
    public Boolean update(int e1) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Employee e = (Employee) session.load(Employee.class,e1);
        e.seteAddr("wgithub.com");
        session.update(e);
        tx.commit();
        session.close();
        return true;
    }

    public Boolean update(Employee e) {
        return null;
    }
}
