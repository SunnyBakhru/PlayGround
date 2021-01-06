package com.example.Finahub.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Finahub.Entity.BankInfoBO;
@Repository
public class BankInfoDAOImp implements BankInfoDAO {

	@Autowired
	DataSource dataSource ;
	
	@Override
	public void addBankInfo(List<BankInfoBO> bankInfoBO) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		int resultSet = 0;
		try {
			for (BankInfoBO bInfoBO : bankInfoBO) {

				String Qery = "insert into bankInfo(Bank,Credit,Debit) values('" + bInfoBO.getBank() + "' ,"
						+ bInfoBO.getCreditCardCount() + " ," + bInfoBO.getDebitCardAccount() + ")";
				System.out.println(Qery);
				connection = dataSource.getConnection();
				statement = connection.createStatement();
				resultSet = statement.executeUpdate(Qery);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
			statement.close();
		}
	}

	}


