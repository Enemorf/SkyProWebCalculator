package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements CalculatorService
{

    @Override
    public int plus(String num1, String num2) {
        return  Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    @Override
    public int minus(String num1, String num2) {
        return Integer.parseInt(num1) - Integer.parseInt(num2);
    }

    @Override
    public int multiply(String num1, String num2) {
        return Integer.parseInt(num1) * Integer.parseInt(num2);
    }

    @Override
    public double divide(String num1, String num2) {
        return Double.parseDouble(num1) / Double.parseDouble(num2);
    }
}
