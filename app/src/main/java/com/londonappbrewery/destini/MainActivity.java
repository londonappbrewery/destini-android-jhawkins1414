package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button mTop;
    Button mBottom;
    int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStoryIndex = 1;

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById(R.id.storyTextView);
        mTop = findViewById(R.id.buttonTop);
        mBottom = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1 || mStoryIndex == 2)
                {
                    mStory.setText(R.string.T3_Story);
                    mTop.setText(R.string.T3_Ans1);
                    mBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else if(mStoryIndex == 3)
                {
                    mStory.setText(R.string.T6_End);
                    mStoryIndex = 6;
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                }
                else
                {
                    ;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1)
                {
                    mStory.setText(R.string.T2_Story);
                    mTop.setText(R.string.T2_Ans1);
                    mBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if(mStoryIndex == 2)
                {
                    mStory.setText(R.string.T4_End);
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                    mStoryIndex = 4;
                }
                else if(mStoryIndex == 3)
                {
                    mStory.setText(R.string.T5_End);
                    mTop.setVisibility(View.GONE);
                    mBottom.setVisibility(View.GONE);
                    mStoryIndex = 5;
                }
                else
                {
                    ;
                }
            }
        });

    }
}
