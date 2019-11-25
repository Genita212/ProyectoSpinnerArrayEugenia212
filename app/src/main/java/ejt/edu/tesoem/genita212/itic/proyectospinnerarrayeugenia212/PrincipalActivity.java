package ejt.edu.tesoem.genita212.itic.proyectospinnerarrayeugenia212;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void acercade(View v) {
        Toast.makeText(getApplicationContext(), "Creado por Eugenia Juárez Tolentino", Toast.LENGTH_LONG).show();
    }

    public void agregarcolor(View v){
        Intent insertar= new Intent(this, AgregarActivity.class);
        startActivity(insertar);
        this.finish();
    }
     public void mostrarcolor(View v){
        Intent mostrar= new Intent(this, MostrarActivity.class);
        startActivity(mostrar);
        this.finish();
     }
}
