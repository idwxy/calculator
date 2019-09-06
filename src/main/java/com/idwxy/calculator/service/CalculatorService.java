package com.idwxy.calculator.service;

import com.idwxy.calculator.common.ResultObject;

// service 接口
public interface CalculatorService {

    /**
     * 计算
     * @param operator  操作符
     * @param firstNum  第一个操作数
     * @param secondNum 第二个操作数
     * @return  响应结果
     */
    public ResultObject compute(String operator, double firstNum, double secondNum);
}
