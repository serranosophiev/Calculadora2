package mx.itson.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btn_sumar;
    private Button btn_restar;
    private Button btn_multiplicar;
    private Button btn_dividir;
    private TextView view_respuesta;
    private EditText edit_valor1;
    private EditText edit_valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_valor1 = findViewById(R.id.valor1);
        edit_valor2 = findViewById(R.id.valor2);
        view_respuesta = findViewById(R.id.respuesta);


        btn_sumar = findViewById(R.id.btn_sum);
        btn_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
              view_respuesta.setText(  suma( Integer.parseInt(edit_valor1.getText().toString()), Integer.parseInt(edit_valor2.getText().toString())  )+"");
            }
        });
        btn_restar = findViewById(R.id.btn_rest);
        btn_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_respuesta.setText(  resta( Integer.parseInt(edit_valor1.getText().toString()), Integer.parseInt(edit_valor2.getText().toString())  )+"");
            }
        });
        btn_multiplicar = findViewById(R.id.btn_mul);
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_respuesta.setText(  multiplicar ( Integer.parseInt(edit_valor1.getText().toString()), Integer.parseInt(edit_valor2.getText().toString())  )+"");
            }
        });
        btn_dividir = findViewById(R.id.btn_div);
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view_respuesta.setText(  dividir ( Integer.parseInt(edit_valor1.getText().toString()), Integer.parseInt(edit_valor2.getText().toString())  )+"");
            }
        });


    }

    public int suma (int a, int b){
        return a+b;
    }
    public int resta (int a, int b){
        return a-b;
    }
    public int multiplicar (int a, int b){
        return a*b;
    }
    public int dividir (int a, int b){
        return a/b;
    }
}