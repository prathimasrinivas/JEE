package com.xworkz.nykaStore.service;

import com.xworkz.nykaStore.dao.CosmaticsDao;
import com.xworkz.nykaStore.dao.impl.CosmaticsDaoImpl;

public class CosmaticsUpdateTester {

	public static void main(String[] args){
		CosmaticsDao cosmaticsdao=new CosmaticsDaoImpl();
		boolean result=cosmaticsdao.updateRecordBasedonBrand(600, "mac");
		System.out.println("was table updated"+ result);
		

	}

}
