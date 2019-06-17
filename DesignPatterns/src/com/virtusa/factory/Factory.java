package com.virtusa.factory;

public class Factory {

	public static void main(String[] args) {
		
		OperateFactory operatingFactory= new OperateFactory();
		OS myOs= operatingFactory.display("Open");
		myOs.operate();
	}
}
