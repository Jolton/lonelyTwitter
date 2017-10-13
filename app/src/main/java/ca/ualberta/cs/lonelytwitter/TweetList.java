package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Christopher Walter on 2017-10-10.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) {

        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        }

        tweets.add(tweet);


    }

    public void deleteTweet(Tweet tweet) {

        tweets.remove(tweet);
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets() {

        ArrayList<Tweet> sortedTweets = new ArrayList<Tweet>(tweets);

        Collections.sort(sortedTweets, new Comparator<Tweet>() {
            public int compare(Tweet lhs, Tweet rhs) {
                return lhs.getDate().compareTo(rhs.getDate());
            }
        });

        return sortedTweets;
    }

    public int getCount() {
        return tweets.size();
    }
}
