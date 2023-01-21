package com.autodetect;

import com.constructor.Policy;

public class Categories {
	
	private String name;
	private Policy policy;
	
	public Categories(String name, Policy policy) {
		this.name = name;
		this.policy = policy;
	}

	public void show() {
		System.out.println("categories name>>" + name);
		System.out.println("Policy name>>" + policy.getPlanName());
		System.out.println("Policy Amount>>" + policy.getPlanAmount());

}
}