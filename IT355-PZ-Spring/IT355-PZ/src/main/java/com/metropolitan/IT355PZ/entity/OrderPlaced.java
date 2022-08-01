package com.metropolitan.IT355PZ.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "order_placed")
@XmlRootElement
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@NamedQueries({
    @NamedQuery(name = "OrderPlaced.findAll", query = "SELECT o FROM OrderPlaced o")
    , @NamedQuery(name = "OrderPlaced.findByIdOrderPlaced", query = "SELECT o FROM OrderPlaced o WHERE o.idOrderPlaced = :idOrderPlaced")
    , @NamedQuery(name = "OrderPlaced.findByAmount", query = "SELECT o FROM OrderPlaced o WHERE o.amount = :amount")
    , @NamedQuery(name = "OrderPlaced.findByDate", query = "SELECT o FROM OrderPlaced o WHERE o.date = :date")})
public class OrderPlaced implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order_placed")
    private Integer idOrderPlaced;
    
    @Basic(optional = false)
    @Column(name = "amount")
    private double amount;
    
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    @ManyToOne(optional = false)
    private User idUser;
    
    @JoinColumn(name = "id_coupon", referencedColumnName = "id_coupon")
    @ManyToOne
    private Coupon idCoupon;
    
}