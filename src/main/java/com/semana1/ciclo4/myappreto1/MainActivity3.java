package com.semana1.ciclo4.myappreto1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Drawable drawable1, drawable2, drawable3;
    ImageView imagenS1, imagenS2, imagenS3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Servicios", Toast.LENGTH_SHORT).show();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaProductos = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(pantallaProductos);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaSucursales = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(pantallaSucursales);
            }
        });

        //--------------------------------------------------------------------------

        Resources res1 = getResources();
        drawable1 = res1.getDrawable(R.drawable.servicios1, getTheme());

        imagenS1 = (ImageView) findViewById(R.id.imageServicios1);
        imagenS1.setImageDrawable(drawable1);

        //--------------------------------------------------------------------------

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.servicios2, getTheme());

        imagenS2 = (ImageView) findViewById(R.id.imageServicios2);
        imagenS2.setImageDrawable(drawable2);

        //--------------------------------------------------------------------------

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.services3, getTheme());

        imagenS3 = (ImageView) findViewById(R.id.imageServicios3);
        imagenS3.setImageDrawable(drawable3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menusuperior, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.productosid){
            Intent pantallaProductos = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(pantallaProductos);
            Toast.makeText(getApplicationContext(),"Productos", Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.serviviosid){
            Toast.makeText(getApplicationContext(),"Servicios",Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.sucursalesid){
            Intent pantallaSucursales = new Intent(getApplicationContext(), MainActivity4.class);
            startActivity(pantallaSucursales);
            Toast.makeText(getApplicationContext(),"Sucursales", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}