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

public class MainActivity2 extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Drawable drawable1, drawable2, drawable3;
    ImageView imagenPro1, imagenPro2, imagenPro3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pantallaSevicios = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(pantallaSevicios);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Productos",Toast.LENGTH_SHORT).show();
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
        drawable1 = res1.getDrawable(R.drawable.productos1, getTheme());

        imagenPro1 = (ImageView) findViewById(R.id.imageProductos1);
        imagenPro1.setImageDrawable(drawable1);

        //--------------------------------------------------------------------------

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.productos2, getTheme());

        imagenPro2 = (ImageView) findViewById(R.id.imageProductos2);
        imagenPro2.setImageDrawable(drawable2);

        //--------------------------------------------------------------------------

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.productos3, getTheme());

        imagenPro3 = (ImageView) findViewById(R.id.imageProductos3);
        imagenPro3.setImageDrawable(drawable3);
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
            Toast.makeText(getApplicationContext(),"Productos", Toast.LENGTH_SHORT).show();
        }

        if (id == R.id.serviviosid){
            Intent pantallaServicios = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(pantallaServicios);
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