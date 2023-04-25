package fhwien.BMI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private BMIService bmiService;

    @GetMapping("/api/bmi")
    public double calculateBMI(@RequestParam double weight, @RequestParam double height) {
        return bmiService.calculateBMI(weight, height);
    }
}

