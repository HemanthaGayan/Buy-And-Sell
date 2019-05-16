package com.pranavi.productmanagementspring.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Product")
public class Products implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_no;



    @Column(name="Product_name")
    private String Product_name;

    @Column(name="Product_image")
    private String Product_image;

    @Column(name="Product_price")
    private long product_price;

    @Column(name="Product_quantity")
    private int product_quantity;

    @Column(name="Product_brand")
    private String Product_brand;

    public Products() {
    }

    public long getProduct_no() {
        return product_no;
    }

    public void setProduct_no(long product_no) {
        this.product_no = product_no;
    }

    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }

    public String getProduct_image() {
        return Product_image;
    }

    public void setProduct_image(String product_image) {
        Product_image = product_image;
    }

    public long getProduct_price() {
        return product_price;
    }

    public void setProduct_price(long product_price) {
        this.product_price = product_price;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public String getProduct_brand() {
        return Product_brand;
    }

    public void setProduct_brand(String product_brand) {
        Product_brand = product_brand;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product_no=" + product_no +
                ", Product_name='" + Product_name + '\'' +
                ", Product_image='" + Product_image + '\'' +
                ", product_price=" + product_price +
                ", product_quantity=" + product_quantity +
                ", Product_brand='" + Product_brand + '\'' +
                '}';
    }
}
