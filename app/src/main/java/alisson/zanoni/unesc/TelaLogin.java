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
    private Button btnEntrar, btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        btnEntrar = findViewById(R.id.btnEntrar);
        btnCadastrar = findViewById(R.id.btnCadastrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trocarDeTela(TelaHome.class);
            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trocarDeTela(TelaCadastro.class);
            }
        });
    }

    public void trocarDeTela(Class classname){
        Intent trocartela = new Intent(TelaLogin.this,classname);
        startActivity(trocartela);
        finish();
    }
}