package param.others.paramconfigserver.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import param.others.paramconfigserver.config.Paramproperties;

@Component
public class ParamCommandLineRunner implements CommandLineRunner{

    @Autowired
  private  Paramproperties parampropereties;

	@Override
	public void run(String... args) throws Exception {
        
        System.out.println("Param age is "+parampropereties.getAge());
	}
    
}