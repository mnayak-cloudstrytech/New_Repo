package dto;

import java.util.*;

public class User {
    private String username;
    private String password;
    private List<Product> productList;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.productList = new ArrayList<>();
    }

    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public void addProductToCart(Product product) {
        productList.add(product);
    }
    public double calculateTotalBill() {
        double totalBill = 0;
        for (Product product : productList) {
            totalBill += product.getSellingPrice();
        }
        return totalBill;
    }

    public void redeemSuperCoins() {
    	 
    }
}
