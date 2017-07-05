
public class TestClass {

	
	
	public static void main(String[] args){
		BaseDeDonnees bddTest = new BaseDeDonnees();
		UserService serviceTest = new UserService();
		
		User userTestOk = new User("pierre@mediabuzz.com","pierre","jordan","pj","motdepasse");
		User userTestNotOK = new User("serge@mediabuzz.com","serge","dupont","sd","password");
		
		if(serviceTest.loginOk(userTestOk, bddTest)){
			System.out.println("bon login");
		}
		if(!serviceTest.loginOk(userTestNotOK, bddTest)){
			System.out.println("mauvais login Myrfa B1");
		}
		//etre libre c'est vivre comme tu l'entend
		System.out.println("la vie est nulle ok ok"+"\n pipi caca c'est extra caca");
		System.out.println("la vie est nul ok ok pas tout à fait");
		
		
		//petit commentaire rajouté par Vincent priestley
	}
}
