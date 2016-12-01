package com.bussolalabs.jokes.server;

import com.bussola.udacity.builditbigger.backend.myJokeBeanApi.MyJokeBeanApi;
import com.bussola.udacity.builditbigger.backend.myJokeBeanApi.model.MyJokeBean;
import com.bussolalabs.jokes.utility.Utility;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

/**
 * Created by alessio on 26/11/16.
 */

public class MyJokeEndpoint {

    private MyJokeBeanApi myJokeBeanApiServices = null;

    public MyJokeEndpoint(String appName) {
        MyJokeBeanApi.Builder builder = new MyJokeBeanApi.Builder(AndroidHttp.newCompatibleTransport(),
                new AndroidJsonFactory(), null)
                .setRootUrl(Utility.endpointURL(1))
                .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                    @Override
                    public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                        abstractGoogleClientRequest.setDisableGZipContent(false);
                    }
                });
        builder = builder.setApplicationName(appName);
        myJokeBeanApiServices = builder.build();
    }

    public String retrieveJoke() throws IOException {
        MyJokeBean myJokeBeanApi = myJokeBeanApiServices.getMyJokeBean().execute();
        return myJokeBeanApi.getJoke();
    }

}
