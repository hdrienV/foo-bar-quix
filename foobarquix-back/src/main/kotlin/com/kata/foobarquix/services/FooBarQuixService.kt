package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    val FOO  = "Foo"
    val BAR  = "Bar"
    val QUIX = "Quix"


    fun convertNumber(inputNumber: Int): String {
        val strBuilderDividedCase = transformNumberToFooBarIfDivisibleBy(inputNumber)
        val strBuilderContainsCase = transformNumberToFooBarQuixIfContains(inputNumber)
        val strBuilderConvertedNumber = strBuilderDividedCase.append(strBuilderContainsCase)

        if (strBuilderConvertedNumber.isEmpty()){
            return inputNumber.toString()
        }
        return strBuilderConvertedNumber.toString()
    }

    private fun transformNumberToFooBarQuixIfContains(inputNumber: Int) : StringBuilder{
        val inputNumberStr = inputNumber.toString()
        val strBuilderContainsCase = StringBuilder()


        for (i in 0 until inputNumberStr.length) {
            strBuilderContainsCase.append(transformCharNumberToFooBarQuix(inputNumberStr.get(i)))
        }
        return strBuilderContainsCase
    }

    private fun transformCharNumberToFooBarQuix(charToTest: Char) : String {
        if (charToTest.equals('3')) {
            return FOO;
        }
        if (charToTest.equals('5')) {
            return BAR
        }
        if (charToTest.equals('7')) {
            return QUIX
        }
        return String()
    }

    private fun transformNumberToFooBarIfDivisibleBy(inputNumber: Int): StringBuilder {
        val convertedNumberStrBuilder = StringBuilder()

        if (inputNumber % 3 == 0) {
            convertedNumberStrBuilder.append(FOO)
        }

        if (inputNumber % 5 == 0) {
            convertedNumberStrBuilder.append(BAR)
        }
        return convertedNumberStrBuilder
    }

}