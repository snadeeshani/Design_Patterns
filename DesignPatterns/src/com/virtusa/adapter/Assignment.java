package com.virtusa.adapter;

public class Assignment {

	private Pen p;
	
	public Pen getP() {
		return p;
	}
	public void setP(Pen p) {
		this.p = p;
	}


	public void doAssignement(String str)
	{
		p.write(str);
	}
}
