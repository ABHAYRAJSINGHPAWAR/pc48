package stacks;

public class Customer {
	int id;
	String name;
	String address;
	
	//constructor
	public Customer(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	//toString
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
}
