package com.allanvital.politicaaberta.fileparser.sender;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.allanvital.politicaaberta.fileparser.dto.ParliamentarianExpense;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExpenseSender {
	
	private String token;
	
	public ExpenseSender(String token) {
		this.token = token;
	}
	
	public void send(ParliamentarianExpense expense) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("Tentando enviar expense " + expense);
		String jsonDeputy = mapper.writeValueAsString(expense);
		HttpPost request = new HttpPost("http://politicaaberta.com/expense");
		HttpClient httpClient = HttpClientBuilder.create().build();
		try {
			StringEntity params = new StringEntity(jsonDeputy, ContentType.APPLICATION_JSON);
			request.addHeader("token", token);
			request.setEntity(params);
			HttpResponse response = httpClient.execute(request);
			if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
				throw new IOException("resultado nao foi OK " + response.getStatusLine().getStatusCode());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
