package com.example.manillas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText cantidad;
    private TextView resultado;
    private Spinner combo_materiales, combo_dijes, combo_tipos, combo_monedas;
    private String[] materiales;
    private String[] dijes;
    private String[] tipos;
    private String[] monedas;
    private ArrayAdapter<String> adapter1, adapter2, adapter3, adapter4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidad = findViewById(R.id.txtCantidad);
        resultado = findViewById(R.id.lblResultado);
        combo_materiales = findViewById(R.id.cmbMateriales);
        combo_dijes = findViewById(R.id.cmbDijes);
        combo_tipos = findViewById(R.id.cmbTipos);
        combo_monedas = findViewById(R.id.cmbMonedas);

        materiales = getResources().getStringArray(R.array.materiales);
        adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,materiales);
        combo_materiales.setAdapter(adapter1);

        dijes = getResources().getStringArray(R.array.dijes);
        adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,dijes);
        combo_dijes.setAdapter(adapter2);

        tipos = getResources().getStringArray(R.array.tipos);
        adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,tipos);
        combo_tipos.setAdapter(adapter3);

        monedas = getResources().getStringArray(R.array.tipo_monedas);
        adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, monedas);
        combo_monedas.setAdapter(adapter4);



    }
}
