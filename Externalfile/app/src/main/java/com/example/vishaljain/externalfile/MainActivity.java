package com.example.vishaljain.externalfile;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final int CAMERA_REQUEST=999;
    ImageView imageview, imageview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview=(ImageView)findViewById(R.id.imageView);
        imageview1 = findViewById(R.id.imageView1);

    }

    public void Clickpic(View view)
    {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,CAMERA_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CAMERA_REQUEST)
        {
            Bitmap bitmap = (Bitmap)data.getExtras().get("data");
            imageview.setImageBitmap(bitmap);

            Bitmap bitmap1 = (Bitmap)data.getExtras().get("data1");
            imageview1.setImageBitmap(bitmap1);

        }

//        else if (requestCode == CAMERA_REQUEST)
//        {
//            Bitmap bitmap = (Bitmap)data.getExtras().get("data1");
//            imageview1.setImageBitmap(bitmap);
//        }
    }

}
