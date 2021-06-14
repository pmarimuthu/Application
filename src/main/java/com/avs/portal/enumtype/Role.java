package com.avs.portal.enumtype;

public enum Role {
	
	PORTAL_ADMIN("PORTAL_ADMIN"), PORTAL_USER("PORTAL_USER"), ANALYST("ANALYST");

    private final String label;

    private Role(String label) {
        this.label = label;
    }

<<<<<<< HEAD
=======
    @Override
>>>>>>> b030e04... initial commit
    public String toString() {
        return this.label;
    }
    
}