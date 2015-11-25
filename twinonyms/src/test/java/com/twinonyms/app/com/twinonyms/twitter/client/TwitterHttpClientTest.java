package com.twinonyms.app.com.twinonyms.twitter.client;

import org.junit.Before;
import org.junit.Test;

public class TwitterHttpClientTest {
    private TwitterHttpClient twitterHttpClient;

    @Before
    public void setUp() throws Exception {
        twitterHttpClient = new TwitterHttpClient();
    }

    @Test
    public void checks_connectivity() {
        twitterHttpClient.test();
    }

}