package com.apimongo.APIUsuariosMongo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Users API - MongoDB", version = "1.0", description = "API that receives user data and store in mongodb"))
public class ApiUsuariosMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiUsuariosMongoApplication.class, args);
	}

}
