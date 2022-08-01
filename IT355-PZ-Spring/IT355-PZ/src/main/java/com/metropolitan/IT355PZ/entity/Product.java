package com.metropolitan.IT355PZ.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "product")
@XmlRootElement
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByIdProduct", query = "SELECT p FROM Product p WHERE p.idProduct = :idProduct")
    , @NamedQuery(name = "Product.findByName", query = "SELECT p FROM Product p WHERE p.name = :name")
    , @NamedQuery(name = "Product.findByPrice", query = "SELECT p FROM Product p WHERE p.price = :price")
    , @NamedQuery(name = "Product.findByImgUrl", query = "SELECT p FROM Product p WHERE p.imgUrl = :imgUrl")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_product")
    private Integer idProduct;
    
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    
    @Basic(optional = false)
    @Column(name = "price")
    private double price;
    
    @Basic(optional = false)
    @Column(name = "img_url")
    private String imgUrl;
    
    @JoinColumn(name = "id_restaurant", referencedColumnName = "id_restaurant")
    @ManyToOne(optional = false)
    private Restaurant idRestaurant;
    
}