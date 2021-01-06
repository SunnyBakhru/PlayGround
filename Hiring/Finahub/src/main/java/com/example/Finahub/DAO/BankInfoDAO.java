package com.example.Finahub.DAO;

import java.sql.SQLException;
import java.util.List;

import com.example.Finahub.Entity.BankInfoBO;

public interface BankInfoDAO {
	
	public void addBankInfo(List<BankInfoBO> bankInfoBO) throws SQLException;

}
