package com.mysite.mysite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Contact {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String email;

    private Contact() {
    }

    public Long getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String firstName, String lastName, String email) {
        this.setFirstName(firstName);
        this.lastName = lastName;
        this.email = email;
    }

}