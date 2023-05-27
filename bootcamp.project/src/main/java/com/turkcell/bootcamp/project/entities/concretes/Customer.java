package com.turkcell.bootcamp.project.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name="customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Column(name = "customer_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String customerId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "contact_name")
    private String ContactName;

    @Column(name = "contact_title")
    private String ContactTitle;

    @Column(name = "address")
    private String Address;

    @Column(name = "city")
    private String City;

    @Column(name = "region")
    private String Region;

    @Column(name = "postal_code")
    private String PostalCode;

    @Column(name = "country")
    private String Country;

    @Column(name ="phone")
    private String Phone;

    @Column(name = "fax")
    private String Fax;

    @OneToMany(mappedBy= "customer")
    private List<Order> orders;

    @OneToMany(mappedBy= "customer")
    private List<CustomerCustomerDemo> customerCustomerDemos;



}
