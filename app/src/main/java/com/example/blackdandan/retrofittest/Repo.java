package com.example.blackdandan.retrofittest;

import com.google.gson.Gson;

public class Repo{
    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return " status :"+status +" message:"+message;
    }
}
