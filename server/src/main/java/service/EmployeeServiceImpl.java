package service;

import domain.Company;
import domain.Employee;
import domain.Vacancy;

import javax.jws.WebService;

@WebService
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public Employee getEmployeeById(Integer id) {
        return Employee.builder()
                .id(id)
                .name("Mark")
                .vacancy(Vacancy.MANAGER)
                .company(new Company(1,"Coca Cola"))
                .salary(99.99)
                .build();
    }
}
