package com.tutorials.hp.jsonrecyclerviewmdetail.m_UI;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.jsonrecyclerviewmdetail.R;

/**
 * Created by Oclemy on 7/21/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView nameTxt, usernameTxt, emailTxt, deskripsi;
    ImageView images;
    ItemClickListener itemClickListener;

    public MyViewHolder(View itemView) {
        super(itemView);

        images = (ImageView) itemView.findViewById(R.id.images);
        nameTxt = (TextView) itemView.findViewById(R.id.nameTxt);
        usernameTxt = (TextView) itemView.findViewById(R.id.usernameTxt);
        emailTxt = (TextView) itemView.findViewById(R.id.emailTxt);
        deskripsi = (TextView) itemView.findViewById(R.id.descDetailTxt);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
