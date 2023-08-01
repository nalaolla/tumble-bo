package kr.co.tumble.bo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
public class TumbleBoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TumbleBoApplication.class, args);
	}

}
