package com.example.Finahub.Service;

import java.sql.SQLException;
import java.util.List;

import com.example.Finahub.Entity.BankInfoBO;

public interface BankInfoService {
	
public	void addBankInfo(List<BankInfoBO> bankInfoBO) throws SQLException;

}
