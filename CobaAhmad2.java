package com.example.apkahmad4a;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class CobaAhmad2 extends AppCompatActivity {
    EditText editTextPanjang, editTextLebar, editTextHasilLuas, editTextHasilKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi_ahmad2);

        editTextPanjang = findViewById(R.id.Panjang);
        editTextLebar = findViewById(R.id.Lebar);
        editTextHasilLuas = findViewById(R.id.HasilLuas);
        editTextHasilKeliling = findViewById(R.id.Hasilkeliling);

        // Mengambil data dari intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            double panjang = extras.getDouble("panjang");
            double lebar = extras.getDouble("lebar");
            double luas = extras.getDouble("luas");
            double keliling = extras.getDouble("keliling");

            // Menampilkan data di EditText
            editTextPanjang.setText(String.valueOf(panjang));
            editTextLebar.setText(String.valueOf(lebar));
            editTextHasilLuas.setText(String.valueOf(luas));
            editTextHasilKeliling.setText(String.valueOf(keliling));
        }
    }
}