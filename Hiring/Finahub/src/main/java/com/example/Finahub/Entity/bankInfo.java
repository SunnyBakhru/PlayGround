package com.example.Finahub.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class bankInfo {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Bank")
	private String bank;

	@Column(name = "Credit")
	private int creditCardCount;

	@Column(name = "Debit")
	private int debitCardAccount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getCreditCardCount() {
		return creditCardCount;
	}

	public void setCreditCardCount(int creditCardCount) {
		this.creditCardCount = creditCardCount;
	}

	public int getDebitCardAccount() {
		return debitCardAccount;
	}

	public void setDebitCardAccount(int debitCardAccount) {
		this.debitCardAccount = debitCardAccount;
	}

	

}
