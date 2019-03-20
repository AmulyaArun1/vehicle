package com.cts.VehicleReservationSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.VehicleReservationSystem.bean.Vehicle;
import com.cts.VehicleReservationSystem.dao.VehicleDAO;

@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleDAO vehicleDAO;
	
	public String addVehicle(Vehicle vehicle) {
		return vehicleDAO.addVehicle(vehicle);
		
	}

}
