package com.twinonyms.app.com.twinonyms.twitter.client;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class TwitterHttpClient {
    public void test() {
        TwitterConfigurator twitterConfigurator = new TwitterConfigurator();
        Twitter twitter = twitterConfigurator.getTwitterInstance();

        try {
            Query query = new Query("#batman");
            QueryResult result;
            result = twitter.search(query);
            List<Status> tweets = result.getTweets();
            for (Status tweet : tweets) {
                System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
            }
        } catch (TwitterException te) {
            System.out.println(te.getMessage());
        }
    }
}