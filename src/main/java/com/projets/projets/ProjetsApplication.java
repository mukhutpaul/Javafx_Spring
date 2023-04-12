package com.projets.projets;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration(proxyBeanMethods=false)
public class ProjetsApplication {

	public static void main(String[] args) {
		Application.launch(Principal.class,args);
	}

}
