package com.example.binding;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee implements Serializable{
	
private int empNo;
private String name;
private double sallary;

public Employee() {

}

public Employee(int empNo,String name,double sallary) {
	this.empNo=empNo;
	this.name=name;
	this.sallary=sallary;
	
}
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSallary() {
	return sallary;
}
public void setSallary(double sallary) {
	this.sallary = sallary;
}


}
