package com.avs.portal.enumtype;

public enum Login {
	
	// 	password | isVerified | isActive | isLocked
	//  0: Ok; 1: NotOk; X: Not need to check
	
	LOGIN_SUCCESS("0000"), LOGIN_FAILED("1XXX");

    private final String label;

    private Login(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
    
}