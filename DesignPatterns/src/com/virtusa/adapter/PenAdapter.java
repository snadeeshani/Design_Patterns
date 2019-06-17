package com.virtusa.adapter;

public class PenAdapter implements Pen {
	
	FriendPen fp= new FriendPen();
	
	@Override
	public void write(String str) {
		
		fp.draw(str);
		
	}

}
