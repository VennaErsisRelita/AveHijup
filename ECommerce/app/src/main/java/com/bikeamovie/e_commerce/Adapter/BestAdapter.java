package com.bikeamovie.e_commerce.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bikeamovie.e_commerce.Model.NotifikasiModel;
import com.bikeamovie.e_commerce.R;

import java.util.ArrayList;


public class BestAdapter extends RecyclerView.Adapter<BestAdapter.NotifikasiViewHolder>{
    private Context context;
    private ArrayList<NotifikasiModel> notifikasiModelArrayList;

    public BestAdapter(Context context, ArrayList<NotifikasiModel> notifikasiModelArrayList) {
        this.context = context;
        this.notifikasiModelArrayList = notifikasiModelArrayList;
    }

    @NonNull
    @Override
    public NotifikasiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_content_notifikasi,parent,false);
        return new NotifikasiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotifikasiViewHolder holder, final int position) {
        NotifikasiModel model = notifikasiModelArrayList.get(position);

        holder.rv_notifikasi_tipe.setText(model.getTipe_notifikasi());
        holder.rv_notifikasi_date.setText(model.getDate());
        holder.rv_notifikasi_time.setText(model.getTime());
        holder.rv_notifikasi_point.setText(model.getJumlah_poin()+"");

        holder.cardview_notifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Intent intent = new Intent(context, DetailNotifikasiActivity.class);
                //   intent.addFlags(FLAG_ACTIVITY_NEW_TASK);
//                context.startActivity(intent);
//                Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return notifikasiModelArrayList.size();
    }

    public class NotifikasiViewHolder extends RecyclerView.ViewHolder{
        CardView cardview_notifikasi;
        TextView rv_notifikasi_tipe, rv_notifikasi_date, rv_notifikasi_time, rv_notifikasi_point;
        public NotifikasiViewHolder(@NonNull View itemView) {
            super(itemView);
            cardview_notifikasi = itemView.findViewById(R.id.card_barang);
            rv_notifikasi_tipe = itemView.findViewById(R.id.nama_barang);
            rv_notifikasi_date = itemView.findViewById(R.id.rv_rating);
            rv_notifikasi_time = itemView.findViewById(R.id.rv_ratin2);
            rv_notifikasi_point = itemView.findViewById(R.id.harga);
        }
    }
}