package com.avs.portal.enumtype;

public enum Role {
	
	PORTAL_ADMIN("PORTAL_ADMIN"), PORTAL_USER("PORTAL_USER"), ANALYST("ANALYST");

    private final String label;

    private Role(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
    
}