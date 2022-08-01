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
@Table(name = "user")
@XmlRootElement
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    , @NamedQuery(name = "User.findByIdUser", query = "SELECT u FROM User u WHERE u.idUser = :idUser")
    , @NamedQuery(name = "User.findByFirstName", query = "SELECT u FROM User u WHERE u.firstName = :firstName")
    , @NamedQuery(name = "User.findByLastName", query = "SELECT u FROM User u WHERE u.lastName = :lastName")
    , @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username")
    , @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password")
    , @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user")
    private Integer idUser;
    
    @Basic(optional = false)
    @Column(name = "first_name")
    private String firstName;
    
    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;
    
    @Basic(optional = false)
    @Column(name = "username", unique = true)
    private String username;
    
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    
    @Basic(optional = false)
    @Column(name = "email", unique = true)
    private String email;
    
    @JoinColumn(name = "id_role", referencedColumnName = "id_role")
    @ManyToOne(optional = false)
    private Role idRole;
    
}