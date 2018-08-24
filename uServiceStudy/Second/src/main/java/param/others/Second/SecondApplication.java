package param.others.Second;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;

import param.others.Second.health.InternetHealthIndicator;
import param.others.config.DemoConfigProperties;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {
		
		
//		SpringApplication.run(SecondApplication.class, args);
		
		new SpringApplicationBuilder(SecondApplication.class).
		bannerMode(Banner.Mode.OFF).
		initializers( (GenericApplicationContext genericApplicationContext) -> {
			
			genericApplicationContext.registerBean("internet", InternetHealthIndicator.class);
		}).run(args);
		
		
		DemoConfigProperties demoConfigProperties = new DemoConfigProperties();
		System.out.println("propeties "+demoConfigProperties.getAge());
	}
	
	@Bean
	public ApplicationRunner applicationRunner() {
		
		return args -> { System.out.println("Hello world");};
		
	}
}
