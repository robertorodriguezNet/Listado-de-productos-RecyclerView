package net.dam.recyclerview.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import net.dam.recyclerview.R;
import net.dam.recyclerview.entidades.Producto;

import java.util.ArrayList;

/**
 * Un adaptador es un puente entre los datos y la UI
 */
public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ViewHolder> {

    Context context;
    public ArrayList<Producto> listData;

    public ProductoAdapter(Context context, ArrayList<Producto> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ProductoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from( context ).inflate( R.layout.producto_item_view, parent, false );
        return new ViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoAdapter.ViewHolder holder, int position) {
        holder.tv_denominacion.setText( listData.get( position ).getDenominacion() );
        holder.tv_marca.setText( Integer.toString( listData.get( position ).getMarca() ) );
        //holder.img_miniaturaProducto.setImageResource( R.drawable.ic_baseline_camera_64 );
        holder.img_addProducto.setImageResource( R.drawable.ic_baseline_post_add_24 );

        Glide.with( context )
                .load( listData.get( position ).getImagen() )
                .into( holder.img_miniaturaProducto );
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_denominacion, tv_marca;
        ImageView img_miniaturaProducto, img_addProducto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_denominacion = itemView.findViewById( R.id.tv_denominacion);
            tv_marca = itemView.findViewById( R.id.tv_marca);
            img_miniaturaProducto = itemView.findViewById( R.id.img_miniaturaProducto );
            img_addProducto = itemView.findViewById( R.id.img_addProducto );
        }
    }
}
