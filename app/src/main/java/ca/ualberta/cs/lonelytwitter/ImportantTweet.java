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
 * Represents a ImportantTweet.
 *
 * @author Chris
 * @version 1.0
 * @see NormalTweet
 * @see Tweet
 *
 */
public class ImportantTweet extends Tweet {

    /**
     *
     * @param message the ImportantTweet message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     *
     * @param message the ImportantTweet message
     * @param date the ImportantTweet date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportent() {
        return Boolean.TRUE;
    }
}
