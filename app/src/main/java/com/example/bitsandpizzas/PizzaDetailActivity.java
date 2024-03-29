package com.example.bitsandpizzas;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.content.ContextCompat;

public class PizzaDetailActivity extends AppCompatActivity {

    public static final String EXTRA_PIZZA_ID = "pizzaId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        int pizzaId = getIntent().getExtras().getInt(EXTRA_PIZZA_ID);
        String pizzaText = Pizza.pizzas[pizzaId].getName();
        TextView textView = findViewById(R.id.pizza_text);
        textView.setText(pizzaText);
        int pizzaImage = Pizza.pizzas[pizzaId].getImageResourceId();
        ImageView imageView = findViewById(R.id.pizza_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this,pizzaImage));
        imageView.setContentDescription(pizzaText);
    }
}
