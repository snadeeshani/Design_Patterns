package com.virtusa.factory;

public class OperateFactory {

	public OS display(String type)
	{
		if(type.equals("Open"))
		{
			return new Apple();
		}
		else if(type.equals("Closed"))
		{
			return new Samsung();
		}
		else
		{
			return new Windows();
		}
	}
}
