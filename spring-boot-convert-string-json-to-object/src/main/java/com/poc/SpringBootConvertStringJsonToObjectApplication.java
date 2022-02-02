package com.poc;

import com.poc.example.StringDemo;
import com.poc.service.metier.BeneficiaireSM;
import com.poc.splitting.StringSplitting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConvertStringJsonToObjectApplication implements CommandLineRunner {

	@Autowired
	private BeneficiaireSM beneficiaireSM;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConvertStringJsonToObjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("==================================================");
		System.out.println("1- Exemple String en DTO");
		StringDemo stringDemo = new StringDemo();
		stringDemo.stringToDto();

		System.out.println("==================================================");
		System.out.println("2- Exemple size() data de type String");
		beneficiaireSM.getInstances();

		System.out.println("==================================================");
		System.out.println("3- Exemple Splitting and Joining Strings");
		StringSplitting ex = new StringSplitting();
		ex.splittingExample();
	}
}
