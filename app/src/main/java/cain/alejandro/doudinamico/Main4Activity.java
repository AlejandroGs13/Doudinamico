package cain.alejandro.doudinamico;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class Main4Activity extends AppCompatActivity {
    private ToggleButton boton1;
    private Button  boton2;
    private EditText caja1;
    private ProgressBar progress;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        final boolean iniciado = false;
        boton1 = (ToggleButton) findViewById(R.id.boton1);
        boton2 = (Button) findViewById(R.id.boton2);
        caja1 = (EditText) findViewById(R.id.caja1);
        progress = (ProgressBar) findViewById(R.id.pro1);
        progress.setVisibility(View.INVISIBLE);
        boton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean isChecked) {
                if (isChecked) {
                    progress.setVisibility(View.VISIBLE);
                    iniciarAvance();
                } else {
                    progress.setVisibility(View.INVISIBLE);
                }

            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.getText().toString().equals("9")){
                    Intent registro = new Intent(getApplicationContext(), Main5Activity.class);
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

    private void iniciarAvance()
    {
        final Thread thread = new Thread(){
            @Override
            public void run() {
                try {

                   Thread.sleep(9000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                        boton1.setChecked(false);

                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        thread.start();

    }





}
