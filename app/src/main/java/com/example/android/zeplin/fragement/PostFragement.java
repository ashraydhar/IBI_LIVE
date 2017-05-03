package com.example.android.zeplin.fragement;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.android.zeplin.R;
import com.example.android.zeplin.modelDiscover.ModelDiscover;
import com.example.android.zeplin.recyclerViewAdapter.DiscoverAdapter;

import java.util.ArrayList;

/**
 * Created by mark63 on 30/4/17.
 */

public class PostFragement extends Fragment {

    private ArrayList<ModelDiscover> modelDiscoverArrayList = new ArrayList<ModelDiscover>();
    private RecyclerView recyclerView;
    private int flag = 0;
    private PostFragement frag;

    public PostFragement newInstance(int val) {

        frag = new PostFragement();
        Bundle b = new Bundle();
        b.putInt("POST_MODE", val);

        frag.setArguments(b);

        return frag;
    }
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.recycle_view_discover, container, false);


        if (flag == 0) {
            ModelDiscover modelClass0 = new ModelDiscover(R.drawable.goa, "G O A");
            modelDiscoverArrayList.add(modelClass0);


            ModelDiscover modelClass1 = new ModelDiscover(R.drawable.goa, "G O A");
            modelDiscoverArrayList.add(modelClass1);


            ModelDiscover modelClass2 = new ModelDiscover(R.drawable.goa, "G O A");
            modelDiscoverArrayList.add(modelClass2);

            flag = 1;
        }
        DiscoverAdapter discoverAdapter = new DiscoverAdapter(modelDiscoverArrayList, getArguments().getInt("POST_MODE"));
        recyclerView = (RecyclerView) view.findViewById(R.id.rvItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(discoverAdapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }
}

