package com.java.example.assgn1;

import assignment1.Deliveryaddress;

public interface PARTMANAGER
{
	public enum PartResponse
	{
		SUCCESS,
		OUT_OF_STOCK,
		NO_LONGER_MANUFACTURED,
		INVALID
	}

	

	// Submit part for manufacture and delivery.
	public PartResponse SubmitPartForManufactureAndDelivery(int partnumber, int quantity, Deliveryaddress deliveryaddress);
}