package com.linux.kamp.model;

public abstract class Order {

	private boolean pack;
	protected double price;

	public boolean isPackage() {
		return this.pack;
	}

	public double bill() {
		return this.price;
	}

	public void setPack(boolean pack) {
		this.pack = pack;
	}

}
