package gitaction.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RestController
	public class HiController {

		@GetMapping("/")
		public String hi() {
			return "적게일하고돈많이벌고싶다....!!!";
		}
	}
}
