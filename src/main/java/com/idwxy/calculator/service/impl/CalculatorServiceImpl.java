package com.idwxy.calculator.service.impl;

import com.idwxy.calculator.common.ResultObject;
import com.idwxy.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public ResultObject compute(String operator, double firstNum, double secondNum) {

        // 计算结果
        double result = 0;
        // 请求状态码, 默认成功
        int code = 200;
        // 返回请求消息，默认成功
        String msg = "请求成功";
        // 封装对象
        ResultObject resultObject;

        // 根据不同的操作符进行不同的操作
        switch (operator) {
            // 加
            case "add":
                result = firstNum + secondNum;
                break;
            // 减
            case "subtract":
                result = firstNum - secondNum;
                break;
            // 除
            case "divide":
                // 除数为 0，无法计算
                if (secondNum == 0) {
                    msg = "参数错误";
                    code = 406;
                    break;
                } else {
                    result = firstNum / secondNum;
                    break;
                }
            case "multiply":
                result = firstNum * secondNum;
                break;
            // 未知的操作符
            default:
                msg = "请求错误";
                code = 412;
                break;
        }
        resultObject = new ResultObject(result, code, msg);
        return resultObject;
    }
}
