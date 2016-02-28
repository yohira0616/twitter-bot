package bot.twitter.spring.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import bot.twitter.spring.dto.AuthInfo;

public class AuthInfoFactory {

	private AuthInfoFactory() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static AuthInfo getAuthInfo() {
		Properties props = new Properties();

		InputStream stream;
		try {
			stream = ClassLoader
					.getSystemResourceAsStream("application.properties");
			props.load(stream);
			stream.close();
			return new AuthInfo(props.getProperty("consumerKey"),
					props.getProperty("consumerSecret"),
					props.getProperty("accessToken"),
					props.getProperty("accessTokenSecret"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
