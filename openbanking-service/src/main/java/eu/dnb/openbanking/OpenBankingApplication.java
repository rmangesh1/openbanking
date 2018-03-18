package eu.dnb.openbanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by rmang on 11-03-2018.
 */
@SpringBootApplication
@EnableWebMvc
public class OpenBankingApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenBankingApplication.class, args);
    }
}
