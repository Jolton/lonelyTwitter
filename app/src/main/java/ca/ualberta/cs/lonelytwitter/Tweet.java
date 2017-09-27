/*
 * Copyright (c) 2017 Team X CMPUT 301. University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You may find a copy of this liscence in this project, otherwise contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;



/**
 * Created by chris on 2017-09-12.
 */

/**
 * Represents a Tweet.
 *
 * @author Chris
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 *
 */
public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;

    private ArrayList<Mood> listOfMoods = new ArrayList<Mood>();


    /**
     *
     * @param message the message for the Tweet
     */
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();

    }

    /**
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     *
     * @return whether the tweet is important
     */
    public abstract Boolean isImportent();

    /**
     *
     * @return the list of Moods
     */
    public ArrayList<Mood> getListOfMoods() {
        return listOfMoods;
    }

    /**
     *
     * @param listOfMoods the list of Moods for the tweet
     */
    public void setListOfMoods(ArrayList<Mood> listOfMoods) {
        this.listOfMoods = listOfMoods;
    }

    /**
     *
     * @param message the tweets new message
     * @throws TweetTooLongException throws if the message is longer then 140 characters
     *
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     *
     * @return the tweets message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @return the tweets date
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date the date to set the tweet to
     */
    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
