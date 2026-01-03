package Workshop;

import java.util.ArrayList;

class Product{
	String productId;
	String name;
	double price;
	int stockQuantity;
	
	public Product(String productId, String name, double price, int stockQuantity) {
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.stockQuantity=stockQuantity;
	}
	public void getDetails() {
		System.out.println("Product: "+name+" Price: "+price+"Stock: "+stockQuantity);
	}
	public boolean checkAvailability(int quantity) {
		return quantity <= stockQuantity;
	}
}
class ShoppingCart{		
	ArrayList<Product> cartItems;
	double totalPrice;
	public ShoppingCart() {
		cartItems = new ArrayList<>();
		totalPrice =0.0;
		
	}
	public void addProduct(Product product, int quantity) {
		if(product.checkAvailability(quantity)) {
			for(int i = 0; i<quantity; i++) {
				cartItems.add(product);
			}
			System.out.println(quantity+" x "+product.name+" added to cart ");
		}else {
			System.out.println("Not enough stock for "+product.name);
		}
	}
	public void removeProduct(Product product) {
		if(cartItems.remove(product)) {
			System.out.println(product.name+" removed from cart");
		}else {
			System.out.println("Product not found in cart");
		}
	}
	public double calculateTotalPrice() {
		totalPrice = 0;
		for(Product item : cartItems) {
			totalPrice += item.price;
		}
		return totalPrice;
	}
	public void viewCartItems() {
		if(cartItems.isEmpty()) {
			System.out.println("Cart is empty");
		}else {
			for (Product item:cartItems) {
				System.out.println("- "+item.name+": "+item.price);
			}
		}
	}

}
class Customer{
	String customerId;
	String name;
	String email;
	String password;
	ShoppingCart cart;
	ArrayList<Product> products;
	public Customer(String customerId, String name, String email, String password, ShoppingCart cart) {
		this.customerId=customerId;
		this.name=name;
		this.email=email;
		this.password=password;
		this.cart=cart;
		this.products = new ArrayList<>();
		
	}
	public void register() {
		System.out.println(name+" registered successfully");
	}
	public boolean login(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            System.out.println("Login successful! Welcome " + name);
            return true;
        }
        System.out.println("Login failed!");
        return false;
	}
	public void viewProducts() {
        for (Product product : products) {
            product.getDetails();
        }
    }
    
    public void addToCart(Product product, int quantity) {
        cart.addProduct(product, quantity);
    }
    
    public void checkout() {
        cart.viewCartItems();
        System.out.println("Thank you for your purchase, " + name);
        cart = new ShoppingCart();
    }
}
public class ECommerceSystem {
    public static void main(String[] args) {
        Product laptop = new Product("P001", "Laptop", 999.99, 10);
        Product phone = new Product("P002", "Smartphone", 699.99, 20);
        Product headphone = new Product("P003", "Headphones", 199.99, 15);
        
        ShoppingCart cart = new ShoppingCart();
        Customer customer = new Customer("C001", "Mark Zuckerberg", "mark@email.com", "password1234", cart);
        
        customer.register();
        
        customer.login("mark@email.com", "password1234");
        
        customer.products.add(laptop);
        customer.products.add(phone);
        customer.products.add(headphone);
        
        customer.viewProducts();
        
        customer.addToCart(laptop, 1);
        customer.addToCart(phone, 2);
        customer.addToCart(headphone, 1);
        
        customer.cart.viewCartItems();
        
        customer.cart.removeProduct(phone);
        customer.cart.viewCartItems();
        
        customer.checkout();
    }
}