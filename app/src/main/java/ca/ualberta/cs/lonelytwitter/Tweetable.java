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
 * Represents a Tweetable
 *
 * @author Chris
 * @version 1.0
 *
 */
public interface Tweetable {

    String getMessage();
    Date getDate();

}
