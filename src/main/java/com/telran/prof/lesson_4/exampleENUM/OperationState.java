package com.telran.prof.lesson_4.exampleENUM;

public enum OperationState {
    NEW("This is new operation"),
    TERMINATED("this operation was cancelled"),
    COMPLETED("This operation was complete");

    // describe operations
    private String description;

    OperationState(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
