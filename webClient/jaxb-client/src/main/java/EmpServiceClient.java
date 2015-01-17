import com.chathurangaonline.samples.jax.ws.jaxb.Employee;
import com.chathurangaonline.samples.jax.ws.jaxb.EmployeeServiceImpl;
import com.chathurangaonline.samples.jax.ws.jaxb.EmployeeServiceImplService;

/**
 * Created by chathuranga on 1/4/15.
 */
public class EmpServiceClient {

    public static void main(String[] args) {

        EmployeeServiceImplService employeeServiceImplService = new EmployeeServiceImplService();
        EmployeeServiceImpl employeeService = employeeServiceImplService.getEmployeeServiceImplPort();

        //creating the employee
        Employee employeeOb = new Employee();
        employeeOb.setEmail("chathuranga.t@gmail.com");

        Employee employeeCreated = employeeService.create(employeeOb);

        System.out.println(" employee created  ["+employeeCreated.getEmpId()+"]");

        //find the employee with id
        Employee employee = employeeService.findEmployeeById("emp4235");

        System.out.println(" employee found ["+ employee.getName()+"]");
    }
}
