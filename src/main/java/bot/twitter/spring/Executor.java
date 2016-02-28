package bot.twitter.spring;

import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

import bot.twitter.spring.dto.AuthInfo;
import bot.twitter.spring.factory.AuthInfoFactory;

public class Executor {

	public static void main(String[] args) {
		AuthInfo info = AuthInfoFactory.getAuthInfo();
		Twitter twitter = new TwitterTemplate(info.getConsumerKey(),
				info.getConsumerSecret(), info.getAccessToken(),
				info.getAccessTokenSecret());
		twitter.timelineOperations().updateStatus("Hello,Twitter!");
		System.out.print("done");
	}

}
