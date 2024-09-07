package br.com.alurafood.pagamentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class PagamentosApplication {

	public static void main(String[] args) {

		SpringApplication.run(PagamentosApplication.class, args);
		System.out.println("--------------------------");
		System.out.println("---Executando PAGAMENTO---");
		System.out.println("--------------------------");
	}

}
