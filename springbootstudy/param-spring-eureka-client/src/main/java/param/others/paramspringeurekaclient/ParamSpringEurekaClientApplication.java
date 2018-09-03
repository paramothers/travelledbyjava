package param.others.paramspringeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ParamSpringEurekaClientApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ParamSpringEurekaClientApplication.class, args);
	}
}
