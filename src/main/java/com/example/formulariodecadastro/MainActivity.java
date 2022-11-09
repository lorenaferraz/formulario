package com.example.formulariodecadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nome, idade;
    private RadioButton masculino, feminino,nao;
    private TextView resultadoNome, resultadoIdade, resultadoSexo;
    private Button cadastrar;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editNome);
        idade = findViewById(R.id.editIdade);

        masculino = findViewById(R.id.radioButtonMasculino);
        feminino = findViewById(R.id.radioButtonFeminino);
        nao = findViewById(R.id.radioButton);

        resultadoNome = findViewById(R.id.resultadoNome);
        resultadoIdade = findViewById(R.id.resultadoIdade);
        resultadoSexo = findViewById(R.id.resultadoSexo);

        cadastrar = findViewById(R.id.bt_cadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick (View view) {

                    String editNome = nome.getText().toString();
                    String editIdade = idade.getText().toString();

                    if (feminino.isChecked()) {
                        resultadoNome.setText(editNome);
                        resultadoIdade.setText(editIdade);
                        resultadoSexo.setText("Sexo: Feminino");
                    }
                    else if (masculino.isChecked()) {
                        resultadoNome.setText(editNome);
                        resultadoIdade.setText(editIdade);
                        resultadoSexo.setText("Sexo: Masculino");
                     }

                    else if (nao.isChecked() ){
                        resultadoNome.setText(editNome);
                        resultadoIdade.setText(editIdade);
                        resultadoSexo.setText("Sexo: Prefiro não informar");
                    }

                }
            });
        }
}