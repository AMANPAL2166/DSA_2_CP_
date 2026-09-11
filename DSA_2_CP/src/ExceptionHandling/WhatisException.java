package ExceptionHandling;

public class WhatisException {
    public static void main(String[] args) {
        //let's have an example
        //take a and b, and make divisior 0
//        int a = 10;
//        int b = 0;//make it 0, will get arithmeticexeption called / zero. So the purpose of exception handling to handle unexpected situation.
//        try {
//            System.out.println("Division of " + a + " and " + b + ": "  + a/b);
//        }catch (ArithmeticException e){
//            System.out.println("Got some exception while running the code.That error is " + e.getMessage());
//
//        }catch (Exception e){
//            System.out.println("Get some unknown error.");
//        }
        /// Throw: Throw manual exception.
        int age = 22;
        if(age < 18){
            throw  new RuntimeException("age is less then 18 can't move forword.");
        }else{
            System.out.println("Can go ahead.");
        }
    }
}
