package kr.co.hdlogi5th.hr.emp.applicationService;

import java.util.List;

import kr.co.hdlogi5th.hr.emp.to.EmployeeTO;

public interface EmpApplicationService {

	public List<EmployeeTO> findEmployeeList();
	
	public void batchEmployee(List<EmployeeTO> employeeList);
	
}
