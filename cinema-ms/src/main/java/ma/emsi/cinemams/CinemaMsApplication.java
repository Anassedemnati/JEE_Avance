package ma.emsi.cinemams;

import lombok.AllArgsConstructor;
import ma.emsi.cinemams.repository.SalleCinemaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaMsApplication  {

	private SalleCinemaRepository _salleCinemaRepository;
	public static void main(String[] args) {
		SpringApplication.run(CinemaMsApplication.class, args);
	}


}
