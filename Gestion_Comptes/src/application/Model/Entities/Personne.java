package application.Model.Entities;

public abstract class Personne {
	private int Id ;
	private String Nom ;
	private String Prenom ;
	private String Adresse ;
	private String DN ;
	private String Email ;
	private String NumeroTel ;
	
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getDN() {
		return DN;
	}
	public void setDN(String dN) {
		DN = dN;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getNumeroTel() {
		return NumeroTel;
	}
	public void setNumeroTel(String numeroTel) {
		NumeroTel = numeroTel;
	}

	public Personne(int id, String nom, String prenom, String adresse, String dN, String email, String numeroTel) {
		Id = id;
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		DN = dN;
		Email = email;
		NumeroTel = numeroTel;
	}
	
	public Personne(String nom, String prenom, String adresse, String dN, String email, String numeroTel) {
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		DN = dN;
		Email = email;
		NumeroTel = numeroTel;
	}

	
	public abstract void ModifInfo (String nom, String prenom, String adresse, String dN, String email, String numeroTel);
	public abstract void DemandeCarnetCheque () ;

	
}
