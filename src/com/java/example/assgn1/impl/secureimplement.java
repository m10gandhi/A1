package com.java.example.assgn1.impl;

import com.java.example.assgn1.Security;
import com.java.example.assign.database;

public class secureimplement implements Security {

	@Override
	public boolean IsDealerAuthorized(String dealerid, String dealeraccesskey) {
		
		database db = new database();
		
		if(! db.Dealeridauthentication(dealerid) && ! db.Dealeraccesskeyauthentication(dealeraccesskey))
		{
			return false;
		}
		else {
		
			return true;
		}
	}

}
