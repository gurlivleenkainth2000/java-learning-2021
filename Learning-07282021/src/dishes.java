class Dishescatalog{
	String name;
	int price;
	float rating;
	String discreption;

	Dishescatalog(){
		
	}

	public Dishescatalog(String name, int price, float rating, String discreption) {
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discreption = discreption;
	}

	@Override
	public String toString() {
		return "Dishes [name=" + name + ", price=" + price + ", rating=" + rating + ", discreption=" + discreption
				+ "]";
	}
	
}


public class dishes {
	public static void main(String[] args) {
		Dishescatalog dishes = new Dishescatalog();
		System.out.println(dishes);
				
				
	}
}
