package com.Group1.CoinShell.model.Feeder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SetPriceDao extends JpaRepository<SetPrice, Integer> {

	
	//刪除語句 回傳int 搭配@Modifyung
		@Modifying
		@Query(value="delete setPrice where memberId = :memberId and coinId = :coinId", nativeQuery=true )
		public int deletegetSetCoin(Integer memberId ,Integer coinId);
}
