package com.revature.menu;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public abstract class Menu {
	protected String name ;
	protected List<String> menu_Items;
	protected int option;
	public Menu(String name){
		this.name=name;
		menu_Items=new ArrayList<>();
	}
		public void  addmenuitems(String menuname) {
			menu_Items.add(menuname);
		}
		public void displaymenu(){
			System.out.println("--------");
			System.out.println(name);
			System.out.println("-------");
		
			for(int i=0; i<menu_Items.size();i++) {
				System.out.println(i+1 + "("+ menu_Items.get(i));
			}
			System.out.println("choose the option");
		}
		public void capturedata() {
		Scanner sc=new Scanner(System.in);
		 option=Integer.parseInt(sc.nextLine());
		
		}
		//abstract public void handler();
		public void captureandhandler() {
			displaymenu();
			capturedata();
			handler();
			
		}
		abstract public void handler();
	}

