package com.bussolalabs.jokes.utility;

import com.bussolalabs.jokes.BuildConfig;

/**
 * Created by alessio on 26/11/16.
 */

public class CommonConstants {

    public static final boolean ENVIRONMENT_SVIL = true;

    public static final String URL_ENDPOINT_SVIL = "http://10.0.2.2:8080/_ah/api/";
    public static final String URL_ENDPOINT_PROD = "https://#version#"+ BuildConfig.ENDPOINT_MODULE_NAME+"-dot-"+ BuildConfig.ENDPOINT_APP_NAME+".appspot.com/_ah/api/";

}
