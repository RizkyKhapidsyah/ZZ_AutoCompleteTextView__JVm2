package com.rk.actv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView ACTV_Demo_IDJAVA;
    TextView TV_AutoText_IDJAVA;
    Button B_Reset_IDJAVA;

    String[] StrPembantu = {
            "",
            "\n"
    };

    String[] ListNama = {
            "Rizky Khapidsyah",
            "Dessy Puspita Sari",
            "Mahasiswa 1",
            "Mahasiswa 2",
            "Murid 1",
            "Murid 2",
            "Student 1",
            "Student 2"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ACTV_Demo_IDJAVA = findViewById(R.id.ACTV_Demo_IDXML);
        TV_AutoText_IDJAVA = findViewById(R.id.TV_AutoText_IDXML);
        B_Reset_IDJAVA = findViewById(R.id.B_Reset_IDXML);

        final StringBuilder X = new StringBuilder();
        X.append("Input Value: ").append(StrPembantu[1]);

        for (String Z : ListNama) {
            X.append(Z).append(StrPembantu[1]);
        }

        TV_AutoText_IDJAVA.setText(X);

        //ArrayAdapter: Sebelum di-Generify
        /*ArrayAdapter LarikAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                ListNama);
        */

        //ArrayAdapter: Setelah di-Generify
        ArrayAdapter<String> LarikAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                ListNama);

        ACTV_Demo_IDJAVA.setAdapter(LarikAdapter);
        ACTV_Demo_IDJAVA.setThreshold(1);
        ACTV_Demo_IDJAVA.setAdapter(LarikAdapter);
        ACTV_Demo_IDJAVA.requestFocus();

        B_Reset_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ACTV_Demo_IDJAVA.getText().toString() != "") {
                    ACTV_Demo_IDJAVA.setText(StrPembantu[0]);
                    ACTV_Demo_IDJAVA.requestFocus();
                }
            }
        });
    }
}
