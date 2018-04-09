package demo.showcase.twitterfeed.network.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("extended_entities")
	private ExtendedEntities extendedEntities;

	@SerializedName("in_reply_to_status_id_str")
	private Object inReplyToStatusIdStr;

	@SerializedName("in_reply_to_status_id")
	private Object inReplyToStatusId;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("in_reply_to_user_id_str")
	private Object inReplyToUserIdStr;

	@SerializedName("source")
	private String source;

	@SerializedName("retweet_count")
	private int retweetCount;

	@SerializedName("retweeted")
	private boolean retweeted;

	@SerializedName("geo")
	private Object geo;

	@SerializedName("in_reply_to_screen_name")
	private Object inReplyToScreenName;

	@SerializedName("is_quote_status")
	private boolean isQuoteStatus;

	@SerializedName("full_text")
	private String fullText;

	@SerializedName("id_str")
	private String idStr;

	@SerializedName("in_reply_to_user_id")
	private Object inReplyToUserId;

	@SerializedName("favorite_count")
	private int favoriteCount;

	@SerializedName("id")
	private long id;

	@SerializedName("place")
	private Object place;

	@SerializedName("lang")
	private String lang;

	@SerializedName("favorited")
	private boolean favorited;

	@SerializedName("possibly_sensitive")
	private boolean possiblySensitive;

	@SerializedName("coordinates")
	private Object coordinates;

	@SerializedName("truncated")
	private boolean truncated;

	@SerializedName("entities")
	private Entities entities;

	@SerializedName("display_text_range")
	private List<Integer> displayTextRange;

	@SerializedName("contributors")
	private Object contributors;

	@SerializedName("user")
	private User user;

	public ExtendedEntities getExtendedEntities(){
		return extendedEntities;
	}

	public Object getInReplyToStatusIdStr(){
		return inReplyToStatusIdStr;
	}

	public Object getInReplyToStatusId(){
		return inReplyToStatusId;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public Object getInReplyToUserIdStr(){
		return inReplyToUserIdStr;
	}

	public String getSource(){
		return source;
	}

	public int getRetweetCount(){
		return retweetCount;
	}

	public boolean isRetweeted(){
		return retweeted;
	}

	public Object getGeo(){
		return geo;
	}

	public Object getInReplyToScreenName(){
		return inReplyToScreenName;
	}

	public boolean isIsQuoteStatus(){
		return isQuoteStatus;
	}

	public String getFullText(){
		return fullText;
	}

	public String getIdStr(){
		return idStr;
	}

	public Object getInReplyToUserId(){
		return inReplyToUserId;
	}

	public int getFavoriteCount(){
		return favoriteCount;
	}

	public long getId(){
		return id;
	}

	public Object getPlace(){
		return place;
	}

	public String getLang(){
		return lang;
	}

	public boolean isFavorited(){
		return favorited;
	}

	public boolean isPossiblySensitive(){
		return possiblySensitive;
	}

	public Object getCoordinates(){
		return coordinates;
	}

	public boolean isTruncated(){
		return truncated;
	}

	public Entities getEntities(){
		return entities;
	}

	public List<Integer> getDisplayTextRange(){
		return displayTextRange;
	}

	public Object getContributors(){
		return contributors;
	}

	public User getUser(){
		return user;
	}
}