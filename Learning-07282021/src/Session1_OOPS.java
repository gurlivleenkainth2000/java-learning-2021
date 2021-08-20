class Person {
	String name;
	String email;
	String phone;
	String address;
	
	public Person() { }

	public Person(String name, String email, String phone, String address) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [ \n name= " + name + ", \n email= " + email + ", \n phone= " + phone + ", \n address= " + address + "\n]";
	}
}

class Valet extends Person {
	String currentLatitude;
	String currentLongitude;
	String area;
	String workHours;
	
	public Valet() { }
	
	public Valet(String currentLatitude, String currentLongitude, String area, String workHours) {
		this.currentLatitude = currentLatitude;
		this.currentLongitude = currentLongitude;
		this.area = area;
		this.workHours = workHours;
	}	
	
	public Valet(String name, String email, String phone, String address, String currentLatitude,
			String currentLongitude, String area, String workHours) {
		super(name, email, phone, address);
		this.currentLatitude = currentLatitude;
		this.currentLongitude = currentLongitude;
		this.area = area;
		this.workHours = workHours;
	}

	@Override
	public String toString() {
		return "Valet [currentLatitude=" + currentLatitude + ", currentLongitude=" + currentLongitude + ", area=" + area
				+ ", workHours=" + workHours + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + "]";
	}	
}

public class Session1_OOPS {
	
	public static void main(String[] args) {
		Person person = new Person("Gurlivleen Singh", "josh@ex.com", "1234567890", "");
//		Valet person = new Valet("Gurlivleen Singh", "josh@ex.com", "1234567890", "", "", "", "", "");
		System.out.println(person);
	}
}
