package com.example.giscorona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
        TextView datanama,datapasien,datatelpn;
        Button btncall;
        ImageView datagambar;
        public static String id,nama,telpn,gambar,pasien;
        public static Double latitude,longitude;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.tv_nama);
        datapasien=findViewById(R.id.tv_pasien);
        datatelpn=findViewById(R.id.tv_tel);
        btncall=findViewById(R.id.btn_call);
        datagambar=findViewById(R.id.img_data);

       datanama.setText(nama);
       datapasien.setText(pasien);
       datatelpn.setText(telpn);
       Picasso.get().load(gambar).into(datagambar);

        btncall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent call =new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+telpn));
        startActivity(call);
}
}
