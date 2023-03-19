package com.caresoft.clinicapp;

public class User {
    protected Integer id;
    protected int pin;
    
    public User() {}
    
    // TO DO: Getters and setters
    // Implement a constructor that takes an ID
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public User(Integer id) {
		this.id = id;
	}

}
