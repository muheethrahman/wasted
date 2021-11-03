package amazon.com.xworkz.amazon;

public class AmazonTester {

	public static void main(String[] args) {

		AmazonDto amazonDTO = new AmazonDto("amazon@123.com", "amazon123", "Kung Fu panda", "500Mb", "Rock", "Selimo");
		

		AmazonService amazon = new AmazonServiceImpl();

		amazon.addMovies(amazonDTO);
		

		amazon.loginId("amazon@123.com", "amazon123");
		amazon.displayMovieDetails();

		amazon.subscribers();
		AmazonDaoImpl amazonDaoImpl = new AmazonDaoImpl();
		amazonDaoImpl.displayDate();
	}

}
