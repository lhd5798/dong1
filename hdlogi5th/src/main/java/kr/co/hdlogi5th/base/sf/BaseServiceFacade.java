package kr.co.hdlogi5th.base.sf;

import java.util.List;
import java.util.Map;

import kr.co.hdlogi5th.base.to.CodeDetailTO;
import kr.co.hdlogi5th.base.to.CodeTO;
import kr.co.hdlogi5th.base.to.MenuTO;

public interface BaseServiceFacade {

	public List<CodeTO> findCodeList();
	// 코드리스트 조회
	
	public List<CodeDetailTO> findCodeDetailList();
	// 상세코드리스트 조회
	
	public void batchDetailCode(List<CodeDetailTO> codeDetailList); 
	// DetailCode 변경저장
	
	public List<MenuTO> findMenuList();
	
	public String takeSerialCode(Map<String,Object> findSeq);
}
