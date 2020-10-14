package com.example.forbes10;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;

import java.util.ArrayList;


public class ListForbesAdapter extends RecyclerView.Adapter<ListForbesAdapter.ListViewHolder>{
    private ArrayList<Forbes> listForbes;

    public ListForbesAdapter(ArrayList<Forbes> list) {
        this.listForbes = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_forbes, parent, false);
        return new ListViewHolder(view);
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    @Override
    public void onBindViewHolder(@NonNull  final ListViewHolder holder, int position) {
        final Forbes forbes = listForbes.get(position);
        Glide.with(holder.itemView.getContext())
                .load(forbes.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .override(Target.SIZE_ORIGINAL)
                .into(holder.imgPhoto);
        holder.tvName.setText(forbes.getName());
        holder.tvDetail.setText(forbes.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onItemClickCallback.onItemClicked(listForbes.get(holder.getAdapterPosition()));
                Intent detail = new Intent( view.getContext().getApplicationContext(), DetailActivity.class);

                // Kirimkan nilai menggungkan intent
                detail.putExtra(DetailActivity.NAMA, forbes.getName());
                detail.putExtra(DetailActivity.AGE, forbes.getAge());
                detail.putExtra(DetailActivity.WEALTH, forbes.getWealth());
                detail.putExtra(DetailActivity.PARAGRAF, forbes.getParagraf());
                detail.putExtra(DetailActivity.PHOTO, forbes.getPhoto());

                view.getContext().startActivity(detail);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listForbes.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Forbes data);
    }
}
