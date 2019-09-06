package com.idwxy.calculator.controller;

import com.idwxy.calculator.common.ResultObject;
import com.idwxy.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    // 自动注入 service
    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping("/compute/{operator}/{firstNum}/{secondNum}")
    public ResultObject compute(@PathVariable String operator,
                                @PathVariable double firstNum, @PathVariable double secondNum) {
        ResultObject resultObject = calculatorService.compute(operator, firstNum, secondNum);
        return resultObject;
    }
}
