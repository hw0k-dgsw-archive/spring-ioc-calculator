package kr.hs.dgsw.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String add(String par1, String par2) {
        return "계산 결과: " + (Integer.parseInt(par1) + Integer.parseInt(par2));
    }

    @Override
    public String subtract(String par1, String par2) {
        return "계산 결과: " + (Integer.parseInt(par1) - Integer.parseInt(par2));
    }

    @Override
    public String multiply(String par1, String par2) {
        return "계산 결과: " + (Integer.parseInt(par1) * Integer.parseInt(par2));
    }

    @Override
    public String divide(String par1, String par2) {
        return "계산 결과: " + (Integer.parseInt(par1) / Integer.parseInt(par2));
    }
}
