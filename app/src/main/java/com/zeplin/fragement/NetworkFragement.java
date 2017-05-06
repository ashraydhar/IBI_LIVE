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
import com.zeplin.modelDiscover.ModelNetwork;
import com.zeplin.recyclerViewAdapter.NetworkAdapter;

import java.util.ArrayList;

/**
 * Created by SherDil on 30/4/17.
 */

public class NetworkFragement extends Fragment {
    private ArrayList<ModelNetwork> networks;
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_networks, container, false);
        networks = new ArrayList<ModelNetwork>();
        networks.add(new ModelNetwork("EVelyn"));
        networks.add(new ModelNetwork("EVelyn"));
        networks.add(new ModelNetwork("EVelyn"));
        networks.add(new ModelNetwork("EVelyn"));
        networks.add(new ModelNetwork("EVelyn"));
        networks.add(new ModelNetwork("EVelyn"));
        NetworkAdapter recyclerViewAdapter = new NetworkAdapter(networks, getContext());
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_network);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;


    }
}
