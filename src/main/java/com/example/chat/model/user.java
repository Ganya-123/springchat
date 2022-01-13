package com.example.chat.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
@Document(collection = "user")

public class user {
    @Id
    private String userId;
    private String email;
    private String name;
    private String phone;
    private String password;


}
