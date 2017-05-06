package com.zeplin.recyclerViewAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zeplin.R;
import com.zeplin.modelDiscover.ModelNetwork;

import java.util.ArrayList;

/**
 * Created by SherDil on 02-May-17.
 */

public class NetworkAdapter extends RecyclerView.Adapter<NetworkAdapter.ViewHolder> {
    private ArrayList<ModelNetwork> networks;


    public NetworkAdapter(ArrayList<ModelNetwork> networks, Context context) {
        this.networks = networks;
        this.context = context;
    }

    private Context context;

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        //context = parent.getContext();
        View itemView;
        itemView = LayoutInflater.from(context).inflate(R.layout.recycle_view_networks, parent, false);
        //ViewHolder viewHolder = new ViewHolder(itemView);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        ViewHolder holder = (ViewHolder) viewHolder;
        ModelNetwork currentLocation = networks.get(position);
        holder.name.setText(currentLocation.getName());
    }


    /**
     * @return size
     */
    @Override
    public int getItemCount() {

        return networks.size();
    }

    /**
     * abc
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;

        /**
         * @param itemView item view of recycler view
         */

        public ViewHolder(final View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.networks_user_name);


        }
    }
}