package com.cts.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Customer Loan Entity Class
 */
@Entity
@Table(name = "customerloan")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Model Class for Customer Taking the Loan")
public class CustomerLoan {

	@Id
	@ApiModelProperty(value = "Loan Id for the Customer")
	private Integer loanId;

	@ApiModelProperty(value = "Product Id of the respective Loan")
	private Integer loanProductId;

	@ApiModelProperty(value = "Customer Id of the Loan Bearer")
	private Integer customerId;

	@ApiModelProperty(value = "Loan Principal for the Loan")
	private Double loanPrincipal;

	@ApiModelProperty(value = "Tenure for the Loan")
	private Integer tenure;

	@ApiModelProperty(value = "Interest Rate for the Loan")
	private Double interest;

	@ApiModelProperty(value = "EMI on the Loan")
	private Double emi;

	@ApiModelProperty(value = "Collateral Id for the Loan")
	private Integer collateralId;

	
	
	
	
	
	//DELETE THIS LATER******************************************
	
	
	public CustomerLoan() {
		
	}
	
	public CustomerLoan(Integer loanId, Integer loanProductId, Integer customerId, Double loanPrincipal, Integer tenure,
			Double interest, Double emi, Integer collateralId) {
		super();
		this.loanId = loanId;
		this.loanProductId = loanProductId;
		this.customerId = customerId;
		this.loanPrincipal = loanPrincipal;
		this.tenure = tenure;
		this.interest = interest;
		this.emi = emi;
		this.collateralId = collateralId;
	}
	
	public Integer getLoanId() {
		return loanId;
	}

	

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public Integer getLoanProductId() {
		return loanProductId;
	}

	public void setLoanProductId(Integer loanProductId) {
		this.loanProductId = loanProductId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Double getLoanPrincipal() {
		return loanPrincipal;
	}

	public void setLoanPrincipal(Double loanPrincipal) {
		this.loanPrincipal = loanPrincipal;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}

	public Integer getCollateralId() {
		return collateralId;
	}

	public void setCollateralId(Integer collateralId) {
		this.collateralId = collateralId;
	}
	
	
	
	

}