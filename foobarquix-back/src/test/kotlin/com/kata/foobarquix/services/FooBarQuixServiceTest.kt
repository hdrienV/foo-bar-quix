package com.kata.foobarquix.services

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class FooBarQuixServiceTest{

    @Test
    fun shouldReturn1IfNumberIs1(){
        assertEquals("1", FooBarQuixService().convertNumber(1))
    }

    @Test
    fun shouldReturn2IfNumberIs2(){
        assertEquals("2", FooBarQuixService().convertNumber(2))
    }

    @Test
    fun shouldReturnFooIfNumberIsDivisibleBy3(){
        assertEquals("Foo", FooBarQuixService().convertNumber(9))
        assertEquals("Foo", FooBarQuixService().convertNumber(6))
    }

    @Test
    fun shouldReturnBarIfNumberIsDivisibleBy5(){
        assertEquals("Bar", FooBarQuixService().convertNumber(10))
        assertEquals("Bar", FooBarQuixService().convertNumber(20))
    }

    @Test
    fun shouldReturnFooIfNumberContainsOrDivisibleBy3(){
        assertEquals("FooFoo", FooBarQuixService().convertNumber(3))
    }

    @Test
    fun shouldReturnBarIfNumberContainsOrDivisibleBy5(){
        assertEquals("BarBar", FooBarQuixService().convertNumber(5))
    }

    @Test
    fun shouldReturnQuixIfNumberContains7(){
        assertEquals("Quix", FooBarQuixService().convertNumber(7))
    }

    @Test
    fun shouldApplyPrecedence(){
        assertEquals("FooBar", FooBarQuixService().convertNumber(51))
        assertEquals("BarFoo", FooBarQuixService().convertNumber(53))
        assertEquals("FooFooFoo", FooBarQuixService().convertNumber(33))
        assertEquals("FooQuix", FooBarQuixService().convertNumber(27))
        assertEquals("FooBarBar", FooBarQuixService().convertNumber(15))
    }

}