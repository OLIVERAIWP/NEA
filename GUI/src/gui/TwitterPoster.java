package gui;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author oliverai
 */
public class TwitterPoster {

    public static void main(String[] args) throws TwitterException {

        TwitterFactory tf = new TwitterFactory();
        Twitter twitter = tf.getInstance();

        twitter.updateStatus("Hello World!");
    }

}