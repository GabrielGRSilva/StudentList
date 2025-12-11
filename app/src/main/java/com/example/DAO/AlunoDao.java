package com.example.DAO;

import com.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class AlunoDao {
    private static List<Student> studentList = new ArrayList<>();


    public save(Student newStudent){
        try{
            studentList.add(newStudent);
        }except(Exception e){
            return e;
        }
        studentList.add(newStudent);
        return true;
    }
    public List<Student> getAll(){
        return studentList;
    }

}
