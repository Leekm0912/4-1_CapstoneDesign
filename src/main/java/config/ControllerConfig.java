package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


@Configuration
@ComponentScan(
		basePackages = "controller"
		,excludeFilters = @Filter(type=FilterType.REGEX, pattern = "controller\\..*Exception")
)
public class ControllerConfig {

}
