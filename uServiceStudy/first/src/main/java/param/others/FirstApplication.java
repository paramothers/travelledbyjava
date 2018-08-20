package param.others;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import param.others.conf.Config;

@SpringBootApplication
public class FirstApplication {

	@Value("${name}")
	private String name;
	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}
	
	
	@Autowired
	Config config;
	
	@PostConstruct
	public void printServer() {
		
		System.out.println("??????????????????");
		
		config.getServers().forEach( server -> { System.out.println("Server "+server);});
	}
}
