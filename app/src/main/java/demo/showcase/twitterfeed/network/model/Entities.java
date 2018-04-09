package demo.showcase.twitterfeed.network.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Entities{

	@SerializedName("urls")
	private List<UrlsItem> urls;

	@SerializedName("hashtags")
	private List<HashtagsItem> hashtags;

	@SerializedName("media")
	private List<MediaItem> media;

	@SerializedName("user_mentions")
	private List<Object> userMentions;

	@SerializedName("symbols")
	private List<Object> symbols;

	public List<UrlsItem> getUrls(){
		return urls;
	}

	public List<HashtagsItem> getHashtags(){
		return hashtags;
	}

	public List<MediaItem> getMedia(){
		return media;
	}

	public List<Object> getUserMentions(){
		return userMentions;
	}

	public List<Object> getSymbols(){
		return symbols;
	}
}