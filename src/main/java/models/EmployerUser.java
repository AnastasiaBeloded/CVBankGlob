package models;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class EmployerUser {
    private String companyName;
    private String companyWebsite;
    private String country;
    private String city;
    private String street;
    private String house;
    private String postcode;
    private String companyPhone;
    private String applicantName;
    private String applicantLastName;
    private String position;
    private String phone;
    private String corporativeEmail;
    private String password;
    private String confirmPassword;


}
