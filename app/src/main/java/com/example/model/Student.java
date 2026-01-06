package com.example.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class Student implements Parcelable {
    private final String nome;
    private final String phone;
    private final String email;

    public Student(String nome, String phone, String email) {
        this.nome = nome;
        this.phone = phone;
        this.email = email;
    }

    protected Student(Parcel in) {
        nome = in.readString();
        phone = in.readString();
        email = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(phone);
        dest.writeString(email);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

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