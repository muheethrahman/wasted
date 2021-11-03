package amazon.com.xworkz.amazon;

public interface AmazonService {

	void loginId(String usern, String pass);

	void addMovies(AmazonDto Moviename);

	void displayMovieDetails();

	default void subscribers() {
		System.out.println("view SubScribers");
	}

}
