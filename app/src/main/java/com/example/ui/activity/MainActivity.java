package com.example.ui.activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.example.DAO.StudentDAO;
import com.example.aluramobile.R;
import com.example.model.Student;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    StudentDAO dao = new StudentDAO();

    private List<Student> all(){
        return dao.getAll();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Student List");
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences = getSharedPreferences("MyStudentApp", MODE_PRIVATE);
        StudentForm.loadStudentList(sharedPreferences);

        FloatingActionButton fab = findViewById(R.id.floatingActionButton1);
        fab.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, StudentForm.class));
        });
    }

    @Override
    protected void onResume(){ //Ao reabrir a Activity, e não apenas onCreate
        super.onResume();
        ListView studentList = findViewById(R.id.main_activity_lv1); //ListView de alunos
        SharedPreferences sharedPreferences = getSharedPreferences("MyStudentApp", MODE_PRIVATE);
        studentList.setAdapter(new ArrayAdapter<>( //Adapter que conecta a ListView com a ArrayList, usando um layout padrão simple_list_item_1
                this,
                android.R.layout.simple_list_item_1,
                StudentForm.loadStudentList(sharedPreferences)));
    }
}