package com.java.example.assign;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class database {

final Integer QUANTITY_LIMIT = 50;
	
	List<String> adealerid = new ArrayList<>(
		Arrays.asList("XXX-1234-ABCD-1231","XXX-1235-ABCD-1231","XXX-1236-ABCD-1231","XXX-1237-ABCD-1231","XXX-1238-ABCD-1231","XXX-1234-ABCD-1232","XXX-1235-ABCD-1233","XXX-1236-ABCD-1234","XXX-1237-ABCD-1235","XXX-1238-ABCD-1236"));
	
	List<String> adealeraccesskey = new ArrayList<>(
			Arrays.asList("kkklas8882kk23nllfjj88290","kkklas8892kk23nllfjj88290","kkklas8982kk23nllfjj88290","kkklas9892kk23nllfjj88290","kkklas8882kk23nllfjj98290","kkklas8892kk23nllfjj89290","kkklas8982kk23nllfjj88390","kkklas9892kk23nllfjj88280"));
	List<Integer> aoutoforder = new ArrayList<>(
			Arrays.asList(1201,1202,1203,1204,1205,1101,1102,1103,1104,1105));
	List<Integer> isavail = new ArrayList<>(
			Arrays.asList(1231,1232,1233,1234,1235,1221,1222,1223,1224,1225));
	List<Integer> nolongermanufactures = new ArrayList<>(
			Arrays.asList(1261,1251,1241,1231,1221,1262,1252,1242,1232,1222));
	

	public boolean Dealeridauthentication(String dealerid) {
		if(adealerid.contains(dealerid))
			return true;
		return false;
	}
	
	public boolean Dealeraccesskeyauthentication(String dealeraccesskey) {
		if(adealeraccesskey.contains(dealeraccesskey))
			return true;
		return false;
	}
	public boolean outofstockchecking(int partnumber) {
		if(aoutoforder.contains(partnumber))
			return true;
		return false;
	}
	public boolean nolongeravail(int partnumber) {
		if(nolongermanufactures.contains(partnumber))
			return true;
		return false;
	}
	public boolean itemavail(int partnumber) {
		if(isavail.contains(partnumber))
			return true;
		return false;
	}
	
}
