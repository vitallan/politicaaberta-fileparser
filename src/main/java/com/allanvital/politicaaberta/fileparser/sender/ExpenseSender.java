package com.allanvital.politicaaberta.fileparser.sender;

import com.allanvital.politicaaberta.fileparser.dto.ParliamentarianExpense;

public class ExpenseSender {
	
	public void send(ParliamentarianExpense expense) {
		System.out.println("Tentando salvar expense " + expense);
	}
	
}
