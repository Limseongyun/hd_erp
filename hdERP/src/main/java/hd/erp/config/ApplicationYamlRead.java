package hd.erp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "common")
@Getter
@Setter
public class ApplicationYamlRead {

	private String path;
}
