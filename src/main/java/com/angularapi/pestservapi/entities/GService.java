package com.angularapi.pestservapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor 
@Entity
@Table(name="service")
public class GService implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=30)
	private String nom;
	@ManyToOne
	@JoinColumn(name="id_chef")
	private ChefService chefService;
	@ManyToOne
	@JoinColumn(name="id_directeur")
	private Directeur directeur;
	@OneToMany(mappedBy="servicee",fetch=FetchType.LAZY)
	private Collection<ChefProjet> chefProjet;
	@OneToMany(mappedBy="service",fetch=FetchType.LAZY)
	private Collection<Demande> demandes;
	@OneToMany(mappedBy="service1",fetch=FetchType.LAZY)
	private Collection<Projet> projets;
	@OneToMany(mappedBy="serviice",fetch=FetchType.LAZY)
	private Collection<Membre> membre;

}
