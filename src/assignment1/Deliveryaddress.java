package assignment1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "deliveryaddress")
public class Deliveryaddress {

	String name;
	String street;
	String city;
	String province;
	String postalcode;

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	@XmlElement
	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvince() {
		return province;
	}

	@XmlElement(name = "postalcode")
	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	


}
