package easytalk.nicholas.com.easytalk.helper;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;

/**
 * Created by Nicholas on 25/07/2016.
 */
public class Preferencias {

    private Context context;
    private SharedPreferences preferences;
    private static final String NOME_ARQUIVO = "easyTalk.Preferences";
    private static final int MODE = 0;
    private SharedPreferences.Editor editor;
    private static final String CHAVE_NOME = "nome";
    private static final String CHAVE_TELEFONE = "telefone";
    private static final String CHAVE_TOKEN = "token";


    public Preferencias(Context context){
        this.context = context;
        this.preferences = context.getSharedPreferences(NOME_ARQUIVO, MODE);
        editor = preferences.edit();
    }

    public void salvarUsuarioPreferencias(String nome, String telefone, String token){
        editor.putString(CHAVE_NOME, nome);
        editor.putString(CHAVE_TELEFONE, telefone);
        editor.putString(CHAVE_TOKEN, token);
        editor.commit();
    }

    public HashMap<String, String> getDadosUsuario(){
        HashMap<String, String> dadosUsuario = new HashMap<>();

        dadosUsuario.put(CHAVE_NOME, preferences.getString(CHAVE_NOME, null));
        dadosUsuario.put(CHAVE_TELEFONE, preferences.getString(CHAVE_TELEFONE, null));
        dadosUsuario.put(CHAVE_TOKEN, preferences.getString(CHAVE_TOKEN, null));

        return dadosUsuario;
    }
}
