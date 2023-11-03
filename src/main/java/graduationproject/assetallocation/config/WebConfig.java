package graduationproject.assetallocation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://192.168.0.15:3000")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "Options")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
