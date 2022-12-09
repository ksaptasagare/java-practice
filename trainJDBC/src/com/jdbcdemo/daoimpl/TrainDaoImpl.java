package com.jdbcdemo.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbcdemo.connection.DbConnection;
import com.jdbcdemo.dao.TrainDao;
import com.jdbcdemo.pojo.Train;

public class TrainDaoImpl implements TrainDao {

	@Override
	public List<Train> getAllTrains() {
		List <Train> trn = new ArrayList<>();
		try (Connection con = DbConnection.getDatabaseConnection()){
			
			PreparedStatement pst = con.prepareStatement("select * from train");
			
			ResultSet rs = pst.executeQuery();
			if(rs.isBeforeFirst()) {
				while(rs.next()) {
					Train train = new Train();
					train.setTrainno(rs.getInt("trainno"));
					train.setTname(rs.getString("Tname"));
					train.setFare(rs.getInt("Fare"));
					trn.add(train);
				}
			}
			return trn;
			
		} catch (SQLException e) {
			e.printStackTrace();
			trn.clear();
			return trn;
		}
	}

	@Override
	public Train searchTrainByTrainNo(int trainno) {

		Train train = null;
		
		try (Connection con = DbConnection.getDatabaseConnection()){
			
			PreparedStatement pst = con.prepareStatement("select * from train where trainno = ?");
			pst.setInt(1, trainno);
			
			ResultSet rs = pst.executeQuery();
			if(rs.isBeforeFirst()) {
					rs.next();
					train = new Train();
					train.setTrainno(rs.getInt("trainno"));
					train.setTname(rs.getString("Tname"));
					train.setFare(rs.getInt("Fare"));
			}
			return train;
		} catch (SQLException e) {
			e.printStackTrace();
			return null	;
		}

	}

	@Override
	public boolean addNewTrain(Train train) {
		
		try (Connection con = DbConnection.getDatabaseConnection()){
			
			PreparedStatement pst = con.prepareStatement("insert into train values (?,?,?)");
			pst.setInt(1, train.getTrainno());
			pst.setString(2, train.getTname());
			pst.setInt(3, train.getFare());
			
			int count = pst.executeUpdate();
			if(count > 0) {
					return true;
					}
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean updateTrain(Train train) {
		return false;
	}

	@Override
	public boolean deleteTrain(int trainno) {
		return false;
	}

	
}
