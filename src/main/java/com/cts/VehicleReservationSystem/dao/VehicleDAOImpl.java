package com.cts.VehicleReservationSystem.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.VehicleReservationSystem.bean.Vehicle;

@Repository("vehicleDAO")
@Transactional
public class VehicleDAOImpl implements VehicleDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private VehicleDAO vehicleDAO;
	
	public String addVehicle(Vehicle vehicle) {
		
		Session session = null;
		Transaction transaction = null;
		try {
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
		transaction.begin();
		session.save(vehicle);
		transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null) {
		        transaction.rollback();
		      }
		      e.printStackTrace();
		}
		finally {
			if (session != null) {
		        session.close();
		      }
		}
		return "success";
	}
	}
	

