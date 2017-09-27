/*
 * Copyright (c) 2017 Team X CMPUT 301. University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You may find a copy of this liscence in this project, otherwise contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by chris on 2017-09-12.
 */

/**
 * Represents a Mood.
 *
 * @author Chris
 * @version 1.0
 * @see SadMood
 * @see HappyMood
 *
 */
public abstract class Mood {

    private Date date;

    /**
     * constructor for Mood
     * uses current date
     */
    public Mood() {
        date = new Date();
    }

    /**
     * constructor for Mood
     *
     * @param date the date for the Mood
     */
    public Mood(Date date) {
        this.date = date;
    }

    /**
     *
     * @return the date of the Mood
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date sets the date of the Mood
     */
    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public abstract String toString();



}
