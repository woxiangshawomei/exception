package com.qf.exception.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class Student {

    private int id;

    @NotNull(message = "用户名不能为空")
    private String name;
}
