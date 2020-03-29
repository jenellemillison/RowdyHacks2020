package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener(this);
        Button itemClicked1 = (Button) findViewById(R.id.almond_button);
        itemClicked1.setOnClickListener(this);
        Button itemClicked2 = (Button) findViewById(R.id.egg_button);
        itemClicked2.setOnClickListener(this);
        Button itemClicked3 = (Button) findViewById(R.id.tp_button);
        itemClicked3.setOnClickListener(this);
        Button itemClicked4 = (Button) findViewById(R.id.tomato_button);
        itemClicked4.setOnClickListener(this);
        Button itemClicked5 = (Button) findViewById(R.id.milk_button);
        itemClicked5.setOnClickListener(this);
        Button itemClicked6 = (Button) findViewById(R.id.cucumber_button);
        itemClicked6.setOnClickListener(this);
        Button itemClicked7= (Button) findViewById(R.id.lettuce_button);
        itemClicked7.setOnClickListener(this);
        Button itemClicked8 = (Button) findViewById(R.id.liquid_button);
        itemClicked8.setOnClickListener(this);
        Button itemClicked9 = (Button) findViewById(R.id.solid_button);
        itemClicked9.setOnClickListener(this);
        Button itemClicked10 = (Button) findViewById(R.id.apple_button);
        itemClicked10.setOnClickListener(this);
        Button itemClicked11= (Button) findViewById(R.id.banana_button);
        itemClicked11.setOnClickListener(this);
        Button itemClicked12 = (Button) findViewById(R.id.orange_button);
        itemClicked12.setOnClickListener(this);
        Button itemClicked13 = (Button) findViewById(R.id.laundry_button);
        itemClicked13.setOnClickListener(this);
    }
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ItemsActivity.class);
                switch (v.getId()) {
                    case R.id.almond_button:
                       //ItemsActivity item1 = new ItemsActivity("almond");
                        intent.putExtra("CHOSEN_ITEM", "milk_almond");
                        break;
                    case R.id.egg_button:
                        //ItemsActivity item2 = new ItemsActivity("egg");
                        intent.putExtra("CHOSEN_ITEM", "eggs");
                        break;
                    case R.id.tp_button:
                        //ItemsActivity item3 = new ItemsActivity("tp");
                        intent.putExtra("CHOSEN_ITEM", "toilet_paper");
                        break;
                    case R.id.tomato_button:
                        //ItemsActivity item4 = new ItemsActivity("tomato");
                        intent.putExtra("CHOSEN_ITEM", "tomatoes");
                        break;
                    case R.id.milk_button:
                        //ItemsActivity item5 = new ItemsActivity("milk");
                        intent.putExtra("CHOSEN_ITEM", "milk_2%");
                        break;
                    case R.id.cucumber_button:
                        //ItemsActivity item6 = new ItemsActivity("cucumber");
                        intent.putExtra("CHOSEN_ITEM", "cucumbers");
                 //       openPage("LiquidActivity.class");
                        break;
                    case R.id.lettuce_button:
                        //ItemsActivity item7 = new ItemsActivity("lettuce");
                        intent.putExtra("CHOSEN_ITEM", "lettuce");
                 //       openPage("LettuceActivity.class");
                        break;
                    case R.id.liquid_button:
                        //ItemsActivity item8 = new ItemsActivity("liquid");
                        intent.putExtra("CHOSEN_ITEM", "soap_liquid");
                 //       openPage("LiquidActivity.class");
                        break;
                    case R.id.solid_button:
                        //ItemsActivity item9 = new ItemsActivity("solid");
                        intent.putExtra("CHOSEN_ITEM", "soap_solid");
                  //      openPage("SolidActivity.class");
                        break;
                    case R.id.apple_button:
                        //ItemsActivity item10 = new ItemsActivity("apple");
                        intent.putExtra("CHOSEN_ITEM", "apples");
                    //    openPage("AppleActivity.class");
                        break;
                    case R.id.banana_button:
                        //ItemsActivity item11 = new ItemsActivity("banana");
                        intent.putExtra("CHOSEN_ITEM", "bananas");
                    //    openPage("BananaActivity.class");
                        break;
                    case R.id.orange_button:
                        //ItemsActivity item12 = new ItemsActivity("orange");
                        intent.putExtra("CHOSEN_ITEM", "oranges");
                    //    openPage("OrangeActivity.class");
                        break;
                    case R.id.laundry_button:
                        //ItemsActivity item13 = new ItemsActivity("laundry");
                        intent.putExtra("CHOSEN_ITEM", "laundry_detergent");
                    //    openPage("LaundryActivity.class");
                        break;
                    case R.id.back:
                        openPreviousPage();
                        break;
                    default:
                        break;
                }
                if(!(v.getId() == R.id.back))
                {
                    startActivity(intent);
                }
               /*if(v.getId() == R.id.back)
                {
                    //openPreviousPage();
                }
                else {
                    StartActivity(intent);
                    //openPage("ItemsActivity.class");
                    }*/
    }

    public void openPreviousPage() {
        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
    }

    public void openPage(String className) {
        Intent intent = new Intent(this, ItemsActivity.class);
        startActivity(intent);
    }
}
