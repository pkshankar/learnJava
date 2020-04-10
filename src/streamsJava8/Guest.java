package streamsJava8;

public class Guest {

	private String guestName;
	private String guestGender;
	private int guestAge;

	public Guest(String guestName, String guestGender, int guestAge) {

		this.guestName = guestName;
		this.guestGender = guestGender;
		this.guestAge = guestAge;
	}

	public String getGuestName() {
		return guestName;
	}

	public String getGuestGender() {
		return guestGender;
	}

	public int getGuestAge() {
		return guestAge;
	}

	@Override
	public String toString() {
		return "Guest [guestName=" + guestName + ", guestGender=" + guestGender + ", guestAge=" + guestAge + "]";
	}

}
