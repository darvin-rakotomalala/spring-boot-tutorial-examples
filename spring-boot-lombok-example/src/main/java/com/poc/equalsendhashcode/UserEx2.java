package com.poc.equalsendhashcode;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class UserEx2 {
    private String name;
    private String email;

    @EqualsAndHashCode.Exclude
    private Integer age;
}
