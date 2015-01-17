package com.chathurangaonline.samples.jax.ws.jaxb;

import com.chathurangaonline.samples.jax.ws.jaxb.model.Employee;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface EmployeeService {

    @WebMethod
    Employee create(Employee employee);

    @WebMethod
    Employee findEmployeeById(String empId);

}
