import java.util.Arrays;

class Restaurant {
	String name;
	String phone;
	String email;
	String address;
	String operatingHours;
	float rating;
	String[] reviews;
	int pricePerPerson;
	
	Restaurant() {}

	public Restaurant(String name, String phone, String email, String address, String operatingHours, float rating,
			String[] reviews, int pricePerPerson) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.operatingHours = operatingHours;
		this.rating = rating;
		this.reviews = reviews;
		this.pricePerPerson = pricePerPerson;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", email=" + email + ", address=" + address
				+ ", operatingHours=" + operatingHours + ", rating=" + rating + ", reviews=" + Arrays.toString(reviews)
				+ ", pricePerPerson=" + pricePerPerson + "]";
	}
	
	
	
	
}

public class Session1_07292021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant restaurant = new Restaurant();
		System.out.println(restaurant);
	}

}
