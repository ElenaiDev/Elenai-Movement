package com.elenai.elenaidodge.capability.joined;

public class Joined implements IJoined {

	private boolean joined = false;

	@Override
	public void set(boolean joined) {
		this.joined = joined;
	}

	@Override
	public boolean getJoined() {
		return this.joined;
	}



}
