public class Person {
    public String name;
    private Address address;

    public Person() {
	name = "Rob";
	address = new Address();
	address.setStreet("Rob street");
	address.setCity("Rob city");
	address.setProvince("Rob province");
	address.setPostalCode("Rob postalcode");
    }

    public boolean IsPersonRob() {
	return name.equals("Rob") && IsRobsAddress();
    }

    private boolean IsRobsAddress() {
	return address.validateAddress();
    }
}