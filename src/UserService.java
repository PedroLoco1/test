public class UserService {
	
	
	public boolean loginOk(User user, BaseDeDonnees bdd){
		boolean isOk = false;
		for(User userFor : bdd.getUsers()){
			User tempUser = userFor;
			if(tempUser.getMailUser().equals(user.getMailUser())){
				if(tempUser.getPassword().equals(user.getPassword())){
					isOk = true;
					break;
				}
			}
		}
		return isOk;
	}
}
