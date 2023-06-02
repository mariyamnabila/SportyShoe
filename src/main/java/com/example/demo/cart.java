package com.example.demo;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class cart {
	@Id
	@GeneratedValue
	
	private long cartid;
	private String username;
	private Long productid;
	private String productcategory;
	private String productname;
	@Override
	public String toString() {
		return "cart [cartid=" + cartid + ", username=" + username + ", productid=" + productid + ", productcategory="
				+ productcategory + ", productname=" + productname + ", productprice=" + productprice + ", orderno="
				+ orderno + ", dateofpurchase=" + dateofpurchase + ", payment=" + payment + "]";
	}
	public cart(long cartid, String username, Long productid, String productcategory, String productname,
			String productprice, String orderno, Date dateofpurchase, String payment) {
		super();
		this.cartid = cartid;
		this.username = username;
		this.productid = productid;
		this.productcategory = productcategory;
		this.productname = productname;
		this.productprice = productprice;
		this.orderno = orderno;
		this.dateofpurchase = dateofpurchase;
		this.payment = payment;
	}
	public cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCartid() {
		return cartid;
	}
	public void setCartid(long cartid) {
		this.cartid = cartid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public Date getDateofpurchase() {
		return dateofpurchase;
	}
	public void setDateofpurchase(Date dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	private String productprice;
	
	private String orderno;
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date dateofpurchase;
	private String payment;
}
