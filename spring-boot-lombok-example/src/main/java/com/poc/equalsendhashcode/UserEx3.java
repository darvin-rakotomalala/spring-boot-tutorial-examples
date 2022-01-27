package com.poc.equalsendhashcode;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class UserEx3 {
    @EqualsAndHashCode.Include
    private String name;

    @EqualsAndHashCode.Include
    private String email;

    private Integer age;
}
