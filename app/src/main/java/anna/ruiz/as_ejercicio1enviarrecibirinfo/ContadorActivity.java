package anna.ruiz.as_ejercicio1enviarrecibirinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ContadorActivity extends AppCompatActivity {
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        txtResult = findViewById(R.id.txtResutContador);

        //Recogemos info
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            if (bundle.getString("OPERACION").equalsIgnoreCase("Palabras")){
                String palabras = bundle.getString("PALABRAS");
                txtResult.setText("La frase tiene "+ palabras + " palabras.");
               // Toast.makeText(this, "La frase tiene "+palabras+" palabras.", Toast.LENGTH_SHORT).show();
            }else {
                String caracteres = bundle.getString("CARACTERES");
                txtResult.setText("La frase tiene "+ caracteres + " caracteres.");
                //Toast.makeText(this, "La frase tiene "+caracteres+" caracteres.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}