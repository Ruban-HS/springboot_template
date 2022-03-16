package com.roche.dhp.{{cookiecutter.artifact_name}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.artifact_name}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{cookiecutter.artifact_name}}Application.class, args);
	}

}
