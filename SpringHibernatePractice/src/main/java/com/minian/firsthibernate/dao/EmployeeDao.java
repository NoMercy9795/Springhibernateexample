package com.minian.firsthibernate.dao;

import com.minian.firsthibernate.model.Employee;

import java.util.List;

public interface EmployeeDao {
    public void save(Employee e);
    public List<Employee> getAllEmployees();
    public Boolean delete(int eId);
    public Boolean update(int eId);




}
