package com.elenai.elenaidodge2.capability.absorptionbool;

public class AbsorptionBool implements IAbsorptionBool {

	private boolean absorption = false;

	@Override
	public boolean hasAbsorption() {
		return this.absorption;
	}

	@Override
	public void set(boolean bool) {
		this.absorption = bool;
	}



}
