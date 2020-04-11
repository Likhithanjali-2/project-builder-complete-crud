package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import businessLogic.AnalysisResult;
import utility.ConnectionManager;

public class CrudDAO implements CrudDaoInterface{
	private ArrayList<String> store = new ArrayList<String>();
	@Override
	public void storeResult(AnalysisResult result,String name) throws SQLException, Exception {
		store = result.storeResult();
		ConnectionManager con = new ConnectionManager();
		
		String sql = "insert into anlysis_result values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement st = con.getConnection().prepareStatement(sql);
		st.setString(1, name);
		for(int i=0;i<10;i++) {
			st.setString(i+2,store.get(i));
		}
		st.executeUpdate();
		st.close();
	}

//	create table anlysis_result(
//			Smoothness varchar(20),
//			Hydration varchar(20),
//			DryPatches varchar(20),
//			Wrinkles varchar(20),
//			Sagging varchar(20),
//			Tan varchar(20),
//			Spots varchar(20),
//			Patches varchar(20),
//			OpenPores varchar(20),
//			Acne varchar(20)
//			);
}
