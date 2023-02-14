package com.dgarcia.first;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import com.dgarcia.first.databinding.ActivityMainBinding;
import com.dgarcia.first.main.SectionsPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
/*
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


        /*
        WebView mycontext = (WebView) findViewById(R.id.vistaweb);
        registerForContextMenu(mycontext);


        // cast al Layout SwipeRefresh con el que rodeamos la vista
        // en el xml y le colocamos un listener
        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);

        miVisorWeb = (WebView) findViewById(R.id.vistaweb);
//        miVisorWeb.getSettings().setJavaScriptEnabled(true);
//        miVisorWeb.getSettings().setBuiltInZoomControls(true);
        miVisorWeb.loadUrl("https://thispersondoesnotexist.com");

    }
        //system.exit(0);
/*
    public void showAlertDialogButtonClicked(MainActivity mainActivity) {

        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);

        builder.setCancelable(false);

        builder.setView(getLayoutInflater().inflate(R.layout.alertdialog_view, null));

*/
    /*
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
*/

    private ActivityMainBinding binding;
    private MenuItem prevMenuItem;
    private SectionsPagerAdapter sectionsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager1 = findViewById(R.id.view_pager);
        viewPager1.setAdapter(sectionsPagerAdapter);





        BottomNavigationView mybottomNavView = findViewById(R.id.nav_view);

        BottomNavigationMenuView bottomNavigationMenuView =
                (BottomNavigationMenuView) mybottomNavView.getChildAt(0);
        View v = bottomNavigationMenuView.getChildAt(2);
        BottomNavigationItemView itemView = (BottomNavigationItemView) v;
        mybottomNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        item.setChecked(true);
                        removeBadge(mybottomNavView,item.getItemId());
                        viewPager1.setCurrentItem(0);
                        break;

                    case R.id.navigation_dashboard:
                        item.setChecked(true);
                        removeBadge(mybottomNavView,item.getItemId());
                        viewPager1.setCurrentItem(1);
                        break;

                    case R.id.navigation_notifications:
                        item.setChecked(true);
                        removeBadge(mybottomNavView,item.getItemId());
                        viewPager1.setCurrentItem(2);
                        break;




                }
                return false;
            }
        });

        viewPager1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                } else {
                    mybottomNavView.getMenu().getItem(0).setChecked(false);
                    mybottomNavView.getMenu().getItem(position).setChecked(true);
                    removeBadge(mybottomNavView, mybottomNavView.getMenu().getItem(position).getItemId());
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }


            });

        }

    public void removeBadge(BottomNavigationView bottomNavigationView, @IdRes int itemId) {
        BottomNavigationItemView itemView = bottomNavigationView.findViewById(itemId);
        if (itemView.getChildCount() == 3) {
            itemView.removeViewAt(2);
        }
    }
}


