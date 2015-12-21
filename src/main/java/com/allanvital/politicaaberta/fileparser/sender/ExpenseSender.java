package com.allanvital.politicaaberta.fileparser.sender;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.allanvital.politicaaberta.fileparser.dto.Deputy;
import com.allanvital.politicaaberta.fileparser.dto.ParliamentarianExpense;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExpenseSender {
	
	private String token;
	
	public ExpenseSender(String token) {
		this.token = token;
	}
	
	public void send(ParliamentarianExpense expense) throws JsonProcessingException {
		this.send(expense, "/expense");
	}
	
	public void send(Deputy deputy) throws JsonProcessingException {
		this.send(deputy, "/deputy");
	}
	
	private <T> void send(T object, String urlPath) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("Tentando enviar " + object.getClass().getName() + " = " + object);
		String json = mapper.writeValueAsString(object);
		HttpPost request = new HttpPost("http://politicaaberta.com" + urlPath);
		HttpClient httpClient = HttpClientBuilder.create().build();
		try {
			StringEntity params = new StringEntity(json, ContentType.APPLICATION_JSON);
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
