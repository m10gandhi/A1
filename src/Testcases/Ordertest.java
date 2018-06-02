package Testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.java.example.assgn1.impl.OrderProcessing;

import assignment1.Dealer;
import assignment1.Order;
import data.Orderdata;

public class Ordertest {

	OrderProcessing orderProcessing = null;

	private Order getOrder(String xml) {

		Order order1 = null;
		try {
			StringReader reader = new StringReader(xml);
			JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			order1 = (Order) jaxbUnmarshaller.unmarshal(reader);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return order1;
	}

	final String delivery_addr = "<order> <dealer> <dealerid>XXX-1234-ABCD-1234</dealerid> <dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey> </dealer> <orderitems>  <item> <partnumber>5680</partnumber> <quantity>2</quantity> </item> <item> <partnumber>5678</partnumber> <quantity>25</quantity> </item> </orderitems> </order>";
	final String valid_order = "<order> <dealer> <dealerid>XXX-1234-ABCD-1234</dealerid> <dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey> </dealer> <orderitems> <item> <partnumber>1234</partnumber> <quantity>2</quantity> </item> <item> <partnumber>5678</partnumber> <quantity>25</quantity> </item> </orderitems> <deliveryaddress> <name>Mrs. Jane Smith</name> <street>35 Streetname</street> <city>Halifax</city> <province>NS</province> <postalcode>B2T1A4</postalcode> </deliveryaddress> </order>";
	final String invalid_dealerid = "<order> <dealer> <dealerid></dealerid> <dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey> </dealer> <orderitems> <item> <partnumber>1234</partnumber> <quantity>2</quantity> </item> <item> <partnumber>5678</partnumber> <quantity>25</quantity> </item> </orderitems> <deliveryaddress> <name>Mrs. Jane Smith</name> <street>35 Streetname</street> <city>Halifax</city> <province>NS</province> <postalcode>B2T1A4</postalcode> </deliveryaddress> </order>";
	final String invalid_dealeraccesskey = "<order> <dealer> <dealerid>XXX-1234-ABCD-1234</dealerid> <dealeraccesskey></dealeraccesskey> </dealer> <orderitems> <item> <partnumber>1234</partnumber> <quantity>2</quantity> </item> <item> <partnumber>5678</partnumber> <quantity>25</quantity> </item> </orderitems> <deliveryaddress> <name>Mrs. Jane Smith</name> <street>35 Streetname</street> <city>Halifax</city> <province>NS</province> <postalcode>B2T1A4</postalcode> </deliveryaddress> </order>";
	final String invalid_deliveryadd = "<order> <dealer> <dealerid>XXX-1234-ABCD-1234</dealerid> <dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey> </dealer> <orderitems> <item> <partnumber>1234</partnumber> <quantity>2</quantity> </item> <item> <partnumber>5678</partnumber> <quantity>25</quantity> </item> </orderitems> <deliveryaddress> </deliveryaddress> </order>";
	final String invalid_street = "<order> <dealer> <dealerid>XXX-1234-ABCD-1234</dealerid> <dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey> </dealer> <orderitems> <item> <partnumber>1234</partnumber> <quantity>2</quantity> </item> <item> <partnumber>5678</partnumber> <quantity>25</quantity> </item> </orderitems> <deliveryaddress> <name>Mrs. Jane Smith</name> <street></street> <city>Halifax</city> <province>NS</province> <postalcode>B2T1A4</postalcode> </deliveryaddress> </order>";
	final String invalid_pro = "<order> <dealer> <dealerid>XXX-1234-ABCD-1234</dealerid> <dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey> </dealer> <orderitems> <item> <partnumber>1234</partnumber> <quantity>2</quantity> </item> <item> <partnumber>5678</partnumber> <quantity>25</quantity> </item> </orderitems> <deliveryaddress> <name>Mrs. Jane Smith</name> <street>35 Streetname</street> <city>Halifax</city> <province></province> <postalcode>B2T1A4</postalcode> </deliveryaddress> </order>";
	final String invalid_pos = "<order> <dealer> <dealerid>XXX-1234-ABCD-1234</dealerid> <dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey> </dealer> <orderitems> <item> <partnumber>1234</partnumber> <quantity>2</quantity> </item> <item> <partnumber>5678</partnumber> <quantity>25</quantity> </item> </orderitems> <deliveryaddress> <name>Mrs. Jane Smith</name> <street>35 Streetname</street> <city>Halifax</city> <province>NS</province> <postalcode></postalcode> </deliveryaddress> </order>";	
	final String invalid_dealer = "<order> <orderitems> <item> <partnumber>1234</partnumber> <quantity>2</quantity> </item> <item> <partnumber>5678</partnumber> <quantity>25</quantity> </item> </orderitems> <deliveryaddress> <name>Mrs. Jane Smith</name> <street>35 Streetname</street> <city>Halifax</city> <province>NS</province> <postalcode>B2T1A4</postalcode> </deliveryaddress> </order>";
	final String invalid_orderitem = "<order> <dealer> <dealerid>XXX-1234-ABCD-1234</dealerid> <dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey> </dealer> <orderitems></orderitems> <deliveryaddress> <name>Mrs. Jane Smith</name> <street>35 Streetname</street> <city>Halifax</city> <province>NS</province> <postalcode>B2T1A4</postalcode> </deliveryaddress> </order>";
	final String invalid_partnumber = "<order> <dealer> <dealerid>XXX-1234-ABCD-1234</dealerid> <dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey> </dealer> <orderitems> <item> <partnumber>1201</partnumber> <quantity>2</quantity> </item> <item> <partnumber>5678</partnumber> <quantity>25</quantity> </item> </orderitems> <deliveryaddress> <name>Mrs. Jane Smith</name> <street>35 Streetname</street> <city>Halifax</city> <province>NS</province> <postalcode>B2T1A4</postalcode> </deliveryaddress> </order>";
	final String invalid_partnumber2 = "<order> <dealer> <dealerid>XXX-1234-ABCD-1234</dealerid> <dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey> </dealer> <orderitems> <item> <partnumber>5677</partnumber> <quantity>2</quantity> </item> <item> <partnumber>1261</partnumber> <quantity>25</quantity> </item> </orderitems> <deliveryaddress> <name>Mrs. Jane Smith</name> <street>35 Streetname</street> <city>Halifax</city> <province>NS</province> <postalcode>B2T1A4</postalcode> </deliveryaddress> </order>";	
	final String invalid_partnumber3 = "<order> <dealer> <dealerid>XXX-1234-ABCD-1234</dealerid> <dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey> </dealer> <orderitems>  </orderitems> <deliveryaddress> <name>Mrs. Jane Smith</name> <street>35 Streetname</street> <city>Halifax</city> <province>NS</province> <postalcode>B2T1A4</postalcode> </deliveryaddress> </order>";
	final String invalid_partnumber4 = "<order> <dealer> <dealerid>XXX-1234-ABCD-1234</dealerid> <dealeraccesskey>kkklas8882kk23nllfjj88290</dealeraccesskey> </dealer> <orderitems> <item> <partnumber>1234</partnumber> <quantity>2</quantity> </item> <item> <partnumber>1235</partnumber> <quantity>25</quantity> </item> </orderitems> <deliveryaddress> <name>Mrs. Jane Smith</name> <street>35 Streetname</street> <city>Halifax</city> <province>NS</province> <postalcode>B2T1A4</postalcode> </deliveryaddress> </order>";	

	@Test
	@DisplayName("OrderTest")
	void invalidDeleiveryAddress() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(delivery_addr);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
		assertEquals("Failure", res.getResult());
		assertEquals("Invalid xml", res.getError());
	}
	
	@Test
	@DisplayName("OrderTest")
	void invalidorderitem() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(invalid_orderitem);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
		assertEquals("failure", res.getResult());
		assertEquals("Invalid order item entry", res.getErrormessage());
		assertEquals("Invalid xml", res.getError());
	}
	
	@Test
	@DisplayName("OrderTest")
	void validOrder() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(valid_order);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
		assertEquals(2, res.getOrderitems().size());
	}
	
	@Test
	@DisplayName("OrderTest")
	void invalidDealerid() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(invalid_dealerid);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
		assertEquals("Failure", res.getResult());
		assertEquals("Invalid xml", res.getError());
	}
	
	@Test
	@DisplayName("OrderTest")
	void invalidDealeraccesskey() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(invalid_dealeraccesskey);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
		assertEquals("Failure", res.getResult());
		assertEquals("Invalid xml", res.getError());
	}
	
	@Test
	@DisplayName("OrderTest")
	void wrongdeliveryadd() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(invalid_deliveryadd);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
		assertEquals("failure", res.getResult());
		assertEquals("Invalid xml", res.getError());
		
	}
	
	@Test
	@DisplayName("OrderTest")
	void invalidstreet() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(invalid_street);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
		assertEquals("failure", res.getResult());
		assertEquals("Invalid xml", res.getError());
	}
	
	@Test
	@DisplayName("OrderTest")
	void invalidprovince() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(invalid_pro);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
		assertEquals("failure", res.getResult());
		assertEquals("Invalid xml", res.getError());
	}
	
	@Test
	@DisplayName("OrderTest")
	void invalidpostal() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(invalid_pos);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
		assertEquals("failure", res.getResult());
		assertEquals("Invalid xml", res.getError());
	}
	
	@Test
	@DisplayName("OrderTest")
	void invaliddealer() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(invalid_dealer);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
		assertEquals("failure", res.getResult());
		assertEquals("Invalid xml", res.getError());
	}
	
	@Test
	@DisplayName("OrderTest")
	void invalidpartofs() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(invalid_partnumber);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
	}
	
	@Test
	@DisplayName("OrderTest")
	void invalidpartnlm() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(invalid_partnumber2);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
	}
	
	@Test
	@DisplayName("OrderTest")
	void invalidpartin() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(invalid_partnumber3);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
	}
	
	@Test
	@DisplayName("OrderTest")
	void invalidpartsucc() {
		orderProcessing = new OrderProcessing();
		Order order = getOrder(invalid_partnumber4);
		Orderdata res = orderProcessing.processOrders(order);
		assertNotNull(res);
	}
}
