package ru.neoflex.application.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Application Api",
                description = "deal", version = "1.0.0",
                contact = @Contact(
                        name = "Kulieva Veronika"
                )
        )
)
public class OpenApiConfig {
}
