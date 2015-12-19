package com.allanvital.politicaaberta.fileparser;

import java.io.IOException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;

import com.allanvital.politicaaberta.fileparser.parser.SummarizedExpenseXmlReader;
import com.allanvital.politicaaberta.fileparser.sender.ExpenseSender;

public class App {

	public static void main(String[] args) throws IOException, JAXBException, XMLStreamException, FactoryConfigurationError {
		ExpenseSender sender = new ExpenseSender();
		SummarizedExpenseXmlReader reader = new SummarizedExpenseXmlReader(sender);
		reader.readXml(args[0]);
	}
	
}
