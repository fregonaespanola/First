package com.dgarcia.first;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterbandeja extends RecyclerView.Adapter<adapterbandeja.ContactosViewHolder> implements View.OnClickListener{

    private ArrayList<item_bandeja> datos;
    private View.OnClickListener listener;

    public adapterbandeja(ArrayList<item_bandeja> datos) {
        this.datos = datos;
    }

    @Override
    public void onClick(View view) {
        if(listener != null)
            listener.onClick(view);
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    public static class ContactosViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNombre;
        private TextView txtTelefono;

        public ContactosViewHolder(View itemView) {
            super(itemView);
            this.txtNombre = itemView.findViewById(R.id.nombre);
            this.txtTelefono = itemView.findViewById(R.id.publicacion);
        }

        public void bindContacto(item_bandeja item_bandeja){
            txtNombre.setText(item_bandeja.getNombre());
            txtTelefono.setText(item_bandeja.getPublicacion());
        }
    }

    //Construye la vista
    @Override
    public ContactosViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itembandeja, viewGroup, false);

        itemView.setOnClickListener(this);

        ContactosViewHolder tvh = new ContactosViewHolder(itemView);
        return tvh;
    }

    //asigna cada componente
    @Override
    public void onBindViewHolder(@NonNull ContactosViewHolder holder, int position){
        item_bandeja item_bandeja = datos.get(position);
        holder.bindContacto(item_bandeja);
    }

    //Devuelve el tamaño del array
    @Override
    public int getItemCount(){
        return datos.size();
    }
}
