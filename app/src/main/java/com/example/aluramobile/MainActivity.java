package com.example.aluramobile;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> alunos = new ArrayList<>(Arrays.asList("AlunoDoido", "AlunoMaluco", "AlunoAlucicrazy"));
        TextView aluno1 = findViewById(R.id.textView); //Cada textView usa o ID criado lá no res/layout
        TextView aluno2 = findViewById(R.id.textView2);
        TextView aluno3 = findViewById(R.id.textView3);
        aluno1.setText(alunos.get(0)); //Pega o índice x da lista para atribuir àquele aluno
        aluno2.setText(alunos.get(1));
        aluno3.setText(alunos.get(2));
    }
}
