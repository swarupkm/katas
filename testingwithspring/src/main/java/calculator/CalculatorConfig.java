package calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
    @Bean Adder adder(){ return new Adder();}
    @Bean Subtracter subtracter(){ return new Subtracter();}
}
