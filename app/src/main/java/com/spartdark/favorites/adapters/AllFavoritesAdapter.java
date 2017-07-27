package com.spartdark.favorites.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.spartdark.favorites.R;
import com.spartdark.favorites.dto.Products;
import com.spartdark.favorites.util.Constants;

import java.util.List;

/**
 * Created by spartdark on 24/07/17.
 */

public class AllFavoritesAdapter extends RecyclerView.Adapter<AllFavoritesAdapter.ViewHolder> implements View.OnClickListener {

    private List<Products> resultados;
    private View.OnClickListener listener;

    public AllFavoritesAdapter(List<Products> items) {
        this.resultados = items;
    }

    public void addAll(List<Products> lista) {
        resultados.addAll(lista);
        notifyDataSetChanged();
    }

    /*
        Permite limpiar todos los elementos del recycler
         */
    public void clear() {
        resultados.clear();
        notifyDataSetChanged();
    }


    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_card, parent, false);
        v.setOnClickListener(this);
        return new AllFavoritesAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.i("Adapter", resultados.get(position).getImage());
        ImageLoader.getInstance().displayImage(resultados.get(position).getImage(), holder.textViewTransactionName_atran, Constants.options, Constants.animator);


    }

    @Override
    public int getItemCount() {
        return resultados.size();
    }

    @Override
    public void onClick(View view) {
        if (listener != null)
            listener.onClick(view);
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView textViewTransactionName_atran;
        public ViewHolder(View rootView) {
            super(rootView);
            textViewTransactionName_atran = (ImageView) rootView.findViewById(R.id.imageViewProduct);

        }
    }
}
