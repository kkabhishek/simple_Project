package org.spring.mvcApp.Model.Service;

import java.util.Random;

import org.spring.mvcApp.Model.Dao.Dao_Class;

public class Service_Class 
{
	public void generateAccountNo(int id, String name)
	{
		Random rd = new Random();
		int num = rd.nextInt(10000);
		if(num>1000 && num<10000)
		{
			String stNum = "SBI"+num;
			Dao_Class dc = new Dao_Class();
			dc.jdbcCode(id,name,stNum);
			
		}
	}
}
