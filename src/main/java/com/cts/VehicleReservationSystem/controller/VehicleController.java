package com.cts.VehicleReservationSystem.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.VehicleReservationSystem.bean.Vehicle;
import com.cts.VehicleReservationSystem.service.VehicleService;



@Controller
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;

	@RequestMapping(value="update.html")                //GetMapping(value="login.html", method= RequestMethod.GET) could also be done
	public String getupdatePage(){
		return "update";
	}
	@RequestMapping(value="addVehicle.html")                //GetMapping(value="login.html", method= RequestMethod.GET) could also be done
	public String getaddVehiclePage(){
		return "addVehicle";
	}
	
	@RequestMapping(value="addVehicle.html",method=RequestMethod.POST)
	public ModelAndView addVehicle(@ModelAttribute Vehicle vehicle, HttpSession httpSession){
		String s=vehicleService.addVehicle(vehicle);
		ModelAndView modelAndView = new ModelAndView();
		if(s=="success")
		{
		modelAndView.setViewName("addVehicle");
		
		}
		else{
			modelAndView.setViewName("register");
		}
		
		
		return modelAndView;
	}
	
}
