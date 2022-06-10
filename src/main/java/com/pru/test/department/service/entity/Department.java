package com.pru.test.department.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_department")
public class Department {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long deptId;
    private String deptName;
    private String deptAddress;
    private String deptCode;
	public Long getDeptId() {
		return deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptAddress() {
		return deptAddress;
	}
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public Department(Long deptId, String deptName, String deptAddress, String deptCode) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAddress = deptAddress;
		this.deptCode = deptCode;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptAddress=" + deptAddress
				+ ", deptCode=" + deptCode + "]";
	}
    
	
    
}
