package com.bussolalabs.jokes.utility;

/**
 * Created by alessio on 26/11/16.
 */

public class Utility {

    public static String endpointURL () {
        return endpoint().replace("#version#", "");
    }

    public static String endpointURL (int version) {
        return endpoint().replace("#version#", version+"-dot-");
    }

    private static String endpoint() {
        return CommonConstants.ENVIRONMENT_SVIL ? CommonConstants.URL_ENDPOINT_SVIL : CommonConstants.URL_ENDPOINT_PROD;
    }

}
