package com.bussolalabs.jokes.server;

import android.test.AndroidTestCase;
import android.util.Log;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alessio on 01/12/16.
 */
public class MyJokeAsyncTaskTest extends AndroidTestCase {
    @Test
    public void doInBackground() throws Exception {
        MyJokeEndpoint myJokeEndpoint = new MyJokeEndpoint(mContext.getApplicationInfo().name);
        assertNotEquals("", myJokeEndpoint.retrieveJoke());
    }

}