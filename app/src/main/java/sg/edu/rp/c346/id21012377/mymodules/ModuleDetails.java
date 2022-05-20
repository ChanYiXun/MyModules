package sg.edu.rp.c346.id21012377.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetails extends AppCompatActivity {
    TextView tvCode;
    TextView tvName;
    TextView Start;
    TextView End;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        tvCode = findViewById(R.id.tvID);
        tvName = findViewById(R.id.tvName);
        Start = findViewById(R.id.tvST);
        End = findViewById(R.id.tvET);
        tvCode.setText("");
        tvName.setText("");
        Start.setText("");
        End.setText("");
        Intent intentReceived = getIntent();
        String questionsSelected1 = intentReceived.getStringExtra("Mod_Code");
        String questionsSelected2 = intentReceived.getStringExtra("Mod_Name");
        String questionsSelected3 = intentReceived.getStringExtra("Mod_Start");
        String questionsSelected4 = intentReceived.getStringExtra("Mod_End");
        tvCode.setText(questionsSelected1);
        tvName.setText(questionsSelected2);
        Start.setText(questionsSelected3);
        End.setText(questionsSelected4);

    }
}