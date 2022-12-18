package net.dam.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import net.dam.recyclerview.adaptadores.ProductoAdapter;
import net.dam.recyclerview.entidades.EjemplosProducto;
import net.dam.recyclerview.entidades.Producto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Producto> coleccionProducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coleccionProducto = EjemplosProducto.cargarEjemplos();

        RecyclerView recyclerView = ( RecyclerView ) findViewById( R.id.recyclerView );
        ProductoAdapter adapter = new ProductoAdapter( getApplicationContext(), coleccionProducto);
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        recyclerView.setAdapter( adapter );
    }
}