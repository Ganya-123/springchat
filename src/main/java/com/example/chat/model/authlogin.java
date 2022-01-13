package com.example.chat.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
@AllArgsConstructor
@Document(collection="login")
public class authlogin {
    @Id
    String email;
    String password;
    
}
