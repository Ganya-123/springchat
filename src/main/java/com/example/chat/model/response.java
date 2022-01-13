package com.example.chat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@AllArgsConstructor
@ToString

public class response {

    int code;
    String msg;
    Object object;
    
}
