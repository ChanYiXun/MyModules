package sg.edu.rp.c346.id21012377.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvMod1;
    TextView tvMod2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMod1 = findViewById(R.id.tvM1);
        tvMod2 = findViewById(R.id.tvM2);

        tvMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("Mod_Code", "Module Code:C346");
                intent.putExtra("Mod_Name",  "Module Name: Android Programming");
                intent.putExtra("Mod_Start",  "Starts 8:30 AM");
                intent.putExtra("Mod_End",  "Starts 3.30 PM");
                startActivity(intent);
            }
        });

        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("Mod_Code", "Module Code:C349");
                intent.putExtra("Mod_Name",  "Module Name: iPad Programming");
                intent.putExtra("Mod_Start",  "Starts 8:30 AM");
                intent.putExtra("Mod_End",  "Starts 3.30 PM");
                startActivity(intent);
            }
        });

    }
}