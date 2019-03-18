package kr.hs.dgsw.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping("/add")
    public String add(@RequestParam String par1, @RequestParam String par2) {
        return calculatorService.add(par1, par2);
    }

    @RequestMapping("/subtract")
    public String subtract(@RequestParam String par1, @RequestParam String par2) {
        return calculatorService.subtract(par1, par2);
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam String par1, @RequestParam String par2) {
        return calculatorService.multiply(par1, par2);
    }

    @RequestMapping("/divide")
    public String divide(@RequestParam String par1, @RequestParam String par2) {
        return calculatorService.divide(par1, par2);
    }
}
