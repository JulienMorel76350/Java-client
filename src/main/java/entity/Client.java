package entity;


import javax.persistence.*;

import java.time.LocalDate;
import java.util.UUID;


@Entity
@Table(name="clients")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_client")
	private int id;
	private int sexe;
	private String firstname;
	private String lastname;
	private LocalDate birthday;
	@Column(name="code_postal")
	private String adresse;
	private String ville;
	private String pays;
	private String tel;
	@Column(name="num_client")
	private UUID numClient;
	@Column(name="created_at")
	private LocalDate createdAt;
	public Client() {
	}

	public Client(String firstname) {
		this.firstname = firstname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSexe() {
		return sexe;
	}

	public void setSexe(int sexe) {
		this.sexe = sexe;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public UUID getNumClient() {
		return numClient;
	}

	public void setNumClient(UUID numClient) {
		this.numClient = numClient;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
}
