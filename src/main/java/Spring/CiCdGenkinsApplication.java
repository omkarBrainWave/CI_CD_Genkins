package Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CiCdGenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCdGenkinsApplication.class, args);
		System.out.println("Running Success  ");
	}

}
