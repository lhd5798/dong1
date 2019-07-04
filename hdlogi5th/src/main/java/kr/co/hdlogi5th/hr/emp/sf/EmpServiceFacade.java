package kr.co.hdlogi5th.hr.emp.sf;

import java.util.List;

import kr.co.hdlogi5th.hr.emp.to.EmployeeTO;

public interface EmpServiceFacade {

	public List<EmployeeTO> findEmployeeList();
	
	public void batchEmployee(List<EmployeeTO> employeeList);
	
}
