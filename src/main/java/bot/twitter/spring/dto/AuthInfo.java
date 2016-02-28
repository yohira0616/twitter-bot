package bot.twitter.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthInfo {
	private String consumerKey = "";
	private String consumerSecret = "";
	private String accessToken = "";
	private String accessTokenSecret = "";

}
