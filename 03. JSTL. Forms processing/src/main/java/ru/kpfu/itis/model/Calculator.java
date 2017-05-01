package ru.kpfu.itis.model;


import javax.validation.constraints.Pattern;

public class Calculator {

    private String firstNumber;

    private String secondNumber;

    private String operation;

    public Calculator() {
    }

    public Calculator(String firstNumber, String secondNumber, String operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    @Pattern(regexp = "^[-]?\\d+(\\.\\d+)?$", message = "Должно быть числом")
    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Pattern(regexp = "^[-]?\\d+(\\.\\d+)?$", message = "Должно быть числом")
    public String getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "firstNumber='" + firstNumber + '\'' +
                ", secondNumber='" + secondNumber + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }

    @Pattern(regexp = "[-+%/*]", message = "Должно быть одной из операций: +, -, %, /, *")
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
