package com.telran.prof.lesson_4.exampleENUM;

public class OperationApp {
    public static void main(String[] args) {
        Operation doHomework = new Operation("do homework", OperationState.NEW);
        Operation checkHomework = new Operation("check homework", OperationState.COMPLETED);
        // Operation operation = new Operation("operation", OperationState.TERMINATED, if we write not enum but String "TERMINATEE" may be mistake in typo

        Operation[] operations = {doHomework, checkHomework};
        printAllCompletedOperation(operations);
        // or
        printAllCompletedOperation(doHomework, checkHomework);
        // or
        printAllCompletedOperation(doHomework);
        EnumExample.checkDay(4);
        String helloPhrase = EnumExample.helloPhrase;
        System.out.println(helloPhrase);
        // if we would have method and variables not static we would create objects first and then call out either the variable meaning or method to execute
    }
    private  static void printAllCompletedOperation(Operation...operations) {
        for(Operation operation : operations) {
            //if("COMPLETED".equals(operation.getOperationState()) {
            if(OperationState.COMPLETED == operation.getState()) {
                System.out.println("Operation is " + operation.getName() + " "+ operation.getState().getDescription());
            }
        }
    }
}
