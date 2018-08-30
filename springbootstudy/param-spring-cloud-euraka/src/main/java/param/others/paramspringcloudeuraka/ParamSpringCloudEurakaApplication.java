package param.others.paramspringcloudeuraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ParamSpringCloudEurakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParamSpringCloudEurakaApplication.class, args);
	}
}
