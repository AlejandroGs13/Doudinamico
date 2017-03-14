package cain.alejandro.doudinamico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private RadioButton r1;
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        r1 = (RadioButton)findViewById(R.id.Rabat);
        b1 = (Button)findViewById(R.id.boton1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r1.isChecked()){
                    Intent registro = new Intent(getApplicationContext(), Main4Activity.class);
                    startActivity(registro);
                }else{
                    toas("Despuesta Incorrecta");
                }
            }
        });

    }

    public void toas(String b){
        Toast.makeText(this,b,Toast.LENGTH_SHORT).show();
    }
}
