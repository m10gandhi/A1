
public class UserPhoneNumber {
    private String areaCode;
    private String phoneNumber;

    public void SetAreaCode(String areaCode) {
	this.areaCode = areaCode;
    }

    public String GetAreaCode() {
	return areaCode;
    }

    public void SetPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
    }

    public String GetPhoneNumber() {
	if (areaCode != null && areaCode != "") {
	    return "(" + areaCode + ") " + phoneNumber;
	}
	return phoneNumber;
    }

}
