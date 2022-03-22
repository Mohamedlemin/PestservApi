package com.angularapi.pestservapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Data @NoArgsConstructor @AllArgsConstructor 
@Entity
@Table(name="accueil")
public class Accueilleur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=40)
	private String Nom;
	@Column(length=40)
	private String Prenom;
	@Column(length=40)
	private String username;
	@Column(length=40)
	private String password;
	@Column(length=30)
	private String telephone;
	@OneToMany(mappedBy="accueil",fetch=FetchType.LAZY)
	private Collection<Demande> demandes;

}
