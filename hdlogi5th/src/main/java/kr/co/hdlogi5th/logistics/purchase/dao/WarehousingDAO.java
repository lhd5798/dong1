package kr.co.hdlogi5th.logistics.purchase.dao;

import java.util.List;

import kr.co.hdlogi5th.logistics.purchase.to.WarehousingTO;

public interface WarehousingDAO {


	public List<WarehousingTO> selectWarehousingList();

	public void insertWarehousing(WarehousingTO warehousingTO);

	public void updateWarehousing(WarehousingTO warehousingTO);

}
