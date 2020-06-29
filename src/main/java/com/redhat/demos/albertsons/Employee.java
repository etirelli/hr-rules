package com.redhat.demos.albertsons;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Employee implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long id;
	private java.lang.String name;
	private java.time.LocalDate hireDate;
	private java.math.BigDecimal baseSalary;
	private java.math.BigDecimal regularHourPayRate;

	public Employee() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.time.LocalDate getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(java.time.LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public java.math.BigDecimal getBaseSalary() {
		return this.baseSalary;
	}

	public void setBaseSalary(java.math.BigDecimal baseSalary) {
		this.baseSalary = baseSalary;
	}

	public java.math.BigDecimal getRegularHourPayRate() {
		return this.regularHourPayRate;
	}

	public void setRegularHourPayRate(java.math.BigDecimal regularHourPayRate) {
		this.regularHourPayRate = regularHourPayRate;
	}

	public Employee(java.lang.Long id, java.lang.String name,
			java.time.LocalDate hireDate, java.math.BigDecimal baseSalary,
			java.math.BigDecimal regularHourPayRate) {
		this.id = id;
		this.name = name;
		this.hireDate = hireDate;
		this.baseSalary = baseSalary;
		this.regularHourPayRate = regularHourPayRate;
	}

}