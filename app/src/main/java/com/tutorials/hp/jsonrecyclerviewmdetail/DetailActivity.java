package com.tutorials.hp.jsonrecyclerviewmdetail;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    TextView nameTxt, emailTxt, usernameTxt, deskirpsi;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nameTxt = (TextView) findViewById(R.id.nameDetailTxt);
        emailTxt = (TextView) findViewById(R.id.emailDetailTxt);
        usernameTxt = (TextView) findViewById(R.id.usernameDetailTxt);
        deskirpsi = (TextView) findViewById(R.id.descDetailTxt);
        img = (ImageView) findViewById(R.id.images);

        //GET INTENT
        Intent i = this.getIntent();

        //RECEIVE DATA
        String images = i.getExtras().getString("IMAGES_KEY");
        String name = i.getExtras().getString("NAME_KEY");
        String email = i.getExtras().getString("EMAIL_KEY");
        String username = i.getExtras().getString("USERNAME_KEY");
        String desc = i.getExtras().getString("DESC_KEY");

        //BIND DATA
        img.setImageURI(Uri.parse(images));
        nameTxt.setText(name);
        emailTxt.setText(email);
        usernameTxt.setText(username);
        deskirpsi.setText(desc);

        Picasso.with(DetailActivity.this)
                .load(images)
                .resize(256, 256)                     // optional
                .into(img);

    }
}
