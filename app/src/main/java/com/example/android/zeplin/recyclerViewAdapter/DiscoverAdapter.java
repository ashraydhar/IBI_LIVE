package com.example.android.zeplin.recyclerViewAdapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.example.android.zeplin.AppConstants;
import com.example.android.zeplin.R;
import com.example.android.zeplin.modelDiscover.ModelDiscover;

import java.util.ArrayList;

/**
 * Created by mark63 on 29/4/17.
 */

public class DiscoverAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements AppConstants{
    private ArrayList<ModelDiscover> modelDiscoverArrayList;
    private static int MODE = -1;
    private ImageView imageView;
    private TextView tvTitle;

    /**
     * @param modelDiscoverArrayList array list is created
     */
    public DiscoverAdapter(final ArrayList<ModelDiscover> modelDiscoverArrayList,int mode) {
        this.modelDiscoverArrayList = modelDiscoverArrayList;
        this.MODE = mode;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_discover, parent, false);
        ViewHolder viewHolder = new ViewHolder(view,MODE);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        ModelDiscover objdiscover = modelDiscoverArrayList.get(position);

        ImageView imgParis = imageView;
        imgParis.setImageResource(objdiscover.getImg());

        TextView tvTitle1 = tvTitle;
        tvTitle1.setText(objdiscover.getText());

    }

    @Override
    public int getItemCount() {
        return modelDiscoverArrayList.size();
    }

    /**
     * viewHOlder class is created here
     */

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cvDiscover;

        /**
         * @param itemView pass values
         */
        public ViewHolder(final View itemView, int val) {
            super(itemView);
            cvDiscover = (CardView) itemView.findViewById(R.id.cvParis);
            imageView = (ImageView) itemView.findViewById(R.id.imgTaj);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);


            if(val == DEFAULT_MODE) {

                ImageView visible2 = (ImageView) itemView.findViewById(R.id.visible2);
                visible2.setVisibility(View.GONE);
                ImageView visible3 = (ImageView) itemView.findViewById(R.id.visible3);
                visible3.setVisibility(View.GONE);

            }

            else if(val == POST_MODE){

                ImageView invisible1 = (ImageView) itemView.findViewById(R.id.invisible1);
                invisible1.setVisibility(View.INVISIBLE);
                LinearLayout invisible2 = (LinearLayout) itemView.findViewById(R.id.invisible2);
                invisible2.setVisibility(View.INVISIBLE);
                ImageView invisible3_1 = (ImageView) itemView.findViewById(R.id.invisible3_1);
                invisible3_1.setVisibility(View.INVISIBLE);
                TextView invisible3_2 = (TextView) itemView.findViewById(R.id.invisible3_2);
                invisible3_2.setVisibility(View.INVISIBLE);
                TextView invisible4 = (TextView) itemView.findViewById(R.id.invisible4);
                invisible4.setVisibility(View.INVISIBLE);
                Switch visible1 = (Switch) itemView.findViewById(R.id.visible1);
                visible1.setVisibility(View.VISIBLE);
                ImageView visible2 = (ImageView) itemView.findViewById(R.id.visible2);
                visible2.setVisibility(View.VISIBLE);
                ImageView visible3 = (ImageView) itemView.findViewById(R.id.visible3);
                visible3.setVisibility(View.VISIBLE);

            }



        }







    }
}
