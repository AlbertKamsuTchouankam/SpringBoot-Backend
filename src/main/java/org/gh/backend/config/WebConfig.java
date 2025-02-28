package org.gh.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Hier wird die Konfiguration durchgeführt, damit die Kommunikation zwischen frontend Server und Backend Server möglich wird
 */

@Configuration
@EnableWebMvc
public class WebConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // CORS auf API-Routen anwenden
                        .allowedOrigins("http://localhost:4200") // Kommunikation mit Angular wird erlaubt (localhost:4200)
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // erlaubten Methoden
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}

