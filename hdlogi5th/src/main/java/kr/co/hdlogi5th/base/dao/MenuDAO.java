package kr.co.hdlogi5th.base.dao;

import java.util.List;

import kr.co.hdlogi5th.base.to.MenuTO;

public interface MenuDAO {

	public List<MenuTO> selectMenuList();
}
