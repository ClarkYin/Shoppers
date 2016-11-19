package dontknow.finhacks.com.shoppersproject;

import android.graphics.Color;
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

    //Change colors here for when button pressed
    public final int COLOR_SELECTED = Color.RED;
    public final int COLOR_UNSELECTED = Color.BLUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_grid);

        //Edit onClick function to program logic for button being pressed
        clothingButton = (ImageButton)findViewById(R.id.clothingButton);
        clothingButton.setOnClickListener((new View.OnClickListener()
        {
           boolean isClothingClicked = false;
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "You Clicked Clothing", Toast.LENGTH_LONG).show();
                if (isClothingClicked == false)
                {
                    //Change color after pressed when not previously selected
                    clothingButton.setBackgroundColor(COLOR_SELECTED);
                    isClothingClicked = true;
                    System.out.println("TTT");
                }
                else
                {
                    clothingButton.setBackgroundColor(COLOR_UNSELECTED);
                    isClothingClicked = false;
                    System.out.println("HHH");
                }


            }
        }));

    }

}
