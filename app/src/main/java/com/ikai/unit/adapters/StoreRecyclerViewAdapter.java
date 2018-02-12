package com.ikai.unit.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ikai.unit.R;
import com.ikai.unit.dataModels.StoreDataModel;

import java.util.List;

/**
 *
 * @Description:  This class will adapt custom
 *              {@link android.support.v7.widget.RecyclerView}
 *              to adapt all elements of stores given in layout
 *              {@link StoreRecyclerViewAdapter} is an
 *              {@link ArrayAdapter} that can provide the layout for each list
 *              based on a data source, which is a list of
 *              {@link com.ikai.unit.dataModels.StoreDataModel} objects.
 * @Author: Sonu Tiwari(ankorha@gmail.com)
 *
 * @StartingDate: 05/02/2018
 * @EndingDate:
 *
 * @Copyright UNiT (An IKAI company product)
 */

public class StoreRecyclerViewAdapter extends
        RecyclerView.Adapter<StoreRecyclerViewAdapter.ViewHolder>{
    private List<StoreDataModel> storeDataModels;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private Context context;

    /**
     * @param context
     * @param storeDataModels List of StoreDataModel Objects to show in recyclerview
     */
    public StoreRecyclerViewAdapter(Context context, List<StoreDataModel> storeDataModels){
        this.storeDataModels = storeDataModels;
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
        //super.onBindViewHolder(holder, position);
        StoreDataModel sdmInstance = storeDataModels.get(position);
        String storeName = sdmInstance.getStoreName();
        String thumbnailURL = sdmInstance.getStoreThumbnailImage();
        boolean favorite = sdmInstance.isFavoriteShop();
        holder.storeCardTextView.setText(storeName);
        ImageView imageView = holder.storeCardImageView;
        Glide.with(this.context)
                .load(thumbnailURL)
                .into(imageView);
    }
    @Override
    public int getItemCount() {
        return storeDataModels.size();
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
    public StoreDataModel getItem(int id) {
        return storeDataModels.get(id);
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