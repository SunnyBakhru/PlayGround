package com.example.Finahub.Service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Finahub.DAO.BankInfoDAO;
import com.example.Finahub.Entity.BankInfoBO;


@Service
public class BankInfoServiceImp implements BankInfoService{

	@Autowired
	BankInfoDAO bankInfoDAO;
	
	@Override
	public void addBankInfo(List<BankInfoBO> bankInfoBO) throws SQLException {
		
		bankInfoDAO.addBankInfo(bankInfoBO);
	}

}
