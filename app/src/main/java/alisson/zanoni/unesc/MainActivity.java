package alisson.zanoni.unesc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    int tempoDeEspera = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trocaDeTela();
    }

    private void trocaDeTela() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent splash = new Intent(MainActivity.this,TelaLogin.class);
                startActivity(splash);
                finish();
            }
        },tempoDeEspera);
    }
}