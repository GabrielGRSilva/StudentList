package com.example.ui.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.DAO.AlunoDao;
import com.example.aluramobile.R;
import com.example.model.Student;

public class StudentForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form);
        final EditText capturedName = findViewById(R.id.activity_student_form_name);
        final EditText capturedPhone = findViewById(R.id.activity_student_form_phone);
        final EditText capturedEmail = findViewById(R.id.activity_student_form_email);
        Button saveButton = findViewById(R.id.activity_student_form_save_button);

        saveButton.setOnClickListener(v -> {
            String nome = capturedName.getText().toString();
            String phone = capturedPhone.getText().toString();
            String email = capturedEmail.getText().toString();

            Student newStudent = new Student(nome, phone, email);

            new AlunoDao();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}