package com.Group1.CoinShell.model.Feeder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "setPrice")
public class SetPrice {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "setPrice_id")
	private Integer setPriceId;
	
	@Column(name = "memberId")
	private Integer memberId;

	@Column(name = "coinId")
	private Integer coinId;
	
	@Column(name = "setPrice")
	private Integer setPrice;
	
	public SetPrice() {
	}

	@Override
	public String toString() {
		return "SetPrice [setPriceId=" + setPriceId + ", memberId=" + memberId + ", coinId=" + coinId + ", setPrice="
				+ setPrice + "]";
	}

	public Integer getSetPriceId() {
		return setPriceId;
	}

	public void setSetPriceId(Integer setPriceId) {
		this.setPriceId = setPriceId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getCoinId() {
		return coinId;
	}

	public void setCoinId(Integer coinId) {
		this.coinId = coinId;
	}

	public Integer getSetPrice() {
		return setPrice;
	}

	public void setSetPrice(Integer setPrice) {
		this.setPrice = setPrice;
	}
	
	
}
