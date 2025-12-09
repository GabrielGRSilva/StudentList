package com.example.model;

public class Student {
    private final String nome;
    private final String phone;
    private final String email;

    public Student(String nome, String phone, String email) {
        this.nome = nome;
        this.phone = phone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
