package com.example.ui.activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.DAO.StudentDAO;
import com.example.aluramobile.R;
import com.example.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
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
        ListView studentList = findViewById(R.id.main_activity_lv1); //ListView de alunos
        studentList.setAdapter(new ArrayAdapter<>( //Adapter que conecta a ListView com a ArrayList, usando um layout padrão simple_list_item_1
                this,
                android.R.layout.simple_list_item_1,
                this.all()));
    }
}