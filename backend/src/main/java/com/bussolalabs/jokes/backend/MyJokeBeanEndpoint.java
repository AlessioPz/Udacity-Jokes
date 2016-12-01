package com.bussolalabs.jokes.backend;

import com.bussolalabs.jokes.jlib.MyJoke;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.logging.Logger;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myJokeBeanApi",
        version = "v1",
        resource = "myJokeBean",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.udacity.bussola.com",
                ownerName = "backend.builditbigger.udacity.bussola.com",
                packagePath = ""
        )
)
public class MyJokeBeanEndpoint {

    private static final Logger logger = Logger.getLogger(MyJokeBeanEndpoint.class.getName());

    /**
     * This method gets the <code>MyJokeBean</code> object associated with the specified <code>id</code>.
     *
     * @return The <code>MyJokeBean</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getMyJokeBean")
    public MyJokeBean getMyJokeBean() {
        // TODO: Implement this function
        logger.info("Calling getMyJokeBean method");
        MyJokeBean myJokeBean = new MyJokeBean();
        myJokeBean.setJoke(MyJoke.makeJoke());
        return myJokeBean;
    }

    /**
     * This inserts a new <code>MyJokeBean</code> object.
     *
     * @param myJokeBean The object to be added.
     * @return The object to be added.
     *
    @ApiMethod(name = "insertMyJokeBean")
    public MyJokeBean insertMyJokeBean(MyJokeBean myJokeBean) {
        // TODO: Implement this function
        logger.info("Calling insertMyJokeBean method");
        return myJokeBean;
    }
    */
}