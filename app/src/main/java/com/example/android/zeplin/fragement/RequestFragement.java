package com.example.android.zeplin.fragement;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.zeplin.R;

import java.util.ArrayList;
import java.util.List;

import com.example.android.zeplin.modelDiscover.ModelRequest;
import com.example.android.zeplin.recyclerViewAdapter.RequestAdapter;


/**
 * Created by mark63 on 30/4/17.
 */

public class RequestFragement extends Fragment {
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container,
                             @Nullable final Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_request, container, false);
        inits(view);
        return view;
    }

    /**
     * creates list of data to be displayed in recycler view
     *
     * @return discoverList : List of data
     */
    private List<ModelRequest> getData() {
        List<ModelRequest> requestList = new ArrayList<>();

        requestList.add(new ModelRequest(getString(R.string.dummy_data_name),
                getString(R.string.dummy_data_address),
                getString(R.string.dummy_data_text),
                getString(R.string.dummy_data_rating),
                Float.parseFloat(getString(R.string.dummy_data_rating))));
        requestList.add(new ModelRequest(getString(R.string.dummy_data_name),
                getString(R.string.dummy_data_address),
                getString(R.string.dummy_data_text),
                getString(R.string.dummy_data_rating),
                Float.parseFloat(getString(R.string.dummy_data_rating))));
        requestList.add(new ModelRequest(getString(R.string.dummy_data_name),
                getString(R.string.dummy_data_address),
                getString(R.string.dummy_data_text),
                getString(R.string.dummy_data_rating),
                Float.parseFloat(getString(R.string.dummy_data_rating))));


        return requestList;
    }


    /**
     * Intializes the view and variables
     *
     * @param view : view returned
     */
    private void inits(final View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_request);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(new RequestAdapter(getData()));
        mRecyclerView.setHasFixedSize(true);
    }
}
