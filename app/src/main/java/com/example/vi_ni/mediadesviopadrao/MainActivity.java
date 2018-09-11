package com.example.vi_ni.mediadesviopadrao;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText edtAtleta1,edtAtleta2,edtAtleta3,edtAtleta4,edtAtleta5,edtAtleta6;
    TextView txtMedia,txtDesvio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAtleta1 = findViewById(R.id.edtAtleta1);
        edtAtleta2 = findViewById(R.id.edtAtleta2);
        edtAtleta3 = findViewById(R.id.edtAtleta3);
        edtAtleta4 = findViewById(R.id.edtAtleta4);
        edtAtleta5 = findViewById(R.id.edtAtleta5);
        edtAtleta6 = findViewById(R.id.edtAtleta6);
        txtMedia = findViewById(R.id.txtMedia);
        txtDesvio = findViewById(R.id.txtDesvio);

    }

    public void calcular(View view){
        double atleta1 = Double.parseDouble(edtAtleta1.getText().toString());
        double atleta2 = Double.parseDouble(edtAtleta2.getText().toString());
        double atleta3 = Double.parseDouble(edtAtleta3.getText().toString());
        double atleta4 = Double.parseDouble(edtAtleta4.getText().toString());
        double atleta5 = Double.parseDouble(edtAtleta5.getText().toString());
        double atleta6 = Double.parseDouble(edtAtleta6.getText().toString());
        double soma = atleta1 + atleta2 + atleta3 + atleta4 + atleta5 + atleta6;
        double media = soma / 6;
        double desvio = Math.sqrt(
                (Math.pow((atleta1 - media),2) +
                        Math.pow((atleta2 - media),2) +
                        Math.pow((atleta3 - media),2) +
                        Math.pow((atleta4 - media),2) +
                        Math.pow((atleta5 - media),2) +
                        Math.pow((atleta6 - media),2) )/ 6 );

        txtMedia.setText("Média: " + String.valueOf(media));
        txtDesvio.setText("Desvio: " + String.valueOf(desvio));

    }
}
