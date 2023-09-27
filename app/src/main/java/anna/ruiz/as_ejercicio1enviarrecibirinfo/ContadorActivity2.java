package anna.ruiz.as_ejercicio1enviarrecibirinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.StringTokenizer;

public class ContadorActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            String frase = bundle.getString("FRASE");
            int operacion = bundle.getInt("OPERACION");

            if (operacion == R.id.btnCaracteresMain){ //COMPROBAMOS SI EL ID ES IGUAL AL DEL BOTON
                Toast.makeText(this, "La frase tiene "+frase.length()+" caracteres.", Toast.LENGTH_SHORT).show();
            }else{
                if (operacion == R.id.btnPalabrasMain){
                    StringTokenizer palabra = new StringTokenizer(frase); //Cuenta las palabras, como el split, pero mas correcto
                    Toast.makeText(this, "La frase tiene "+palabra.countTokens()+" palabras.", Toast.LENGTH_SHORT).show();

                }
            }

        }

    }
}