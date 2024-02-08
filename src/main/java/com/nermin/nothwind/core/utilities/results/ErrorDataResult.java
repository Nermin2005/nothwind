package com.nermin.nothwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResulter<T> {
    public ErrorDataResult(String message, T data) {
        super(false, message, data);
    }

    public ErrorDataResult(T data) {
        super(false, data);
    }
    public ErrorDataResult(String message) {
        super(false,message,null);
    }
}
