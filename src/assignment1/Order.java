package assignment1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import data.Item;

@XmlRootElement(name = "order")
public class Order {

	Dealer dealer;
	Deliveryaddress deliveryaddress;
	List<Item> orderitems = new ArrayList<>();

	@XmlElement
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public Dealer getDealer() {
		return dealer;
	}

	@XmlElement
	public void setDeliveryaddress(Deliveryaddress deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}

	public Deliveryaddress getDeliveryaddress() {
		return deliveryaddress;
	}

	@XmlElementWrapper(name = "orderitems")
	@XmlElement(name = "item")
	public List<Item> getOrderitems() {
		return orderitems;
	}
	

}
