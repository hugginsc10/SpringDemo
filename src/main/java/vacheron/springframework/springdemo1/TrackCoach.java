package vacheron.springframework.springdemo1;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a 5k";
    }
}
