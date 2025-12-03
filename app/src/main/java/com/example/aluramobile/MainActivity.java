package com.example.aluramobile;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> alunos = new ArrayList<>(Arrays.asList("AlunoDoido", "AlunoMaluco", "AlunoAlucicrazy", "AlunoAdicional"));
        ListView listaAlunos = findViewById(R.id.main_activity_lv1); //ListView de alunos
        listaAlunos.setAdapter(new ArrayAdapter<>( //Adapter que conecta a ListView com a ArrayList, usando um layout padrão simple_list_item_1
                this,
                android.R.layout.simple_list_item_1,
                alunos));
    }
}
