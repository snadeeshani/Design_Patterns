package com.virtusa.composite;

public class Computer {
	
	public static void main(String[] args) {
		
		Component hd= new Leaf("Hdd",4000);
		Component mouse= new Leaf("Mouse",500);
		Component monitor= new Leaf("Monitor",40000);
		Component ram= new Leaf("Ram",1000);
		Component cpu= new Leaf("Cpu",200);
		
		Composite peri= new Composite("PERI");
		Composite cabinat= new Composite("CABINAT");
		Composite motherboard= new Composite("MOTHERBOARD");
		Composite computer= new Composite("COMPUTER");
		
		motherboard.addComponent(ram);
		motherboard.addComponent(cpu);
		
		peri.addComponent(monitor);
		peri.addComponent(mouse);
		
		cabinat.addComponent(hd);
		//cabinat.addComponent(motherboard);
		
		computer.addComponent(peri);
		computer.addComponent(cabinat);
		computer.show();
	}

}
