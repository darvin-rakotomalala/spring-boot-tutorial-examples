package com.poc.builder;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    private String name;
    private String email;
}
