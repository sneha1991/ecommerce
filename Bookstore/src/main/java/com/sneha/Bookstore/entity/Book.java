package com.sneha.Bookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="product")
public class Book {
	@Id    // to declare it is a primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String sku;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	public BigDecimal getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public BookCategory getCategory() {
		return category;
	}
	public void setCategory(BookCategory category) {
		this.category = category;
	}
	private String description;
	@Column(name="image_url")
	private String imageurl;
	private boolean active;
	@Column(name="units_in_stock")
	private int unitInStock;
	@Column(name="unit_price")
	private BigDecimal unitprice;
	@Column(name="date_created")
	private Date createdOn;
	@Column(name="last_updated")
	private Date updatedOn;
	@Override
	public String toString() {
		return "Book [id=" + id + ", sku=" + sku + ", name=" + name + ", description=" + description + ", imageurl="
				+ imageurl + ", active=" + active + ", unitInStock=" + unitInStock + ", unitprice=" + unitprice
				+ ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + ", category=" + category + "]";
	}
	@ManyToOne
	@JoinColumn(name="category_id",nullable =false)
	private BookCategory category;
}
