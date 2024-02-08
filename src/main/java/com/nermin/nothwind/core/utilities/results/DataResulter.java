package com.nermin.nothwind.core.utilities.results;

public class DataResulter<T> extends Result {
    private T data;

    public T getData() {
        return data;
    }

    public DataResulter(boolean success, String message, T data) {
        super(success, message);
        this.data = data;
    }

    public DataResulter(boolean success, T data) {
        super(success);
        this.data = data;
    }
}
