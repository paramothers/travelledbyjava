package param.others.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my")
public class Config {

	
	public List<String> getServers() {
		return servers;
	}

	private List<String> servers = new ArrayList<>();
	
	
}
