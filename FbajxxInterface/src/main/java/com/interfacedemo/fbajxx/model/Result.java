package com.interfacedemo.fbajxx.model;
import lombok.Data;

import java.util.List;
@Data
public class Result {
    private String message;
    private int count;
    private String  success;
    private List<Ajxx> ajList;

}
