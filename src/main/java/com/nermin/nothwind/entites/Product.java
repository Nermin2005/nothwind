package com.nermin.nothwind.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private int id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "category_id")
    private int categoryId;
    @Column(name = "quentity_per_unit")
    private String quentityPerUnit ;
    @Column(name = "unit_price")
    private int unitPrice;



}
