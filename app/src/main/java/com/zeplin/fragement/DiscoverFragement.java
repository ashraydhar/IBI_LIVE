package com.zeplin.fragement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zeplin.R;
import com.zeplin.modelDiscover.ModelDiscover;
import com.zeplin.recyclerViewAdapter.DiscoverAdapter;

import java.util.ArrayList;

/**
 * Created by SherDil on 28/4/17.
 */

public class DiscoverFragement extends Fragment {
    private ArrayList<ModelDiscover> modelDiscoverArrayList = new ArrayList<ModelDiscover>();
    private RecyclerView recyclerView;
    private int flag = 0;
    private DiscoverFragement frag;


    public DiscoverFragement newInstance(int val) {

        frag = new DiscoverFragement();
        Bundle b = new Bundle();
        b.putInt("DISCOVER_MODE", val);

        frag.setArguments(b);

        return frag;
    }


    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.recycle_view_discover, container, false);

        if (flag == 0) {
            ModelDiscover modelClass0 = new ModelDiscover(R.drawable.taj_mahal, "Taj Mahal incorporates and expands on design traditions of Persian and earlier Mughal architecture");
            modelDiscoverArrayList.add(modelClass0);


            ModelDiscover modelClass1 = new ModelDiscover(R.drawable.taj_mahal, "Taj Mahal incorporates and expands on design traditions of Persian and earlier Mughal architecture");
            modelDiscoverArrayList.add(modelClass1);


            ModelDiscover modelClass2 = new ModelDiscover(R.drawable.taj_mahal, "Taj Mahal incorporates and expands on design traditions of Persian and earlier Mughal architecture");
            modelDiscoverArrayList.add(modelClass2);


            flag = 1;
        }
        DiscoverAdapter discoverAdapter = new DiscoverAdapter(modelDiscoverArrayList, getArguments().getInt("DEFAULT_MODE"));
        recyclerView = (RecyclerView) view.findViewById(R.id.rvItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(discoverAdapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }
}
