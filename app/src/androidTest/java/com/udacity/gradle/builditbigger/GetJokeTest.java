package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

public class GetJokeTest extends AndroidTestCase {

    private static final String LOG_TAG = "GetJokeTest";

    @SuppressWarnings("unchecked")
    public void test() {
        Log.v(LOG_TAG, "Running");
        MyAsyncTask jokeAsynctask = new MyAsyncTask(getContext());
        jokeAsynctask.execute();
        String joke = null;
        try {
            joke = jokeAsynctask.get();
            Log.d(LOG_TAG, "Retrieved joke: " + joke);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(joke);
    }

}
