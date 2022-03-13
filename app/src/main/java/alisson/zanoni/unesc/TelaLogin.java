package alisson.zanoni.unesc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class TelaLogin extends AppCompatActivity {

    private EditText edtMatricula, edtSenha;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                edtMatricula = findViewById(R.id.edittextMatricula);
                edtSenha = findViewById(R.id.edittextSenha);

                String matricula = edtMatricula.getText().toString().trim();
                String senha = edtSenha.getText().toString().trim();


                if(matricula.isEmpty()){
                    CharSequence text = "Informe o número da Matricula";
                    Toast toast = Toast.makeText(context,text,duration);
                    toast.show();
                }
                else if (senha.isEmpty()){
                    CharSequence text = "Informe a senha";
                    Toast toast =Toast.makeText(context,text,duration);
                    toast.show();
                }
                else if (matricula.equals("123") && senha.equals("qwe123")){
                    CharSequence text = "Logado com sucesso";
                    Toast toast =Toast.makeText(context,text,duration);
                    toast.show();
                    Intent trocartela = new Intent(TelaLogin.this,TelaHome.class);
                    startActivity(trocartela);
                    finish();
                }
                else{
                    CharSequence text = "Matricula ou Senha invalidos";
                    Toast toast =Toast.makeText(context,text,duration);
                    toast.show();
                }
            }
        });


    }
}