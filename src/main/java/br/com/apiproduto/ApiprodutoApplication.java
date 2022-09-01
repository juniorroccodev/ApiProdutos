package br.com.apiproduto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@SpringBootApplication
@EntityScan(basePackages = "br.com.apiproduto.entity")
public class ApiprodutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiprodutoApplication.class, args);
	}

}
