package anna.ruiz.as_ejercicio1enviarrecibirinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtFrase;
    private Button btnCarac;
    private Button btnPalabras;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVista();





        /*btnCarac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                int num = frase.length();

                enviarResultado(num, "Introduce una frase", "CARACTERES", "Caracteres");

            }
        });

        btnPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frase = txtFrase.getText().toString();
                String[] palabras = frase.split(" ");
                int num = palabras.length;

                enviarResultado(num, "Introduce una frase!!", "PALABRAS", "Palabras");
            }
        });*/

    }

    /*private void enviarResultado(int num, String Introduce_una_frase, String CARACTERES, String Caracteres) {
        if (num == 0) {
            Toast.makeText(MainActivity.this, Introduce_una_frase, Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(MainActivity.this, ContadorActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString(CARACTERES, String.valueOf(num));
            bundle.putString("OPERACION", Caracteres);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }*/

    private void inicializarVista() {
        txtFrase = findViewById(R.id.txtFraseMain);
        btnCarac = findViewById(R.id.btnCaracteresMain);
        btnPalabras = findViewById(R.id.btnPalabrasMain);
    }

    public void onClickBotones(View boton){
        String frase = txtFrase.getText().toString();

        if (!frase.isEmpty()){ //Si la frase no esta vacia
            //envio la otra actividad
            Intent intent = new Intent(MainActivity.this, ContadorActivity2.class);
            Bundle bundle = new Bundle();
            bundle.putString("FRASE",frase);
            bundle.putInt("OPERACION", boton.getId());//le decimos q boton ha pulsado al pasar el id del boton
            intent.putExtras(bundle);
            startActivity(intent);
        }else {
            Toast.makeText(this, "Debes introducir una frase", Toast.LENGTH_SHORT).show();
        }

    }

}