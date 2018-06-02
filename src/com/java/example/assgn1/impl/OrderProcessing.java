package com.java.example.assgn1.impl;

import com.java.example.assgn1.PARTMANAGER;

import assignment1.Order;
import assignment1.XMLparser;
import data.Orderdata;

public class OrderProcessing {

	public Orderdata processOrders(Order order) {

		Orderdata response = new Orderdata();

		if (order.getDealer() == null) {
			response.setResult("failure");
			response.setError("Invalid xml");
			response.setOrderitems(null);
			return response;
		}

		if (order.getDeliveryaddress() == null) {
			response.setResult("Failure");
			response.setError("Invalid xml");
			response.setOrderitems(null);
			return response;
		}

		if (order.getDealer() == null || order.getDealer().getDealerid() == null
				|| order.getDealer().getDealerid().isEmpty() 
				|| order.getDealer().getDealeraccesskey() == null
				|| order.getDealer().getDealeraccesskey().isEmpty()) {
			response.setResult("Failure");
			response.setError("Invalid xml");
			response.setOrderitems(null);
			return response;
		}

		if (order.getDeliveryaddress().getCity() == null || order.getDeliveryaddress().getCity().isEmpty()) {
			response.setError("Invalid xml");
			response.setResult("failure");
			response.setOrderitems(null);
			return response;
		}

		if (order.getDeliveryaddress().getProvince() == null || order.getDeliveryaddress().getProvince().isEmpty()) {
			response.setError("Invalid xml");
			response.setOrderitems(null);
			response.setResult("failure");
			return response;
		}

		if (order.getDeliveryaddress().getPostalcode() == null
				|| order.getDeliveryaddress().getPostalcode().isEmpty()) {
			response.setError("Invalid xml");
			response.setResult("failure");
			response.setOrderitems(null);
			return response;
		}

		if (order.getDeliveryaddress().getStreet() == null || order.getDeliveryaddress().getStreet().isEmpty()) {
			response.setError("Invalid xml");
			response.setResult("failure");
			response.setOrderitems(null);
			return response;
		}

		if (order.getOrderitems() == null || order.getOrderitems().size() <= 0) {
			response.setError("Invalid xml");
			response.setResult("failure");
			response.setOrderitems(null);
			response.setErrormessage("Invalid order item entry");
			return response;
		}

		for (data.Item item : order.getOrderitems()) {

			partmanimplement part1 = new partmanimplement();
			PARTMANAGER.PartResponse res = part1.SubmitPartForManufactureAndDelivery(item.getPartnumber(),
					item.getQuantity(), order.getDeliveryaddress());

			data.Item resItem = new data.Item();

			resItem.setPartnumber(item.getPartnumber());
			resItem.setQuantity(item.getQuantity());

			if (res.equals(PARTMANAGER.PartResponse.SUCCESS)) {
				resItem.setResult("success");
				resItem.setErrormessage("");
			} else if (res.equals(PARTMANAGER.PartResponse.OUT_OF_STOCK)) {
				resItem.setResult("failure");
				resItem.setErrormessage("out of stock");
			} else if (res.equals(PARTMANAGER.PartResponse.NO_LONGER_MANUFACTURED)) {
				resItem.setResult("failure");
				resItem.setErrormessage("no longer available");
			} else if (res.equals(PARTMANAGER.PartResponse.INVALID)) {
				resItem.setResult("failure");
				resItem.setErrormessage("invalid part");
			}
			response.getOrderitems().add(resItem);
		}

		return response;
	}

	public static void main(String[] args) {
		String filename = "src/com/java/example/assgn1/Incomingorder.xml";
		OrderProcessing orderProcessing = new OrderProcessing();
		XMLparser xmLparser = new XMLparser();
		Order order = xmLparser.parseXmlToObject(filename);
		Orderdata response = orderProcessing.processOrders(order);
		System.out.println(response);
		filename = "src/Dealerresponse.xml";
		xmLparser.parseObjectToXml(response, filename);

	}
}
