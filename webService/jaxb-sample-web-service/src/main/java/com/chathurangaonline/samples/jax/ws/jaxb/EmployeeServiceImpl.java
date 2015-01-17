package com.chathurangaonline.samples.jax.ws.jaxb;

import com.chathurangaonline.samples.jax.ws.jaxb.model.Employee;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class EmployeeServiceImpl implements EmployeeService{

    @WebMethod
    public Employee create(Employee employee) {
        //todo sample implementation
        if(employee!=null && employee.getEmail()!=null && employee.getEmail().equals("chathuranga.t@gmail.com")){
            employee.setEmpId("emp4235");
            employee.setName("chathuranga tennakoon");
            employee.setWebsite("www.chathurangaonline.com");
        }
        return employee;
    }

    @WebMethod
    public Employee findEmployeeById(String empId) {
        //todo sample implementation
        if(empId!=null && empId.equals("emp4235")){
            Employee employee = new Employee();
            employee.setId(123);
            employee.setEmpId("emp4235");
            employee.setName("chathuranga tennakoon");
            employee.setWebsite("www.chathurangaonline.com");
            employee.setEmail("chathuranga.t@gmail.com");
        }
        Employee employee = new Employee();
        employee.setName("chathuranga tennakoon");
        return employee;
    }

}
