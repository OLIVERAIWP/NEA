package twitterposter;

import java.util.List;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterPoster {

    public static void main(String[] args) throws TwitterException {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("Y6PwkfpkDYzIl3tdQaIj76Dk3")
                .setOAuthConsumerSecret("kvVXOiNE0I7CpoQecbFbntqLST0Zs5Tna035pUER6cE7VY3NVL")
                .setOAuthAccessToken("1061647053967777797-ndDIoJPYY3C9jqubPUmiTDxFnYkfN9")
                .setOAuthAccessTokenSecret("mzF7ojbjPi6m4bEhxnj60OnmaHinr2Z9yfi4Jx2UOenXZ");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        twitter.updateStatus("Hello World!");

        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        statuses.forEach((status) -> {
            System.out.println(status.getUser().getName() + ":"
                    + status.getText());
        });
    }
}
    