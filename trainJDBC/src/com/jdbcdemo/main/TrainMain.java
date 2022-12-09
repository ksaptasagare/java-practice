package com.jdbcdemo.main;

import java.util.List;
import java.util.Scanner;

import com.jdbcdemo.dao.TrainDao;
import com.jdbcdemo.daoimpl.TrainDaoImpl;
import com.jdbcdemo.pojo.Train;

public class TrainMain {

	public static void main(String[] args) {
		
		TrainDao daoImpl = new TrainDaoImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("All trains are:");
		List<Train> train = daoImpl.getAllTrains();
		if(train.size()>0) {
			train.forEach(System.out::println);
		}
		else System.out.println("No trains found.");	
		
		sc.close();
	}
}
