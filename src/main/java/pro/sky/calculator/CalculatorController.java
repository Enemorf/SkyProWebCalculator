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
        return calculatorService.plus(first,second);
    }

    @GetMapping(path = "/minus")
    public String minus (@RequestParam ("num1") String first, @RequestParam("num2") String second)
    {
        return calculatorService.minus(first,second);
    }

    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam ("num1") String first, @RequestParam("num2") String second)
    {
        return calculatorService.multiply(first,second);
    }

    @GetMapping(path = "/divide")
    public String divide (@RequestParam ("num1") String first, @RequestParam("num2") String second)
    {
        return calculatorService.divide(first,second);
    }
}
