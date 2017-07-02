package by.grapesrain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by PloSkiY on 02.07.2017.
 */
@Configuration
@ComponentScan(basePackages = {"by.grapesrain.controller"})
//@ContextConfiguration(classes = Config.class)
//@Import(Config.class)
@EnableWebMvc
@Import(value = {ThymeleafConfig.class})
public class Config {

//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/WEB-INF/jsp/");
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setExposeContextBeansAsAttributes(true);
//        return viewResolver;
//    }
}
