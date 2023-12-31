package tn.adminproject.mainwebapplication.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class SWConfig {
    @Bean
    public OpenAPI springShopOpenAPI(){
        return new OpenAPI()
                .info(infoAPI());
    }

    public Info infoAPI() {
        return new Info().title("SpringDoc-Demo")
                .description("YF")
                .contact(contactAPI());
    }

    public Contact contactAPI() {
        Contact contact = new Contact().name("test")
                .email("hydraesport20@gmail.com")
                .url("https://www.linkedin.com/in/test/");
        return contact;
    }
}
