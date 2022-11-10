package com.sparta.webSpring.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class PersonRequestDto {
    private String name;
    private int age;
    private String address;
}
