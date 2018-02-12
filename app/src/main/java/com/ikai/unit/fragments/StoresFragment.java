package com.ikai.unit.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ikai.unit.R;
import com.ikai.unit.adapters.StoreRecyclerViewAdapter;
import com.ikai.unit.dataModels.StoreDataModel;

import java.util.List;

/**
 * @Description:  This fragment is child fragment of
 *               {@link HomeFragment}
 *              layout file should be looks like our design mock-up
 * @Author:
 *
 * @StartingDate:
 * @EndingDate:
 *
 * @Copyright UNiT (An IKAI company product)
 *
 */
public class StoresFragment extends Fragment implements
        StoreRecyclerViewAdapter.ItemClickListener {

    StoreRecyclerViewAdapter adapter;
    List<StoreDataModel> storeDataModelList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

                // Inflate the layout for this fragment
        storeDataModelList.add(new StoreDataModel("unit", "abc", false));
        RecyclerView recyclerView = new RecyclerView(getContext());
        int numOfColumns = 3;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), numOfColumns));
        adapter = new StoreRecyclerViewAdapter(this.getContext(),storeDataModelList );
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        return inflater.inflate(R.layout.fragment_stores, container, false);
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}
