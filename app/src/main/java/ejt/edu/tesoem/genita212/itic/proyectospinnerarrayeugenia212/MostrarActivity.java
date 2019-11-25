package ejt.edu.tesoem.genita212.itic.proyectospinnerarrayeugenia212;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class MostrarActivity extends AppCompatActivity {
    ArrayList<Yuyin> mostarColores;
    Button menu;
    Spinner mostrarasColores;

    ArrayAdapter<String> colorFran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        menu=(Button) findViewById((R.id.btnvolver1));

        mostrarasColores=findViewById(R.id.spMostrarColor);

        colorFran=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, Yuyin.colorzotes());
        mostarColores=new ArrayList<Yuyin>();

        mostrarasColores.setAdapter(colorFran);
    }

    public void volvermenu(View v){
        Intent menu = new Intent(this, PrincipalActivity.class);
        startActivity(menu);
        this.finish();
    }
}
