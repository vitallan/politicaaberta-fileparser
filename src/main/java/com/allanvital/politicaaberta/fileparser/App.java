package com.allanvital.politicaaberta.fileparser;

import java.io.IOException;

import javax.management.RuntimeErrorException;
import javax.xml.bind.JAXBException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;

import com.allanvital.politicaaberta.fileparser.parser.SummarizedExpenseXmlReader;
import com.allanvital.politicaaberta.fileparser.sender.ExpenseSender;

public class App {

	public static void main(String[] args) throws IOException, JAXBException, XMLStreamException, FactoryConfigurationError {
		if (args.length != 2) {
			throw new RuntimeErrorException(null, "Preciso informar dois parametros: 1 Arquivo a ser parseado e 2 Token para enviar no header do post");
		}
		ExpenseSender sender = new ExpenseSender(args[1]);
		SummarizedExpenseXmlReader reader = new SummarizedExpenseXmlReader(sender);
		reader.readXml(args[0]);
	}
	
}
