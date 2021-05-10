package com.springmvc.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private boolean success;

    private String errorMessage;

    private T data;

    public Result(boolean success, String errorMessage){
        this.success = success;
        this.errorMessage = errorMessage;
    }

}
