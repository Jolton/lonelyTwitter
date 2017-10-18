package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetAcitivty extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet_acitivty);

        TextView tweetNameView = (TextView) findViewById(R.id.tweetNameView);


        Intent intent = getIntent();

        Tweet tweet = (Tweet) intent.getSerializableExtra("Tweet");

        tweetNameView.setText(tweet.getMessage());


    }
}
