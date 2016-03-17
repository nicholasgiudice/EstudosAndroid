package todolist.nicholasgiudice.com.listadetarefas;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {

    private ListView taskList;
    private Button addButton;
    private ArrayList<String> tasks = new ArrayList<String>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton= (Button) findViewById(R.id.buttonAdd);

        addButton.setOnClickListener(this);
    }

    private void openDialogAddTask()
    {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View view = inflater.inflate(R.layout.add_task_dialog, null);
        final EditText etTask = (EditText) view.findViewById(R.id.etTask);
        builder1.setView(view);

        builder1.setPositiveButton(R.string.add_button, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                String input = etTask.getText().toString();
                if (!input.isEmpty()) {
                    addTask(input);
                }
            }
        });

        builder1.setNegativeButton(R.string.cancel_button, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });

        AlertDialog alert11 = builder1.create();

        alert11.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialog) {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(etTask, InputMethodManager.SHOW_IMPLICIT);
            }
        });

        alert11.show();
    }

    private void addTask(String input)
    {
        tasks.add(input);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_item_task, android.R.id.text1, tasks);

        taskList = (ListView) findViewById(R.id.listTasks);
        taskList.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonAdd)
            openDialogAddTask();
        else
        {

        }
    }
}
