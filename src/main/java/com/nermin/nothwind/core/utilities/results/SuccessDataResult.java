package com.nermin.nothwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResulter<T> {
    public SuccessDataResult(String message, T data) {
        super(true, message, data);
    }

    public SuccessDataResult(T data) {
        super(true, data);
    }
    public SuccessDataResult(String message) {
        super(true,message,null);
    }
}
