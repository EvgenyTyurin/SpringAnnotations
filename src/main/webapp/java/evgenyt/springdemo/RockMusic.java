package evgenyt.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Smoke one the water";
    }
}
