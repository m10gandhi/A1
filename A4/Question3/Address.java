
public class Address {
    String street;
    String city;
    String province;
    String postalCode;

    public String getStreet() {
	return street;
    }

    public void setStreet(String street) {
	this.street = street;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getProvince() {
	return province;
    }

    public void setProvince(String province) {
	this.province = province;
    }

    public String getPostalCode() {
	return postalCode;
    }

    public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
    }

    public boolean validateAddress() {
	return street.equals("Rob street") && city.equals("Rob city") && province.equals("Rob province")
		&& postalCode.equals("Rob postalcode");
    }
}
