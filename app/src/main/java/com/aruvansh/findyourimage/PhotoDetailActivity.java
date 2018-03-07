package com.aruvansh.findyourimage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PhotoDetailActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_detail);

        activateToolbar(true);
        Intent intent=getIntent();   //fetching intent from the click that brought us here
        Photo photo=(Photo)intent.getSerializableExtra(PHOTO_TRANSFER);// to get the photo that is clicked upon
        if(photo!=null)
        {
            //extracting the information about the clicked image
            TextView photoTitle=(TextView)findViewById(R.id.photo_title);
            photoTitle.setText("TITLE------->"+photo.getTitle());
            TextView photoTags=(TextView)findViewById(R.id.photo_tags);
             photoTags.setText("tags are----------->  "+ photo.getTags());
            TextView photoAuthor=(TextView)findViewById(R.id.photo_author);
             photoAuthor.setText("the author is------->  "+ photo.getAuthor());
            ImageView photoImage=(ImageView)findViewById(R.id.photo_image);
            Picasso.with(this).load(photo.getMlink())
                    .error(R.drawable.placeholder)
                    .placeholder(R.drawable.placeholder)
                    .into(photoImage);



        }


    }

}




