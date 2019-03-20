package com.cts.VehicleReservationSystem.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name="vehicle")
@Table(name="vehicle")
public class Vehicle {
	@Id
	@Column(name="vehicleNumber")
	private String vehicleNumber;
	private String branch;
	private String vehicleType;
	@DateTimeFormat(pattern = "MM/DD/yyyy")
	private Date insuranceExpiry;
	@DateTimeFormat(pattern = "MM/DD/yyyy")
	private Date lastService;
	@DateTimeFormat(pattern = "MM/DD/yyyy")
	private Date serviceDue;
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Date getInsuranceExpiry() {
		return insuranceExpiry;
	}
	public void setInsuranceExpiry(Date insuranceExpiry) {
		this.insuranceExpiry = insuranceExpiry;
	}
	public Date getLastService() {
		return lastService;
	}
	public void setLastService(Date lastService) {
		this.lastService = lastService;
	}
	public Date getServiceDue() {
		return serviceDue;
	}
	public void setServiceDue(Date serviceDue) {
		this.serviceDue = serviceDue;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleNumber=" + vehicleNumber + ", branch=" + branch + ", vehicleType=" + vehicleType
				+ ", insuranceExpiry=" + insuranceExpiry + ", lastService=" + lastService + ", serviceDue=" + serviceDue
				+ "]";
	}

}
