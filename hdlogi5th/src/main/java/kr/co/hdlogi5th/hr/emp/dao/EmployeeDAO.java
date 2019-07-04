package kr.co.hdlogi5th.hr.emp.dao;

import java.util.List;

import kr.co.hdlogi5th.hr.emp.to.EmployeeTO;

public interface EmployeeDAO {

	public List<EmployeeTO> selectEmployeeList();
	
	public void insertEmployee(EmployeeTO employeeTO);
	
	public void updateEmployee(EmployeeTO employeeTO);
	
	public void deleteEmployee(EmployeeTO employeeTO);
	
}
