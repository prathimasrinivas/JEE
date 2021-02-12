package com.xworkz.nykaStore.service;


import java.util.ArrayList;

import com.xworkz.nykaStore.dao.impl.CosmaticsDaoImpl;
import com.xworkz.nykaStore.dto.Cosmatics;

public class CosmaticsReadTester {

	public static void main(String[] args) {
		CosmaticsDaoImpl cosmaticdaoimpl=new CosmaticsDaoImpl();
		ArrayList<Cosmatics> cosmaticsList=cosmaticdaoimpl.readAllRecords();
		
		for(Cosmatics cosmatics: cosmaticsList) {
		System.out.println("cosmatics id is" + cosmatics.getCosmaticsId());
		System.out.println("cosmatics name is" + cosmatics.getName());
		System.out.println("cosmatics price is" + cosmatics.getPrice());
		System.out.println("cosmatics id is" + cosmatics.getBrand());

	}

}
}
