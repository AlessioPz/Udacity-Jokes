package com.bussolalabs.jokes.server;

import android.content.Context;
import android.os.AsyncTask;

import com.bussolalabs.jokes.R;

import java.io.IOException;

/**
 * Created by alessio on 26/11/16.
 */

public class MyJokeAsyncTask extends AsyncTask<Object, Void, Integer> {

    public interface OnTaskResultListener {
        void onTaskResult(String result, boolean success);
    }

    private OnTaskResultListener mListener;

    Context context;
    String joke;

    @Override
    protected Integer doInBackground(Object... objects) {
        context = (Context)objects[0];

        if (context instanceof OnTaskResultListener) {
            mListener = (OnTaskResultListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnTaskResultListener");
        }

        MyJokeEndpoint myJokeEndpoint = new MyJokeEndpoint(context.getApplicationInfo().name);
        try {
            joke = myJokeEndpoint.retrieveJoke();
            return 1;
        } catch (IOException e) {
            e.printStackTrace();
            joke = context.getString(R.string.msg_connection_error);
        }

        return 0;
    }

    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);

        if (mListener != null) {
            mListener.onTaskResult(joke, integer > 0);
        }

        mListener = null;

    }

}
