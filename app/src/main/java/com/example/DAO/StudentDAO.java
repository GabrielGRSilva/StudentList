package com.example.DAO;

import com.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private static final List<Student> studentList = new ArrayList<>();

    public void save(Student newStudent){
        try{
            studentList.add(newStudent);
            System.out.println(newStudent.toString() + "added successfully!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Student> getAll(){
        return new ArrayList<>(studentList);
    }

}
