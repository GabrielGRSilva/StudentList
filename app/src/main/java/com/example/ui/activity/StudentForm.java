package com.example.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.DAO.StudentDAO;
import com.example.aluramobile.R;
import com.example.model.Student;

public class StudentForm extends AppCompatActivity {
    private EditText capturedName;
    private EditText capturedPhone;
    private EditText capturedEmail;
    final StudentDAO dao = new StudentDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Create New Student");
        setContentView(R.layout.activity_student_form);
        layoutConfig();
        fieldInitialization();
        Button saveButton = findViewById(R.id.activity_student_form_save_button);
        saveButton.setOnClickListener(v -> {
            createStudent();
        });
    }

    private void layoutConfig() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void createStudent() {
        String nome = capturedName.getText().toString();
        String phone = capturedPhone.getText().toString();
        String email = capturedEmail.getText().toString();
        Student newStudent = new Student(nome, phone, email);
        dao.save(newStudent);
        finish(); //Após salvar, finalizar esta activity (voltando na lista em MainActivity)
    }

    private void fieldInitialization() {
        capturedName = findViewById(R.id.activity_student_form_name);
        capturedPhone = findViewById(R.id.activity_student_form_phone);
        capturedEmail = findViewById(R.id.activity_student_form_email);
    }

    ;
    }