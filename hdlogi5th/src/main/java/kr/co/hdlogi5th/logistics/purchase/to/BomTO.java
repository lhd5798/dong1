package kr.co.hdlogi5th.logistics.purchase.to;

import kr.co.hdlogi5th.common.annotation.Dataset;
import kr.co.hdlogi5th.common.to.BaseTO;

@Dataset(name="gds_bom")
public class BomTO extends BaseTO{

	String no, itemCode, parentItemCode, netAmount, description;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getParentItemCode() {
		return parentItemCode;
	}

	public void setParentItemCode(String parentItemCode) {
		this.parentItemCode = parentItemCode;
	}

	public String getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(String netAmount) {
		this.netAmount = netAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
