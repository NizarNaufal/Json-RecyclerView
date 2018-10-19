package com.tutorials.hp.jsonrecyclerviewmdetail;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoClient {

    public static void downloadImage(Context c, String url, ImageView img) {
        if (url != null && url.length() > 0) {
            Picasso.with(c).load(url).placeholder(R.mipmap.ic_launcher).into(img);

        } else {
            Picasso.with(c).load(R.mipmap.ic_launcher).into(img);
        }
    }
}