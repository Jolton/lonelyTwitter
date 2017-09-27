/*
 * Copyright (c) 2017 Team X CMPUT 301. University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the Code of Student Behavior at University of Alberta.
 * You may find a copy of this liscence in this project, otherwise contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by chris on 2017-09-12.
 */

/**
 * Represents a SadMood.
 *
 * @author Chris
 * @version 1.0
 * @see HappyMood
 * @see Mood
 *
 */
public class SadMood extends Mood {

    /**
     *
     * @return the string representation of a SadMood
     */
    public String toString() {
        return "Sad Mood{" +
                "date=" + getDate() +
                '}';

    }
}