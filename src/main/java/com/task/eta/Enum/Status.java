package com.task.eta.Enum;

public enum Status {
    ACTIVE("Active"),INACTIVE("InActive");

    String statusValue;

    Status(String statusValue) {
        this.statusValue = statusValue;
    }
}
