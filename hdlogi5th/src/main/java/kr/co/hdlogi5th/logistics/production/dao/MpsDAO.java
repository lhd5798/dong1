package kr.co.hdlogi5th.logistics.production.dao;

import java.util.HashMap;
import java.util.List;

import kr.co.hdlogi5th.logistics.production.to.MpsTO;

public interface MpsDAO {

	public List<MpsTO> selectMpsList(HashMap<String, Object> map);

	public void insertMps(MpsTO mpsTO);

	public void updeteMps(MpsTO mpsTO);

}
