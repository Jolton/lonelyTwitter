package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by chris on 2017-09-12.
 */

public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;

    private ArrayList<Mood> listOfMoods = new ArrayList<Mood>();



    public Tweet(String message) {
        this.message = message;
        this.date = new Date();

    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }


    public abstract Boolean isImportent();


    public ArrayList<Mood> getListOfMoods() {
        return listOfMoods;
    }

    public void setListOfMoods(ArrayList<Mood> listOfMoods) {
        this.listOfMoods = listOfMoods;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
