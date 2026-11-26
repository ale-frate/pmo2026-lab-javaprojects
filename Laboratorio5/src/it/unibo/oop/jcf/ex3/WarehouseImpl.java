package it.unibo.oop.jcf.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse{

	Set<Product> ProductSet = new LinkedHashSet<>();
	
	public void addProduct(Product p) {
		ProductSet.add(p);
	}

	public Set<String> allNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Product> allProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean containsProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}

	public double getQuantity(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

}
