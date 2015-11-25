package com.twinonyms.app.com.twinonyms.twitter.client;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterConfigurator {

    /**
     * This method returns a {@link Twitter} Instance. It is needed to declare with System/Env vars:
     * <br />- consumerKey
     * <br />- consumerSecret
     * <br />- accessToken
     * <br />- accessTokenSecret
     */
    public Twitter getTwitterInstance() {
        // TODO: This method creates an instance every time is called, it should be created only once
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        TwitterFactory tf = new TwitterFactory(cb.build());
        return tf.getInstance();
    }
}
