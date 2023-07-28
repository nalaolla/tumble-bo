package kr.co.tumble.tumblebo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = DataSourceAutoConfiguration.class)
public class TumbleBoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TumbleBoApplication.class, args);
	}

}
