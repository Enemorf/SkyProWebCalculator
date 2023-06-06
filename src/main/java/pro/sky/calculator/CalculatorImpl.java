package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements CalculatorService
{

    @Override
    public String plus(String num1, String num2)
    {
        if(num1 == "" || num2 == "")
            return "Не все параметры поданы для расчета!";

        int res = Integer.parseInt(num1) + Integer.parseInt(num2);
        return num1 + " + " + num2 + " = " + res;
    }

    @Override
    public String minus(String num1, String num2) {
        if(num1 == "" || num2 == "")
            return "Не все параметры поданы для расчета!";

        int res = Integer.parseInt(num1) - Integer.parseInt(num2);
        return num1 + " - " + num2 + " = " + res;
    }

    @Override
    public String multiply(String num1, String num2) {
        if(num1 == "" || num2 == "")
            return "Не все параметры поданы для расчета!";

        int res = Integer.parseInt(num1) * Integer.parseInt(num2);
        return num1 + " * " + num2 + " = " + res;
    }

    @Override
    public String divide(String num1, String num2)
    {

        if(num1 == "" || num2 == "")
            return "Не все параметры поданы для расчета!";

        if(Double.parseDouble(num2) == 0)
            return "На ноль делить нельзя!";
        double res = Double.parseDouble(num1) / Double.parseDouble(num2);
        return num1 + " / " + num2 + " = " + res;

    }
}
