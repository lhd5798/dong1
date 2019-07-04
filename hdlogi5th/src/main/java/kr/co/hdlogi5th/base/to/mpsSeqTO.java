package kr.co.hdlogi5th.base.to;

import kr.co.hdlogi5th.common.annotation.Dataset;
import kr.co.hdlogi5th.common.to.BaseTO;

@Dataset(name="gds_seqNo")
public class mpsSeqTO extends BaseTO{
	
	String seqNo;

	public String getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	
}

