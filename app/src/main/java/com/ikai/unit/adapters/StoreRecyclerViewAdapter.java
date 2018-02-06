package com.ikai.unit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ikai.unit.R;

/**
 *
 * @Description:  This class will adapt custom
 *              {@link android.support.v7.widget.RecyclerView}
 *              to adapt all elements of stores given in layout
 * @Author: Sonu Tiwari(ankorha@gmail.com)
 *
 * @StartingDate: 05/02/2018
 * @EndingDate:
 *
 * @Copyright UNiT (An IKAI company product)
 */

public class StoreRecyclerViewAdapter extends
        RecyclerView.Adapter<StoreRecyclerViewAdapter.ViewHolder>{
    private int[] imagesResourceId = new int[0];
    private String[] storesName = new String[0];
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public StoreRecyclerViewAdapter(Context context, String[] data, int[] id) {
        this.mInflater = LayoutInflater.from(context);
        this.storesName = data;
        this.imagesResourceId = id;
    }


    @Override
    public StoreRecyclerViewAdapter.ViewHolder
        onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.stores_grid_structure,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder
            (ViewHolder holder, int position) {
        String storeName = storesName[position];
        int imageResourceId = imagesResourceId[position];
        holder.storeCardTextView.setText(storeName);
        holder.storeCardImageView.setImageResource(imageResourceId);
    }
    @Override
    public int getItemCount() {
        return storesName.length;
    }



    /**
     * This class will hold all the views to show into RecyclerView
     * the layout file here: {stores_grid_structure.xml}
     */
    public class ViewHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener{
        ImageView storeCardImageView;
        TextView storeCardTextView;
        ViewHolder(View itemView) {
            super(itemView);
            storeCardImageView = itemView.findViewById(R.id.shop_thumbnail);
            storeCardTextView = itemView.findViewById(R.id.info_text);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null)
                mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    public String getItem(int id) {
        return storesName[id];
    }

    // allows clicks events to be caught
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}