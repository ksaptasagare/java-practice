package com.jdbcdemo.dao;

import java.util.List;

import com.jdbcdemo.pojo.Train;

public interface TrainDao {

//	query operation
	List<Train> getAllTrains();
	Train searchTrainByTrainNo(int trainno);
	
//	write operation
	boolean addNewTrain(Train train);
	boolean updateTrain(Train train);
	boolean deleteTrain(int trainno);
}
