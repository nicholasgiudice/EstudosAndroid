package easytalk.nicholas.com.easytalk.activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import easytalk.nicholas.com.easytalk.R;
import easytalk.nicholas.com.easytalk.application.ConfiguracaoFirebase;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void abrirCadastroUsuario(View view){
        Intent intent = new Intent(LoginActivity.this, CadastroUsuarioActivity.class);
        startActivity(intent);
    }
}
