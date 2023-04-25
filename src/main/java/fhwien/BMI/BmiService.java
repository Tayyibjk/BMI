package fhwien.BMI;

import org.springframework.stereotype.Service;

@Service
class BMIService {

    public double calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        return roundToTwoDecimals(bmi);
    }

    private double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}


