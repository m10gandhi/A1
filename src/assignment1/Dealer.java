package assignment1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dealer {

	String dealerid;
	String dealeraccesskey;

	@XmlElement
	public void setDealerid(String dealerid) {
		this.dealerid = dealerid;
	}

	public String getDealerid() {
		return dealerid;
	}

	@XmlElement
	public void setDealeraccesskey(String dealeraccesskey) {
		this.dealeraccesskey = dealeraccesskey;
	}

	public String getDealeraccesskey() {
		return dealeraccesskey;
	}

}
