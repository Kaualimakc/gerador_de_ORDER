package entites;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Client {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String email;
	private Date bithDate;
	
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.bithDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBithDate() {
		return bithDate;
	}

	public void setBithDate(Date bithDate) {
		this.bithDate = bithDate;
	}
	public String toString() {
		return name +"("+sdf.format(bithDate)+")-" + email;
	}
}
