package com.allanvital.politicaaberta.fileparser.parser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.allanvital.politicaaberta.fileparser.model.Despesa;
import com.allanvital.politicaaberta.fileparser.sender.ExpenseSender;

public class SummarizedExpenseXmlReader {

	private ExpenseSender sender;

	public SummarizedExpenseXmlReader(ExpenseSender sender) {
		this.sender = sender;
	}
	
	public void readXml(String filename) throws IOException, JAXBException, XMLStreamException, FactoryConfigurationError {
		InputStream is = new FileInputStream(filename);
		JAXBContext jaxbContext = JAXBContext.newInstance(Despesa.class);
		XMLStreamReader xss = XMLInputFactory.newFactory().createXMLStreamReader(is);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		while (xss.hasNext()) {
			if (xss.next() == XMLStreamConstants.START_ELEMENT && xss.getLocalName().equals("DESPESA")) {
				JAXBElement<Despesa> unmarshalledObj = unmarshaller.unmarshal(xss, Despesa.class);
				Despesa despesa = unmarshalledObj.getValue();
				sender.send(despesa.buildDeputy());
				sender.send(despesa.buildExpense());
			}
		}
	}
	
}
