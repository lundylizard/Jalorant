package me.lundy.jalorant;

public class Response<T> {

    private int status;
    private T data;

    public int getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }
}
