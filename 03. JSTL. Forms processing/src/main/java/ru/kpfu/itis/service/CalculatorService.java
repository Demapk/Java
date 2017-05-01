package ru.kpfu.itis.service;

import org.springframework.stereotype.Component;
import ru.kpfu.itis.model.Calculator;

@Component
public class CalculatorService {

    public double getResult(Calculator calculator) {
        double firstNumber = Double.parseDouble(calculator.getFirstNumber());
        double secondNumber = Double.parseDouble(calculator.getSecondNumber());
        switch (calculator.getOperation()) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                return firstNumber / secondNumber;
            case "%":
                return firstNumber % secondNumber;
        }
        throw new IllegalArgumentException("Такого не произойдет");
    }

}
