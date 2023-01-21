package com.autodetect;

public class Policy {

	private String planName;
	private String planAmount;

	public Policy(String planName, String planAmount) {
		this.planName = planName;
		this.planAmount = planAmount;
	}

	public String getPlanName() {
		return planName;
	}

	public String getPlanAmount() {
		return planAmount;
	}

}
