package com.java.example.assgn1.impl;

import com.java.example.assgn1.PARTMANAGER;
import com.java.example.assign.database;

import assignment1.Deliveryaddress;

public class partmanimplement implements PARTMANAGER {

	@Override
	public PartResponse SubmitPartForManufactureAndDelivery(int partnumber, int quantity, Deliveryaddress deliveryaddress ) {
		
		database db = new database(); 
		
		if(! db.outofstockchecking(partnumber))
		{
			return PARTMANAGER.PartResponse.OUT_OF_STOCK;
		}
		
		if(! db.nolongeravail(partnumber) )
		{
			return PARTMANAGER.PartResponse.NO_LONGER_MANUFACTURED;
		}
		
		if( 
				db.itemavail(partnumber))
		{
			return PARTMANAGER.PartResponse.SUCCESS;
		}
		return PARTMANAGER.PartResponse.INVALID;
	}

}
