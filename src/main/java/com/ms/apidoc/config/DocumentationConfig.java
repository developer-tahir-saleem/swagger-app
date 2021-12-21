//package com.ms.apidoc.config;
//
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.servers.Server;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.Arrays;
//
//@Configuration
//public class DocumentationConfig {
//
//    @Bean
//    public OpenAPI openAPI() {
//        Server localServer = new Server();
//        localServer.setDescription("local");
//        localServer.setUrl("http://localhost:8080");
//
//        Server testServer = new Server();
//        testServer.setDescription("test");
//        testServer.setUrl("https://example.org");
//
//        OpenAPI openAPI = new OpenAPI();
//        openAPI.info(new Info()
//                .title("Tutorial Rest API")
//                .description(
//                        "Documenting Spring Boot REST API with SpringDoc and OpenAPI 3 spec")
//                .version("1.0.0")
//                .contact(new Contact().name("Marone").
//                        url("https://wstutorial.com").email("test@wstutorial.com")));;
//        openAPI.setServers(Arrays.asList(localServer, testServer));
//
//        return openAPI;
//    }
//
//}