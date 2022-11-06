package vacheron.springframework.springdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springdemo1Application {

    public static void main(String[] args) {

        Coach theCoach = new TrackCoach();

        System.out.println(theCoach.getDailyWorkout());

        SpringApplication.run(Springdemo1Application.class, args);
    }

}
