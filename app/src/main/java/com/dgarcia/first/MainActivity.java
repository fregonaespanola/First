package com.dgarcia.first;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private SwipeRefreshLayout swipeLayout;
    private RecyclerView recyclerView;
    private ArrayList<item_bandeja> datos;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] arrpub = {"Ha publicado x", "Ha publicado x", "Ha publicado x", "Ha publicado x", "Ha publicado x", "Ha publicado x", "Ha publicado x", "Ha publicado x",
                "Ha publicado x", "Ha publicado x", "Ha publicado x", "Ha publicado x", "Ha publicado x", "Ha publicado x"};

        String[] arrnombre = {"Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
                "Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
                "Caritina", "Carlota", "Baltazar"};



        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);
        recyclerView = findViewById(R.id.recycler);
        datos = new ArrayList<item_bandeja>();

        for (int i = 0; i < 11; i++) {
            datos.add(new item_bandeja("Nombre: " + arrnombre[i],"" + arrpub[i]));
        }

        final adapterbandeja adaptador = new adapterbandeja(datos);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adaptador);

    }
        //system.exit(0);

    public void showAlertDialogButtonClicked(MainActivity mainActivity) {

        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);

        builder.setTitle("QUEDATE EN FOODIER");
        builder.setMessage("¿Estás seguro de que te quieres ir?");
        builder.setCancelable(false);


        builder.setPositiveButton("Sign out", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // do something like...
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                dialog.dismiss();

            }
        });

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });


        AlertDialog dialog = builder.create();
        dialog.show();
    }


    protected SwipeRefreshLayout.OnRefreshListener
            mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {


            Toast toast0 = Toast.makeText(MainActivity.this, "Hi there! I don't exist :)", Toast.LENGTH_LONG);
            toast0.show();
            swipeLayout.setRefreshing(false);
        }
    };



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.item1) {

            Toast toast = Toast.makeText(this, "BOTON PRIMERO", Toast.LENGTH_LONG);
            toast.show();

        }
        if (id == R.id.item2) {
            Toast toast = Toast.makeText(this, "BOTON SEGUNDO", Toast.LENGTH_LONG);
            toast.show();
        }

        if (id == R.id.item3) {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class); //MainBab
            startActivity(intent);
        }

        if (id == R.id.item4) {
            Intent intent = new Intent(this, LoginActivity.class); //MainBn
            startActivity(intent);
        }

        if (id == R.id.item5) {
            showAlertDialogButtonClicked(MainActivity.this);
        }

        return super.onOptionsItemSelected(item);
    }



    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {

        getMenuInflater().inflate(R.menu.menu_context, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item1:
                Toast toast = Toast.makeText(this, "Item copied",
                        Toast.LENGTH_LONG);
                toast.show();


                return true;

            case R.id.item2:
                Toast toast2 = Toast.makeText(this, "Downloading item...",
                        Toast.LENGTH_LONG);
                toast2.show();
                return true;

            default:
                return false;
        }

    }
}
