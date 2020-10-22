package com.nttdata.interfacee;

public class Client1 {

	public static void main(String[] args) {
		
		
	Car c1 = new Car(12000,"Black","Verna",new Engine(new Capacity(100),"light motor"),"TATA");
		 c1.startVehicle(c1);
		 c1.displayCarDetails();
		 c1.stopVehicle(c1);
		 
		 
	Bus b1 = new Bus(9999,"Yellow","volvo",new Engine(new Capacity(250),"heavy motor"),"Air bus");
	    b1.startVehicle(b1);
	    b1.displayBusDetails();
	    b1.stopVehicle(b1);
	    
	}
}
