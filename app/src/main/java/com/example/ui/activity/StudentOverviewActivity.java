package com.example.ui.activity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.aluramobile.R;
import com.example.model.Student;

public class StudentOverviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_student_overview);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.student_overview), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Student student = (Student) getIntent().getSerializableExtra("student");// Recupera o objeto passado à activity

        if (student != null) {
            setTextViews(student); // Configura os TextViews com os dados do estudante escolhido pelo usuário
        } else {
            Toast.makeText(this, "ERROR: Student == null", Toast.LENGTH_LONG).show();
            finish();
        }
    }

    private void setTextViews(Student student) {
        setTitle(student.getNome());

        TextView nameTextView = findViewById(R.id.overview_name);
        TextView phoneTextView = findViewById(R.id.overview_phone);
        TextView emailTextView = findViewById(R.id.overview_email);

        nameTextView.setText(student.getNome());
        phoneTextView.setText(student.getPhone());
        emailTextView.setText(student.getEmail());
    }
}