package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrower {
    private Long id;
    private String contact;
    private String userName;
    private String name;
    private String nic;
    private String email;
    private String address;
    private String password;
    private String country;
}
