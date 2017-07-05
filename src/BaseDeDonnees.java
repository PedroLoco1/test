import java.util.ArrayList;
import java.util.List;

public class BaseDeDonnees {
	private List<User> users = new ArrayList<User>();
	
	public BaseDeDonnees(){
		//Remplir la liste de users
		User u1 = new User("pierre@mediabuzz.com","pierre","jordan","pj","motdepasse");
		User u2 = new User("vincent@mediabuzz.com","vincent","priestley","vp","12345");
		User u3 = new User("myrfa@mediabuzz.com","myrfa","yumiaji","my","myrfette");
		User u4 = new User("hanafi@mediabuzz.com","hanafi","amada","ha","non");
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void addUserBdd(User user){
		this.users.add(user);
	}
}
