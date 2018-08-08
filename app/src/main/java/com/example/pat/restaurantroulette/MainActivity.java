package com.example.pat.restaurantroulette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button chooseRestaurantButton;
    TextView choice;
    List<String> restaurantList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chooseRestaurantButton = findViewById(R.id.chooseButton);
        chooseRestaurantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restaurantList.add("Bennys");
                restaurantList.add("SmellyCat");
                restaurantList.add("Boudreux's");
                restaurantList.add("Amelie's");
                restaurantList.add("Sabor");

                choice = findViewById(R.id.choice);
                choice.setText(restaurantList.get(new Random().nextInt(restaurantList.size())));echo "# restaurantRoulette" >> README.md
                git init
                git add README.md
                git commit -m "first commit"
                git remote add origin https://github.com/Pschuller22/restaurantRoulette.git
                git push -u origin master
            }
        });
    }
}
