package com.employee.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument

public class Department {
	public Department() {
		
	}

	private String departmentName;
	@DynamoDBAttribute(attributeName= "departmentName")
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	private String departmentCode;
	@DynamoDBAttribute(attributeName = "departmentCode")
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public Department(String departmentName, String departmentCode) {
		this.departmentName = departmentName;
		this.departmentCode = departmentCode;
	}
}
