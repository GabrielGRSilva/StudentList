package com.example.model;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Student implements Serializable {
    private final String nome;
    private final String phone;
    private final String email;

    public Student(String nome, String phone, String email) {
        this.nome = nome;
        this.phone = phone;
        this.email = email;
    }

    @NonNull
    @Override
    public String toString() {
        return nome;
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