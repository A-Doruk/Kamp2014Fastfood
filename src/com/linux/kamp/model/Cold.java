package com.linux.kamp.model;

public abstract class Cold extends Order implements Drinkable {

	private boolean iced;

	public boolean isIced() {
		return iced;
	}

	public void setIced(boolean iced) {
		this.iced = iced;
	}

}
