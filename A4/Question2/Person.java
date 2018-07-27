public class Person {
    private String name;

    private AuthenticateUser authenticateUser = new AuthenticateUser();

    private UserPhoneNumber phoneNumber = new UserPhoneNumber();

    public Person(String name) {
	this.name = name;
    }

    public void SetAreaCode(String areaCode) {
	phoneNumber.SetAreaCode(areaCode);
    }

    public String GetAreaCode() {
	return phoneNumber.GetAreaCode();
    }

    public void SetPhoneNumber(String number) {
	phoneNumber.SetPhoneNumber(number);
    }

    public String GetPhoneNumber() {
	return phoneNumber.GetPhoneNumber();
    }

    public void SetLoginCredentials(String userName, String password) {
	authenticateUser.setUserName(userName);
	authenticateUser.setPassword(password);
    }

    public boolean AuthenticateUser() {
	return authenticateUser.returnAuthenticateUser();
    }
}