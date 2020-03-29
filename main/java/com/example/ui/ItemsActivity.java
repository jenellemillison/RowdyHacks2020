package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.FileNotFoundException;

/*public ItemsActivity(String item)
    {
        itemChosen = item;
    }*/

public class ItemsActivity extends AppCompatActivity {
    private Button itemClicked;
    private String itemChosen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        String itemChosen = getIntent().getStringExtra("CHOSEN_ITEM");
        TextView textEdit = (TextView) findViewById(R.id.itemName);
        textEdit.append(itemChosen);

        try {
            getStock(itemChosen);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Button backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openPreviousPage();
            }
    });
}
    public void openPreviousPage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void getStock(String itemName) throws FileNotFoundException {
        checkStock check = new checkStock();
        String stockNum = check.inventoryCheck(itemName);
        /*String inStock = Integer.toString(stockNum);*/
        TextView textEd = (TextView) findViewById(R.id.stocked);
        textEd.append(stockNum);
    }
}
