package kodlamaIoNLayeredDemo.entities;

public class User {
	private int id;
	private String peronalityType;
	private String city;
	private String country;
	private String paymentId;
	private String zipCode;
	private String mail;
		
	public User(int id, String peronalityType, String city, String country, String paymentId, String zipCode,
			String mail) {
		super();
		this.id = id;
		this.peronalityType = peronalityType;
		this.city = city;
		this.country = country;
		this.paymentId = paymentId;
		this.zipCode = zipCode;
		this.mail = mail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPeronalityType() {
		return peronalityType;
	}

	public void setPeronalityType(String peronalityType) {
		this.peronalityType = peronalityType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
}
