package kr.co.hdlogi5th.logistics.base.dao;

import java.util.List;

import kr.co.hdlogi5th.logistics.base.to.CompanyTO;

public interface CompanyDAO {

	public List<CompanyTO> selectCompanyList();
	
	public void insertCompany(CompanyTO companyTO) ;
	
	public void updateCompany(CompanyTO companyTO) ;
	
	public void deleteCompany(CompanyTO companyTO) ;

}
