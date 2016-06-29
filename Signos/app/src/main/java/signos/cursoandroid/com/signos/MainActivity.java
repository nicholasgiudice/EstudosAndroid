package signos.cursoandroid.com.signos;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends Activity {

    private ListView listaDeSignos;
    private String[] signos = {"Aríes", "Touro", "Gêmeos", "Câncer",
            "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricornio", "Aquário", "Peixes"};

    private String[] perfis = {
            "Arianos são legais", "Taurinos são mais legais", "Geminianos são legais",
            "...","...","...","...","...","...","...","...","..."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeSignos = (ListView) findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, signos);

        listaDeSignos.setAdapter(adapter);

        listaDeSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), perfis[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
