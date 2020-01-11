package springmvc.week3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("springmvc.week3")
@EnableWebMvc
public class DeloitteConfig {

	@Bean
	public InternalResourceViewResolver getViewResolver()
	{
		InternalResourceViewResolver vr= new InternalResourceViewResolver();
		vr.setSuffix(".jsp");
		return vr;
	}
}
