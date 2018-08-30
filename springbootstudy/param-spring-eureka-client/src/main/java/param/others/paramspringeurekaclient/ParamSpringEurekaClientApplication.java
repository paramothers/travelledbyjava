package param.others.paramspringeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ParamSpringEurekaClientApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ParamSpringEurekaClientApplication.class, args);
		System.out.println("Paramasivam ..");
	}
}
