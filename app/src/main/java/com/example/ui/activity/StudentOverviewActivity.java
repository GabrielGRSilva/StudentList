package com.example.ui.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.aluramobile.R;
import com.example.model.Student;

import java.util.ArrayList;

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

        Bundle extras = getIntent().getExtras(); //Importa a ArrayList
        assert extras != null;
        ArrayList<Parcelable> arrayList  = extras.getParcelableArrayList("arraylist");
        assert arrayList != null;
        Student chosenStudent = (Student) arrayList.get(0);
    }
}
