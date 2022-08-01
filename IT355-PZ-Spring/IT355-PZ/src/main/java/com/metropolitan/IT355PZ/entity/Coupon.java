package com.metropolitan.IT355PZ.entity;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "coupon")
@XmlRootElement
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@NamedQueries({
    @NamedQuery(name = "Coupon.findAll", query = "SELECT c FROM Coupon c")
    , @NamedQuery(name = "Coupon.findByIdCoupon", query = "SELECT c FROM Coupon c WHERE c.idCoupon = :idCoupon")
    , @NamedQuery(name = "Coupon.findByCode", query = "SELECT c FROM Coupon c WHERE c.code = :code")
    , @NamedQuery(name = "Coupon.findByDiscount", query = "SELECT c FROM Coupon c WHERE c.discount = :discount")})
public class Coupon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_coupon")
    private Integer idCoupon;
    
    @Basic(optional = false)
    @Column(name = "code")
    private String code;
    
    @Basic(optional = false)
    @Column(name = "discount")
    private int discount;
    
    @JoinColumn(name = "id_restaurant", referencedColumnName = "id_restaurant")
    @ManyToOne(optional = false)
    private Restaurant idRestaurant;
    
}