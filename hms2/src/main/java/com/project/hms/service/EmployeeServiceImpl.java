/*
package com.project.hms.service;

import com.project.hms.model.Employee;
import com.project.hms.repository.EmployeeRepository;
import com.project.hms.util.PasswordUtil;
import org.springframework.stereotype.Service;

import java.util.List;

*/
/*@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){

        this.employeeRepository = employeeRepository;
    }
    @Override
    public void saveEmployee(Employee employee) {
        String password = PasswordUtil.encodePassword(employee.getPassword());
        employee.setPassword(password);
        employeeRepository.save(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        String password = PasswordUtil.encodePassword(employee.getPassword());
        employee.setPassword(password);
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) employeeRepository.findAll();
    }
}*/

