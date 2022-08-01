package com.metropolitan.IT355PZ.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "cart")
@XmlRootElement
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@NamedQueries({
    @NamedQuery(name = "Cart.findAll", query = "SELECT c FROM Cart c")
    , @NamedQuery(name = "Cart.findByIdCart", query = "SELECT c FROM Cart c WHERE c.idCart = :idCart")
    , @NamedQuery(name = "Cart.findByProductQuantity", query = "SELECT c FROM Cart c WHERE c.productQuantity = :productQuantity")})
public class Cart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cart")
    private Integer idCart;
    
    @Basic(optional = false)
    @Column(name = "product_quantity")
    private int productQuantity;
    
    @JoinColumn(name = "id_order_placed", referencedColumnName = "id_order_placed")
    @ManyToOne(optional = false)
    private OrderPlaced idOrderPlaced;
    
    @JoinColumn(name = "id_product", referencedColumnName = "id_product")
    @ManyToOne(optional = false)
    private Product idProduct;

}