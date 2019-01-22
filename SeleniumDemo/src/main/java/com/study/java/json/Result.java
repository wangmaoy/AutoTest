package com.study.java.json;
import java.util.List;
public class Result {
    private String code;
    private List<Data> data;
    private String message;
    private String success;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", datas=" + data +
                ", message='" + message + '\'' +
                ", success='" + success + '\'' +
                '}';
    }
}
