package kr.co.hdlogi5th.logistics.purchase.dao;

import java.util.List;

import kr.co.hdlogi5th.logistics.purchase.to.ItemTO;

public interface ItemDAO {

	List<ItemTO> selectItemList();
	
}
