package cain.alejandro.doudinamico;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button boton1;
    private EditText caja1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button)findViewById(R.id.boton1);
        caja1 = (EditText)findViewById(R.id.caja1);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((caja1.getText().toString()).equals("224")){
                    Intent registro = new Intent(getApplicationContext(),Main2Activity.class);
                    startActivityForResult(registro,0);
                }else{
                    toass();
                }
            }
        });
    }

    private  void toass(){
        Toast.makeText(this,"Respuesta incorrecta",Toast.LENGTH_SHORT).show();
    }

}
