package kodlamaIoNLayeredDemo.entities;

public class CompanyUser extends User {
	private String taxnumber;
	private String name;

	public CompanyUser(int id, String peronalityType, String city, String country, String paymentId, String zipCode,
			String mail, String taxnumber, String name) {
		super(id, peronalityType, city, country, paymentId, zipCode, mail);
		this.taxnumber = taxnumber;
		this.name = name;
	}

	public String getTaxnumber() {
		return taxnumber;
	}

	public void setTaxnumber(String taxnumber) {
		this.taxnumber = taxnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
