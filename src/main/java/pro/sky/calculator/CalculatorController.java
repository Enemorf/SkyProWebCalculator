package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/calculator")
@RestController
public class CalculatorController
{
    private final CalculatorService calculatorService;

    public CalculatorController (CalculatorService calculatorService)
    {
        this.calculatorService = calculatorService;
    }
    @GetMapping(path = "/plus")
    public String plus (@RequestParam ("num1") String first, @RequestParam("num2") String second)
    {
        if(first == "" || second == "")
            return "Не все параметры поданы для расчета!";


        return first + " + "+ second + " = " + calculatorService.plus(first,second);
    }

    @GetMapping(path = "/minus")
    public String minus (@RequestParam ("num1") String first, @RequestParam("num2") String second)
    {
        if(first == "" || second == "")
            return "Не все параметры поданы для расчета!";

        return first + " - "+ second + " = " + calculatorService.minus(first,second);
    }

    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam ("num1") String first, @RequestParam("num2") String second)
    {
        if(first == "" || second == "")
            return "Не все параметры поданы для расчета!";

        return first + " * "+ second + " = " + calculatorService.multiply(first,second);
    }

    @GetMapping(path = "/divide")
    public String divide (@RequestParam ("num1") String first, @RequestParam("num2") String second)
    {
        if(first == "" || second == "")
            return "Не все параметры поданы для расчета!";

        if(Double.parseDouble(second) == 0)
            return "На ноль делить нельзя!";

        return first + " / "+ second + " = " + calculatorService.divide(first,second);
    }
}
