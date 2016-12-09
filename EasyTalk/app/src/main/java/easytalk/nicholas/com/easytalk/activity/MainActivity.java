package easytalk.nicholas.com.easytalk.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import easytalk.nicholas.com.easytalk.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Firebase.setAndroidContext(this);

        firebase = new Firebase("https://easytalk-fa513.firebaseio.com/mensagens");

        firebase.setValue("teste");*/
    }
}
