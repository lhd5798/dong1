package kr.co.hdlogi5th.logistics.base.sf;

import java.util.List;

import kr.co.hdlogi5th.logistics.base.to.CompanyTO;
import kr.co.hdlogi5th.logistics.base.to.DeptTO;
import kr.co.hdlogi5th.logistics.base.to.PositionTO;
import kr.co.hdlogi5th.logistics.base.to.WorkplaceTO;


public interface ManagementServiceFacade {

	public List<DeptTO> findDeptList();

	public List<CompanyTO> findCompanyList();

	public List<WorkplaceTO> findWorkplaceList();

	public List<PositionTO> findPositionList();

	public void batchDepartmentList(List<DeptTO> batchDeptList);
	
	public void batchCompanyList(List<CompanyTO> batchCompanyList);
	
	public void batchWorkplaceList(List<WorkplaceTO> batchWorkplaceList);

}
