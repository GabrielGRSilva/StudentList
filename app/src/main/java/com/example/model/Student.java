package com.example.model;

import androidx.annotation.NonNull;

public class Student {
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
}