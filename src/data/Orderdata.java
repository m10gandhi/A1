package data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "order")
public class Orderdata {

	String result;
	String error;
	String errormessage;
	List<Item> orderitems = new ArrayList<>();


	@XmlElement
	public void setResult(String result)
	{
		this.result = result;
	}
	public String getResult()
	{
		return result;
	}
	
	@XmlElement
	public void setError(String error)
	{
		this.error = error;
	}
	public String getError()
	{
		return error;
	}
	
	@XmlElement
	public void setErrormessage(String errormessage)
	{
		this.errormessage = errormessage;
	}
	public String getErrormessage()
	{
		return errormessage;
	}
	
	@XmlElementWrapper(name = "orderitems")
	@XmlElement(name = "item")
	public List<Item> getOrderitems() {
		return orderitems;
	}
	public void setOrderitems(List<Item> orderitems) {
		this.orderitems = orderitems;
	}
	
	
	
}
