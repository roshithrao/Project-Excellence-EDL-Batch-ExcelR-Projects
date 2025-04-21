package com.execlr;

public class Flipkart /*Target Object*/{

	Ekart d; //Dependent object
	
	static {
		System.out.println("Flipkart is loaded");
	}
	
	public Flipkart(Ekart d){
		System.out.println("Products are available!!!");
		this.d=d;
	}
	
    public Ekart getD() {
		return d;
	}


	void deliver() {
    	System.out.println("Product is being delivered by "+d);
    }
	
	
}
