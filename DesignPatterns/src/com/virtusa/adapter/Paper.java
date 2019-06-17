package com.virtusa.adapter;


public class Paper {
	
	public static void main(String[] args) {
		
		Pen pen= new PenAdapter();
		Assignment assignment= new Assignment();
		assignment.setP(pen);
		assignment.doAssignement("Assignment done");
	}

}
