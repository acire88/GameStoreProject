package com.company.GameStoreProject;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Invoice {

    @Autowired
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Length(max = 11)
    private Integer invoice_id;
    @NotEmpty
    @Length(max = 80)
    private String name;
    @NotEmpty
    @Length(max=30)
    private String street;
    @NotEmpty
    @Length(max=30)
    private String city;
    @NotEmpty
    @Length(max=30)
    private String state;
    @NotEmpty
    @Length(max=5)
    private String zipcode;
    @NotEmpty
    @Length(max=20)
    private Integer item_type;
    @NotEmpty
    @Length(max=11)
    private Integer item_id;
    @NotEmpty
    @Length(max=5, min=2)
    private Double unit_price;
    @NotEmpty
    @Length(max=11)
    private Integer quantity;
    @NotEmpty
    @Length(max=5, min=2)
    private Integer subtotal;
    @NotEmpty
    @Length(max=5, min=2)
    private Double tax;
    @NotEmpty
    @Length(max=5, min=2)
    private Double processing_fee;
    @NotEmpty
    @Length(max=5, min=2)
    private Double total;

    public Invoice(){}

    public Invoice(@Length(max = 11) Integer invoice_id, @NotEmpty @Length(max = 80) String name, @NotEmpty @Length(max = 30) String street, @NotEmpty @Length(max = 30) String city, @NotEmpty @Length(max = 30) String state, @NotEmpty @Length(max = 5) String zipcode, @NotEmpty @Length(max = 20) Integer item_type, @NotEmpty @Length(max = 11) Integer item_id, @NotEmpty @Length(max = 5, min = 2) Double unit_price, @NotEmpty @Length(max = 11) Integer quantity, @NotEmpty @Length(max = 5, min = 2) Integer subtotal, @NotEmpty @Length(max = 5, min = 2) Double tax, @NotEmpty @Length(max = 5, min = 2) Double processing_fee, @NotEmpty @Length(max = 5, min = 2) Double total) {
        this.invoice_id = invoice_id;
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.item_type = item_type;
        this.item_id = item_id;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.subtotal = subtotal;
        this.tax = tax;
        this.processing_fee = processing_fee;
        this.total = total;
    }
    

    public Integer getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Integer invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Integer getItem_type() {
        return item_type;
    }

    public void setItem_type(Integer item_type) {
        this.item_type = item_type;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getProcessing_fee() {
        return processing_fee;
    }

    public void setProcessing_fee(Double processing_fee) {
        this.processing_fee = processing_fee;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
