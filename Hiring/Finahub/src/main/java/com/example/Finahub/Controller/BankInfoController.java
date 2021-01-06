package com.example.Finahub.Controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

import java.net.URISyntaxException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Finahub.Entity.BankInfoBO;
import com.example.Finahub.Entity.bankInfo;
import com.example.Finahub.Service.BankInfoService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
@RestController
@RequestMapping("/funbro")
@CrossOrigin("*")
public class BankInfoController {
	
	
	@Autowired
	BankInfoService bankInfoService;
	
	@GetMapping
	public ResponseEntity<?> getBankInfo() throws URISyntaxException, IOException {
		URL url = new URL("https://api.airtable.com/v0/appL8W9qlf8sORhe6/Table%201?maxRecords=10&view=Grid%20view");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestProperty("Authorization", "Bearer keyTtHGzT69Rb3bO5");
		connection.setRequestProperty("accept", "application/json");
		InputStream responseStream = connection.getInputStream();
		ObjectMapper mapper = new ObjectMapper();
		List<BankInfoBO> bankInfoBoList = new ArrayList<BankInfoBO>();
		HashMap apod = mapper.readValue(responseStream, HashMap.class);
		Iterator<Map.Entry<Object, Object>> itr = apod.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Object, Object> entry = itr.next();
			List<HashMap> list = new ArrayList<HashMap>();
			list = (List<HashMap>) entry.getValue();

			for (HashMap myObj : list) {
				BankInfoBO bankInfoBO = new BankInfoBO();
				Map<String, Object> myMap = (Map<String, Object>) myObj.get("fields");
				bankInfoBO.setBank((String) myMap.get("Bank"));
				bankInfoBO.setCreditCardCount((Integer) myMap.get("Credit Card Count"));
				bankInfoBO.setDebitCardAccount((Integer) myMap.get("Debit Card Count"));
				bankInfoBoList.add(bankInfoBO);

			}

		}
		System.out.println(connection.toString());

		return ResponseEntity.ok(bankInfoBoList);

	}

	@PostMapping
	public void addBankInfo(@RequestBody List<BankInfoBO> bankInfoBO ) throws SQLException {
		
		bankInfoService.addBankInfo(bankInfoBO);
		
	}

}
