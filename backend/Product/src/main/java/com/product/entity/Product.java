package com.product.entity;


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
import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long id;

    @ManyToOne
    @JoinColumn(name= "category_id",nullable = false)
    private ProductCategory category;

  private String sku;
  private String name;
  private String description;
  @Column(name="image_url")
  private String imageUrl;
  @Column(name="unit_price")
  private BigDecimal unitPrice;
  private Boolean active;

  @Column(name="units_in_stock")
  private int unitsInStock;
  @Column(name="date_created")
  private Date dateCreated;
  @Column(name="last_updated")
  private Date lastUpdated;


}
