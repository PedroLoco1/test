


public class User {

	private String mailUser;//servira de login
	private String name;
	private String firstname;
	private String pseudo;
	private String password; // mot de passe


	public User(){}

	public User(String mailUser, String name, String firstname, String pseudo, String password){
		this.mailUser = mailUser;
		this.name = name;
		this.firstname = firstname;
		this.pseudo = pseudo;
		this.password = password;
	}


	// Lire l'adresse email d'utilisateur
	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "User [mailUser=" + mailUser + ", name=" + name + ", firstname=" + firstname + ", pseudo=" + pseudo
				+ ", password=" + password + "]";
	}
}



