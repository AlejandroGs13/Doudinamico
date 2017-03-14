package cain.alejandro.doudinamico;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {

    private  boolean isImageFitToScreen;
    private ImageView imagen1;
    private int pos=0;
    private EditText caja1;
    private Button boton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        imagen1 = (ImageView)findViewById(R.id.imagen1);
        caja1 = (EditText)findViewById(R.id.caja1);
        boton1 = (Button)findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caja1.getText().toString().equals("8")){
                    toas("Felicidades Ganaste");
                }else{
                    toas("Respuesta incorrecta");
                }
            }
        });
        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isImageFitToScreen) {
                    isImageFitToScreen=false;
                    imagen1.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));
                    imagen1.setMaxHeight(400);
                    imagen1.setMaxWidth(200);




                }else{
                    isImageFitToScreen=true;
                    pos = imagen1.getBaseline();
                    imagen1.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
                    imagen1.setScaleType(ImageView.ScaleType.FIT_XY);
                }
            }
        });

    }

    public void toas(String b){
        Toast.makeText(this,b,Toast.LENGTH_SHORT).show();
    }

}
