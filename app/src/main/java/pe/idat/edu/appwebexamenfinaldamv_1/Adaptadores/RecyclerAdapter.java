package pe.idat.edu.appwebexamenfinaldamv_1.Adaptadores;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pe.idat.edu.appwebexamenfinaldamv_1.Entidades.EstadoBateria;
import pe.idat.edu.appwebexamenfinaldamv_1.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder>{
    private List<EstadoBateria> items;
    private List<EstadoBateria> originalItems;
    private RecyclerItemClick itemClick;
    //
    public RecyclerAdapter(List<EstadoBateria> items, RecyclerItemClick itemClick){
        this.items = items;
        this.itemClick = itemClick;
        this.originalItems = new ArrayList<>();
        originalItems.addAll(items);
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, final int position) {
        final EstadoBateria item = items.get(position);
        holder.imgItem.setImageResource(item.getImgResource());
        holder.tvTitulo.setText(item.getTitulo());
        holder.tvDescripcion.setText(item.getDescripcion());
        //
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClick.itemClick(item);

            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    //
    public void filter(final String strSearch){
        if(strSearch.length()==0){
            items.clear();
            items.addAll(originalItems);
        }
        else{
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
                items.clear();
                List<EstadoBateria> collect = originalItems.stream()
                        .filter(i -> i.getTitulo().toLowerCase().contains(strSearch))
                        .collect(Collectors.toList());
                items.addAll(collect);
            }
            else {
                items.clear();
                for (EstadoBateria i : originalItems){
                    if(i.getTitulo().toLowerCase().contains(strSearch)){
                        items.add(i);
                    }
                }
            }
        }
        notifyDataSetChanged();
    }
    //
    public class RecyclerHolder extends RecyclerView.ViewHolder{
        private ImageView imgItem;
        private TextView tvTitulo;
        private TextView tvDescripcion;

        public RecyclerHolder(@NonNull View itemView_1){
            super(itemView_1);

            imgItem = itemView.findViewById(R.id.imgItem);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
        }
    }
    //
    public interface RecyclerItemClick{
        void itemClick(EstadoBateria item);
    }
}
