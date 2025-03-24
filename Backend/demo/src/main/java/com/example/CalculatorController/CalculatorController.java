package com.example.CalculatorController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8000")

@RestController
public class CalculatorController {

    public CalculatorController(String format) {
    }

    private static final String template = "Result: %s";

    @GetMapping("/add")
    public CalculatorController add(@RequestParam(value = "num1", defaultValue = "0") String num1, @RequestParam(value = "num2", defaultValue = "0") String num2) {
        return new CalculatorController(String.format(template, Float.toString(Float.parseFloat(num1) + Float.parseFloat(num2))));
    }
    @GetMapping("/sub")
    public CalculatorController sub(@RequestParam(value = "num1", defaultValue = "0") String num1, @RequestParam(value = "num2", defaultValue = "0") String num2) {
        return new CalculatorController(String.format(template, Float.toString(Float.parseFloat(num2) - Float.parseFloat(num1))));
    }
}