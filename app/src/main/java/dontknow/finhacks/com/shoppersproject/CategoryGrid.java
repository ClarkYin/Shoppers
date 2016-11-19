package dontknow.finhacks.com.shoppersproject;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class CategoryGrid extends AppCompatActivity {
    ImageButton clothingButton;
    ImageButton electronicsButton;
    ImageButton gamesButton;
    ImageButton restaurantsButton;
    ImageButton homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_grid);

        //Edit onClick function to program logic for button being pressed
        clothingButton = (ImageButton)findViewById(R.id.clothingButton);
        clothingButton.setOnClickListener((new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "You Clicked Clothing", Toast.LENGTH_LONG).show();
            }
        }));

    }

}
