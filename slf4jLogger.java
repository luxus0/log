package spring_boot.spring_boot.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.management.relation.InvalidRoleValueException;
import java.net.BindException;
import java.security.cert.CertPathBuilderException;

@SpringBootApplication
@Component
public class slf4jLogger implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(slf4jLogger.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Logger logger = LoggerFactory.getLogger(lukasz.nowogorski.SpringBoot.SpringApplication.CommandLineRunner.Movie_commandLineRunner.class);
        logger.info("Application logging in");
        logger.info(Marker.ANY_NON_NULL_MARKER,"Invalid Role Value Exception",new InvalidRoleValueException());
        logger.info(Marker.ANY_MARKER,"Numbers",45,67);

        logger.warn(Marker.ANY_MARKER,"Bind Exception",new BindException());

        logger.trace(Marker.ANY_NON_NULL_MARKER,"Cert Path Builder Exception",new CertPathBuilderException());

        logger.debug(Marker.ANY_MARKER,"BOOLEAN",true,false);

        logger.error(Marker.ANY_NON_NULL_MARKER,"ERROR","COMPUTER REPORT","VALID DATABASE");

        System.out.println("Logger Name: " +logger.getName());


    }
}


