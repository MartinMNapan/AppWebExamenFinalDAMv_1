package pe.idat.edu.appwebexamenfinaldamv_1.Adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pe.idat.edu.appwebexamenfinaldamv_1.Entidades.Productos;
import pe.idat.edu.appwebexamenfinaldamv_1.R;

public class AdaptadorProductos extends RecyclerView.Adapter<AdaptadorProductos.ProductosViewHolder> {
    //
    List<Productos> lista;

    public AdaptadorProductos(List<Productos> lista){
        this.lista = lista;
    }

    @NonNull
    @Override
    public ProductosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_productos, null);
        //
        return new ProductosViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductosViewHolder holder, int position) {
        //
        Productos obj = lista.get(position);
        holder.txtc.setText("Codigo: " + obj.getCod_producto());
        holder.txtp.setText("Producto: " + obj.getProducto());
        holder.txtb.setText("Bateria: " + obj.getBateria());
        holder.txtd.setText("Duracion: " + obj.getDuracion());
        //holder.img1.setImageResource(obj.getImagen());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ProductosViewHolder extends RecyclerView.ViewHolder{
        //
        TextView txtp, txtb, txtd, txtc;
        ImageView img1;

        public ProductosViewHolder(@Nullable View itemView){
            super(itemView);
            //
            txtc=itemView.findViewById(R.id.txtCodigo);
            txtp=itemView.findViewById(R.id.txtProducto);
            txtb=itemView.findViewById(R.id.txtBateria);
            txtd=itemView.findViewById(R.id.txtDuracion);
            img1=itemView.findViewById(R.id.imgProductos);
        }
    }

    //

}
