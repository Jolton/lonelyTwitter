package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Christopher Walter on 2017-10-10.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my Tweet");

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my Tweet");

        tweets.addTweet(myTweet);
        tweets.deleteTweet(myTweet);

        assertFalse(tweets.hasTweet(myTweet));

    }

    public void testHasTweet() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my Tweet");

        assertFalse(tweets.hasTweet(myTweet));

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));

    }

    public void testGetTweet() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my Tweet");

        tweets.addTweet(myTweet);

        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), myTweet.getMessage());
        assertEquals(returnedTweet.getDate(), myTweet.getDate());

        assertEquals(tweets.getTweet(0), myTweet);
    }
}
