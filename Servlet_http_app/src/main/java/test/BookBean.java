package test;
import java.io.*;

public class BookBean implements Serializable {
	
	private String code,name,author;
	private float price;
	private int qty;
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public float getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public BookBean() {}
	
}
