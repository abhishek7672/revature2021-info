package com.revature.form;

public abstract class Form {
 protected String name;
 protected boolean sucess;
public Form(String name) {
	super();
	sucess=false;
	this.name = name;
	
}
public void display() {

	System.out.println("login");
	System.out.println("----");
	
}
public void actiononcapturedata() {
	while(! sucess) {
		 display();
		 capturedata();
		action();
	}
}
	public  abstract void capturedata();
	public abstract void action();


}
