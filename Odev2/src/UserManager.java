
public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanicisi eklendi");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanicisi silindi");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanicisi guncellendi");
	}
}
