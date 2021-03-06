package kr.co.hdlogi5th.base.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.hdlogi5th.base.sf.BaseServiceFacade;
import kr.co.hdlogi5th.base.to.CodeTO;
import kr.co.hdlogi5th.common.mapper.DatasetBeanMapper;


@Controller
public class CodeController  {
	
	@Autowired
	private BaseServiceFacade baseServiceFacade;
	
	@Autowired 
	private DatasetBeanMapper datasetBeanMapper;

	@RequestMapping("base/findCodeList.do")
	public void findCodeList(HttpServletRequest request, HttpServletResponse response) throws Exception{
           
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		List<CodeTO> codeList= baseServiceFacade.findCodeList();
             
           datasetBeanMapper.beansToDataset(outData, codeList, CodeTO.class);
           
	} 
	

}
