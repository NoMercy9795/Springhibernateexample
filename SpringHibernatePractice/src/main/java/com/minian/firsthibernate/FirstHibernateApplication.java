package com.minian.firsthibernate;

import com.minian.firsthibernate.dao.EmployeeDao;
import com.minian.firsthibernate.model.Address;
import com.minian.firsthibernate.model.Employee;
import com.minian.firsthibernate.model.Phone;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstHibernateApplication {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeDao employeeDao = context.getBean(EmployeeDao.class);
        Employee e = new Employee();
        e.seteName("NoMercy");
        e.seteAddr("github.com");
        e.seteNumber(97957373);





        Address a   = new Address();
        a.setCity("Bti");
        a.setStreetNo(9795);
//        e.setAddress(a.getId());
        e.setAddress(a);

        Phone p   = new Phone();
        Phone p1   = new Phone();
        p.setNumber(95737362);
        p1.setNumber(79851874);
        Set<Phone> phones = new HashSet<Phone>();
        phones.add(p);
        phones.add(p1);
        e.setPhone(phones);
        System.out.println("x hx");
        employeeDao.save(e);
        System.out.println("x exehx");
//        employeeDao.delete(2);
        List<Employee> employees = employeeDao.getAllEmployees();
//        employeeDao.delete();
        for (Employee employee : employees){
            System.out.println(employee);
        }
//        employeeDao.update(4);
        context.close();

    }

}
