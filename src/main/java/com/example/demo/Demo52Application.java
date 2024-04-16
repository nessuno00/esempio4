package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Demo52Application {

    public static void main(String[] args) {
        SpringApplication.run(com.example.demo.Demo52Application.class, args);
    }


    }

    @RestController
    class GreetingController {

        @GetMapping("/v2/ciao/Lombardia")
        public WeatherResponse greet(@RequestParam(name = "nome") String nome) {
            WeatherResponse response = new WeatherResponse();
            response.setNome(nome);
            response.setProvincia("Lombardia");
            response.setSaluto("Ciao " + nome + ", com'è il tempo in Lombardia?");
            return response;
        }
    }

    class WeatherResponse {
        private String nome;
        private String provincia;
        private String saluto;

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setProvincia(String provincia) {
            this.provincia = provincia;
        }

        public void setSaluto(String saluto) {
            this.saluto = saluto;
        }
    }


