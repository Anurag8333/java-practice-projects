package com.dev.ola.olaImp;

import com.dev.ola.driver.Driver;
import com.dev.ola.user.User;
import com.dev.ola.vehicle.Bike;

public class Olaimp {
	
	public static void main(String[] args) {
		
		Driver.detail();
		User.detail();
		Driver d = new Driver();
		d.name = "Deepak";
		d.experience = 10;
		d.driverDetail();
		
		Bike.detail();
	}
}
