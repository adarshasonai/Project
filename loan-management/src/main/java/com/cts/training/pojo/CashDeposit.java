package com.cts.training.pojo;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Collateral POJO Classes Sub Class of Collateral
 */
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class CashDeposit extends Collateral {

	@ApiModelProperty(value = "Rate of interest of loan.")
	private Double interestRate;

	@ApiModelProperty(value = "Amount deposited.")
	private Double depositAmount;

	@ApiModelProperty(value = "Lock period of loan.")
	private Double lockPeriod;

	
	//DELETE THIS LATER***************************8
	
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(Double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public Double getLockPeriod() {
		return lockPeriod;
	}

	public void setLockPeriod(Double lockPeriod) {
		this.lockPeriod = lockPeriod;
	}
	
	
	
	
}
