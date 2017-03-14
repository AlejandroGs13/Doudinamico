package cain.alejandro.doudinamico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private CheckBox c1,c2,c3,c4,c5,c6;
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = (Button)findViewById(R.id.boton1);
        c1 = (CheckBox)findViewById(R.id.check1);
        c2 = (CheckBox)findViewById(R.id.check2);
        c3 = (CheckBox)findViewById(R.id.check3);
        c4 = (CheckBox)findViewById(R.id.check4);
        c5 = (CheckBox)findViewById(R.id.check5);
        c6 = (CheckBox)findViewById(R.id.check6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correcto(v);
            }
        });
}

    public void correcto(View v){
        if ((c1.isChecked()) && (!c2.isChecked()) && (c3.isChecked()) && (!c4.isChecked()) && (!c5.isChecked()) && (c6.isChecked())){
            siguiente(v);
        }else{
            Toast.makeText(this,"Respuesta incorrecta",Toast.LENGTH_SHORT).show();
        }
    }

    public void siguiente(View v){
        Intent registro = new Intent(getApplicationContext(), Main3Activity.class);
        startActivity(registro);
    }
}
