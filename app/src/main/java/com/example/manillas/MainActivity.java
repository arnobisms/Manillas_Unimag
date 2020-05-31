package com.example.manillas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

    public void calcular (View v){
        int opc_material, opc_dije, cant, opc_tipo, opc_moneda, valor, dolar = 0;
        String msj1, msj2;
        msj1 = getResources().getString(R.string.tipo_moneda_pesos);
        msj2 = getResources().getString(R.string.tipo_moneda_dolares);

        if(validar()){

            cant = Integer.parseInt(cantidad.getText().toString());
            opc_material = combo_materiales.getSelectedItemPosition();
            opc_dije = combo_dijes.getSelectedItemPosition();
            opc_tipo = combo_tipos.getSelectedItemPosition();
            opc_moneda = combo_monedas.getSelectedItemPosition();

            if(opc_material == 0){

                if(opc_dije == 0) {

                        if(opc_tipo == 0 || opc_tipo == 1 || opc_tipo == 2 ){

                            if(opc_moneda == 0){
                                valor = cant * 100 * 3200;

                            }
                            else{
                                valor = cant * 100;
                                dolar = 1;
                            }
                        }
                        else{

                            if(opc_tipo == 3){

                                if(opc_moneda == 0){
                                    valor = cant * 80 * 3200;
                                }
                                else{
                                    valor = cant * 80;
                                    dolar = 1;
                                }

                            }
                            else{

                                if(opc_moneda == 0){
                                    valor = cant * 70 * 3200;
                                }
                                else{
                                    valor = cant * 70;
                                    dolar = 1;
                                }

                            }

                        }
                }
                else{

                    if(opc_tipo == 0 || opc_tipo == 1 || opc_tipo == 2 ){

                        if(opc_moneda == 0){
                            valor = cant * 120 * 3200;
                        }
                        else{
                            valor = cant * 120;
                            dolar = 1;
                        }
                    }
                    else{

                        if(opc_tipo == 3){

                            if(opc_moneda == 0){
                                valor = cant * 100 * 3200;
                            }
                            else{
                                valor = cant * 100;
                                dolar = 1;
                            }
                        }
                        else{

                            if(opc_moneda == 0){
                                valor = cant * 90 * 3200;
                            }
                            else{
                                valor = cant * 90;
                                dolar = 1;
                            }

                        }

                    }

                }
            }

            else{

                if(opc_dije == 0) {

                    if(opc_tipo == 0 || opc_tipo == 1 || opc_tipo == 2 ){

                        if(opc_moneda == 0){
                            valor = cant * 90 * 3200;
                        }
                        else{
                            valor = cant * 90;
                            dolar = 1;
                        }
                    }
                    else{

                        if(opc_tipo == 3){

                            if(opc_moneda == 0){
                                valor = cant * 70 * 3200;
                            }
                            else{
                                valor = cant * 70;
                                dolar = 1;
                            }

                        }
                        else{

                            if(opc_moneda == 0){
                                valor = cant * 50 * 3200;
                            }
                            else{
                                valor = cant * 50;
                                dolar = 1;
                            }

                        }

                    }
                }
                else{

                    if(opc_tipo == 0 || opc_tipo == 1 || opc_tipo == 2 ){

                        if(opc_moneda == 0){
                            valor = cant * 110 * 3200;
                        }
                        else{
                            valor = cant * 110;
                            dolar = 1;
                        }
                    }
                    else{

                        if(opc_tipo == 3){

                            if(opc_moneda == 0){
                                valor = cant * 90 * 3200;
                            }
                            else{
                                valor = cant * 90;
                                dolar = 1;
                            }
                        }
                        else{

                            if(opc_moneda == 0){
                                valor = cant * 80 * 3200;
                            }
                            else{
                                valor = cant * 80;
                                dolar = 1;
                            }

                        }

                    }

                }



            }

            if(dolar == 0)
             resultado.setText(""+ valor +" " + msj1);
            else
                resultado.setText(""+ valor +" " + msj2);
        }
    }

    public void limpiar(View v){
        cantidad.setText("");
        resultado.setText("");
        cantidad.requestFocus();
        combo_materiales.setSelection(0);
        combo_dijes.setSelection(0);
        combo_tipos.setSelection(0);
        combo_monedas.setSelection(0);

    }

    public boolean validar() {
        String error, error2;
        error = getResources().getString(R.string.error_cantidad);
        error2 = getResources().getString(R.string.error_cantidad_0);

        if(cantidad.getText().toString().isEmpty()){
            cantidad.setError(error);
            cantidad.requestFocus();
            return false;
        }
        else{
            if(Integer.parseInt(cantidad.getText().toString())==0){
                cantidad.setError(error2);
                cantidad.requestFocus();
                return false;
            }
        }

        return true;
    }
}
