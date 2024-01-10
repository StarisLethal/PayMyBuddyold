package com.amenor.paymybuddy.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Person {

    private Integer personId;
    private String firstName;
    private String lastName;
    private String email;
    private List<Person> listOfFriend;

}
