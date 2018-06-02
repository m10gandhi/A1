package assignment1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import data.Orderdata;

public class XMLparser {

	public Order parseXmlToObject(String filename) {
		Order order = null;
		try {
			File file = new File(filename);

			JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			order = (Order) jaxbUnmarshaller.unmarshal(file);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return order;

	}
	
	public void parseObjectToXml(Orderdata response, String filename) {
		try {
			
			FileWriter  writer = new FileWriter(filename);
			JAXBContext jaxbContext = JAXBContext.newInstance(Orderdata.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(response, writer);
			jaxbMarshaller.marshal(response, System.out);
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}

	}

}
