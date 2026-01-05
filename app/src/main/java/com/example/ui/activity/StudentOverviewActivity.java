package com.example.ui.activity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.aluramobile.R;
import com.example.model.Student;
import java.util.Objects;

public class StudentOverviewActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
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

        Student student = Objects.requireNonNull(getIntent().getExtras()).getParcelable("student");
        assert student != null;
        setTitle(student.getNome());

        TextView nameTextView = findViewById(R.id.overview_name);
        TextView phoneTextView = findViewById(R.id.overview_phone);
        TextView emailTextView = findViewById(R.id.overview_email);

        nameTextView.setText(student.getNome());
        phoneTextView.setText("Phone: " + student.getPhone());
        emailTextView.setText("Email: " + student.getEmail());
    }
}