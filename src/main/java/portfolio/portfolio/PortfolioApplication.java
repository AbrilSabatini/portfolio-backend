package portfolio.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
		System.out.println("Running");
		System.out.println("Origenes: " + System.getenv("CORS_ALLOWED_ORIGINS"));

	}

}
