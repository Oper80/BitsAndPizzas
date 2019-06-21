package com.example.bitsandpizzas;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.content.ContextCompat;

public class PastaDetailActivity extends AppCompatActivity {

    public static final String EXTRA_PASTA_ID = "pastaId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int pastaId = getIntent().getExtras().getInt(EXTRA_PASTA_ID);
        String pastaText = Pasta.pastas[pastaId].getName();
        TextView textView = findViewById(R.id.pasta_text);
        textView.setText(pastaText);
        int pastaImage = Pasta.pastas[pastaId].getImageResourceId();
        ImageView imageView = findViewById(R.id.pasta_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,pastaImage));
        imageView.setContentDescription(pastaText);
    }
}
