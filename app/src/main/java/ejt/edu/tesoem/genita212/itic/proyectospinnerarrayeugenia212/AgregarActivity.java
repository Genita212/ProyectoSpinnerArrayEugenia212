package ejt.edu.tesoem.genita212.itic.proyectospinnerarrayeugenia212;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class AgregarActivity extends AppCompatActivity {
    EditText nombre;
    ArrayList<String> agrega= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        nombre=(EditText) findViewById(R.id.txtNombreColor);
    }

    public void volvermenu(View v){
        Intent menu = new Intent(this, PrincipalActivity.class);
        startActivity(menu);
        this.finish();
    }

    public void agregarNombreColor(View v){
        String inserta = nombre.getText().toString();

        if(agrega.contains(inserta)){
            Toast.makeText(this,"Debes de ingresar un color",Toast.LENGTH_SHORT).show();
        }else{
            Yuyin.agregarNombreColor(nombre.getText().toString());
            nombre.setText("");
            Toast.makeText(this,"Se ha registrado color!!00",Toast.LENGTH_LONG).show();
        }
    }
}
