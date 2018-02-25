package ssm.service;

import org.springframework.stereotype.Service;
import ssm.dao.EmployeeMapper;
import ssm.model.Employee;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmps() {
        return employeeMapper.getEmps();
    }
}
