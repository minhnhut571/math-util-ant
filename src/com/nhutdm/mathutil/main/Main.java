/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhutdm.mathutil.main;

import com.nhutdm.mathutil.core.MathUtil;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("THí message come form the main method");
        tryTDDFrist();
    }
    
    public static void tryTDDFrist()
    {
        long expected = 1;
        long actual = MathUtil.getFractorial(5);
        System.out.println("0! Status | Expected = " + expected +
                " | Actual = " + actual);
    }
}
