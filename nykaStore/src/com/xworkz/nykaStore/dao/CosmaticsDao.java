package com.xworkz.nykaStore.dao;


import java.sql.SQLException;
import java.util.ArrayList;


import com.mysql.jdbc.Connection;
import com.xworkz.nykaStore.dto.Cosmatics;

public interface CosmaticsDao {
	
	Connection getDBConnection() throws ClassNotFoundException, SQLException;
boolean save(Cosmatics cosmatics);

ArrayList <Cosmatics> readAllRecords();

boolean updateRecord(Cosmatics cosmatics);

boolean updateRecordBasedonBrand(double newPrice, String brand);

boolean deleteRecordBasedonCosmaticsId(int cosmaticsId);
}
