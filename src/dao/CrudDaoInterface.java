package dao;

import java.sql.SQLException;

import businessLogic.AnalysisResult;

public interface CrudDaoInterface {
	public void storeResult(AnalysisResult result,String name) throws SQLException, Exception;
}
