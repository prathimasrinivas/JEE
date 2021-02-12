package com.xworkz.nykaStore.service;

import com.xworkz.nykaStore.dao.CosmaticsDao;
import com.xworkz.nykaStore.dao.impl.CosmaticsDaoImpl;

public class CosmaticsDeleteTester {

	public static void main(String[] args) {
		CosmaticsDao cosmeticsDao = new CosmaticsDaoImpl();
		boolean result = cosmeticsDao.deleteRecordBasedonCosmaticsId(3);
		System.out.println("Is row deleted?" + result);
	}



	}


