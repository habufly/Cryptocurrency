package com.Group1.CoinShell.service.Hoxton;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Group1.CoinShell.model.Hoxton.Commodity;
import com.Group1.CoinShell.model.Hoxton.CommodityDao;

@Service
@Transactional
public class CommodityService {

	@Autowired
	private CommodityDao dao;

	public void insertcommodity(String commodityName,String discribe,String photo,Integer price,Integer volume,Integer myShell,String shellOrCoin) {
		dao.insertcommodity(commodityName, discribe, photo, price, volume, myShell, shellOrCoin);
	}

	public void deleteCommodityById(Integer id) {
		dao.deleteCommodityById(id);
	}

	public Commodity findCommodityByName(String commodityName) {
		Commodity commodity = dao.findCommodityByName(commodityName);
		return commodity;
	}
	
	public Commodity findCommodityById(Integer Id) {
		Commodity commodity = dao.findCommodityById(Id);
		return commodity;
	}
	
	public void updateCommodityById(String commodityName, String discribe, String shell_or_coin,Integer myShell ,Integer coin, Integer volume,Integer id) {
		dao.updateCommodityById(commodityName, discribe, shell_or_coin, myShell, coin, volume, id);
	}
	
	public List<Commodity> findAllCommodity(){
		List<Commodity> commodityList = dao.findAllCommodity();
		return commodityList;
	}

}
