package com.redhat.demos.albertsons;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PremiumPay implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long id;
	private java.lang.Long employeeId;
	private java.math.BigDecimal premiumAmount;
	private java.lang.String premiumType;

	public PremiumPay() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Long getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(java.lang.Long employeeId) {
		this.employeeId = employeeId;
	}

	public java.math.BigDecimal getPremiumAmount() {
		return this.premiumAmount;
	}

	public void setPremiumAmount(java.math.BigDecimal premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public java.lang.String getPremiumType() {
		return this.premiumType;
	}

	public void setPremiumType(java.lang.String premiumType) {
		this.premiumType = premiumType;
	}

	public PremiumPay(java.lang.Long id, java.lang.Long employeeId,
			java.math.BigDecimal premiumAmount, java.lang.String premiumType) {
		this.id = id;
		this.employeeId = employeeId;
		this.premiumAmount = premiumAmount;
		this.premiumType = premiumType;
	}

}