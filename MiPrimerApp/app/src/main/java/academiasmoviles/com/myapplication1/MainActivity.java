package academiasmoviles.com.myapplication1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtSesion1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSesion1 = (EditText) findViewById(R.id.edtSesion1);
        final EditText edtSesion2 = (EditText) findViewById(R.id.edtSesion2);
        final EditText edtSesion3 = (EditText) findViewById(R.id.edtSesion3);
        final EditText edtSesion4 = (EditText) findViewById(R.id.edtSesion4);
        Button btnReiniciar = (Button) findViewById(R.id.btnReiniciar);
        Button btnCalcular = (Button) findViewById(R.id.btnCalcular);
        final TextView tvResultado = (TextView) findViewById(R.id.tvResultado);

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtSesion1.setText("");
                edtSesion2.setText("");
                edtSesion3.setText("");
                edtSesion4.setText("");
                tvResultado.setText("");
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n1 = Integer.valueOf(edtSesion1.getText().toString());
                int n2 = Integer.valueOf(edtSesion2.getText().toString());
                int n3 = Integer.valueOf(edtSesion3.getText().toString());
                int n4 = Integer.valueOf(edtSesion4.getText().toString());

                double resultado = (n1 + n2 + n3 + n4) / 4;

                if(resultado >= 10.5) {
                    tvResultado.setBackgroundResource(R.color.colorAprobado);
                } else {
                    tvResultado.setBackgroundResource(R.color.colorDesaprobado);
                }

                tvResultado.setText(String.valueOf(resultado));

            }
        });

    }

}
