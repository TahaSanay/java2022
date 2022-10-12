package kodlamaIoNLayeredDemo.entities;

public class InstructorUser extends User {
	private String firstName;
	private String lastName;

	public InstructorUser(int id, String peronalityType, String city, String country, String paymentId, String zipCode,
			String mail, String firstName, String lastName) {
		super(id, peronalityType, city, country, paymentId, zipCode, mail);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
