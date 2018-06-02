package data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Item {

	Integer partnumber;
	Integer quantity;
	String errormessage;
	String result;

	@XmlElement
	public void setPartnumber(Integer partnumber) {
		this.partnumber = partnumber;
	}

	public Integer getPartnumber() {
		return partnumber;
	}

	@XmlElement
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	@XmlElement
	public void setResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return result;
	}

	@XmlElement
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}

	public String getErrormessage() {
		return errormessage;
	}

}
