package kr.co.hdlogi5th.logistics.business.dao;

import java.util.List;

import kr.co.hdlogi5th.logistics.business.to.DeliveryResultTO;

public interface DeliveryResultDAO {

	public List<DeliveryResultTO> selectDeliveryResultList();

	public void insertDeliveryResult(DeliveryResultTO selectDeliveryTO);


}
