package com.linux.kamp;

import com.linux.kamp.model.ChildMenu;
import com.linux.kamp.model.Coffee;
import com.linux.kamp.model.Durum;
import com.linux.kamp.model.Order;
import com.linux.kamp.model.Tea;
import com.linux.kamp.model.Water;

public class Shop {
	public static void main(String[] args) {

		ShoppingCart shoppingCart = ShoppingCart.getInstance();

		// Take orders from a customer
		Order tea = new Tea();
		shoppingCart.add(tea);

		Order coffee = new Coffee();
		shoppingCart.add(coffee);

		Order water = new Water();
		shoppingCart.add(water);

		Order childMenu = new ChildMenu();
		shoppingCart.add(childMenu);

		Order durum = new Durum();
		shoppingCart.add(durum);

		// Test shopping cart
		shoppingCart.show();

		System.out.println("Total bill");
		System.out.println(shoppingCart.total());

	}
}
