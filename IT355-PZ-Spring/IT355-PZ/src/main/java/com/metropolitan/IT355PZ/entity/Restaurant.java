package com.metropolitan.IT355PZ.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "restaurant")
@XmlRootElement
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@NamedQueries({
    @NamedQuery(name = "Restaurant.findAll", query = "SELECT r FROM Restaurant r")
    , @NamedQuery(name = "Restaurant.findByIdRestaurant", query = "SELECT r FROM Restaurant r WHERE r.idRestaurant = :idRestaurant")
    , @NamedQuery(name = "Restaurant.findByName", query = "SELECT r FROM Restaurant r WHERE r.name = :name")
    , @NamedQuery(name = "Restaurant.findByAddress", query = "SELECT r FROM Restaurant r WHERE r.address = :address")
    , @NamedQuery(name = "Restaurant.findByPhone", query = "SELECT r FROM Restaurant r WHERE r.phone = :phone")
    , @NamedQuery(name = "Restaurant.findByEmail", query = "SELECT r FROM Restaurant r WHERE r.email = :email")})
public class Restaurant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_restaurant")
    private Integer idRestaurant;
    
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    
//    @JsonIgnore
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRestaurant")
//    private List<Product> productList;
    
}