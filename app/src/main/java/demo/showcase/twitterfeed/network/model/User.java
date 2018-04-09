package demo.showcase.twitterfeed.network.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class User{

	@SerializedName("utc_offset")
	private int utcOffset;

	@SerializedName("friends_count")
	private int friendsCount;

	@SerializedName("profile_image_url_https")
	private String profileImageUrlHttps;

	@SerializedName("listed_count")
	private int listedCount;

	@SerializedName("profile_background_image_url")
	private String profileBackgroundImageUrl;

	@SerializedName("default_profile_image")
	private boolean defaultProfileImage;

	@SerializedName("favourites_count")
	private int favouritesCount;

	@SerializedName("description")
	private String description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("is_translator")
	private boolean isTranslator;

	@SerializedName("profile_background_image_url_https")
	private String profileBackgroundImageUrlHttps;

	@SerializedName("protected")
	private boolean jsonMemberProtected;

	@SerializedName("screen_name")
	private String screenName;

	@SerializedName("id_str")
	private String idStr;

	@SerializedName("profile_link_color")
	private String profileLinkColor;

	@SerializedName("is_translation_enabled")
	private boolean isTranslationEnabled;

	@SerializedName("translator_type")
	private String translatorType;

	@SerializedName("id")
	private long id;

	@SerializedName("geo_enabled")
	private boolean geoEnabled;

	@SerializedName("profile_background_color")
	private String profileBackgroundColor;

	@SerializedName("lang")
	private String lang;

	@SerializedName("has_extended_profile")
	private boolean hasExtendedProfile;

	@SerializedName("profile_sidebar_border_color")
	private String profileSidebarBorderColor;

	@SerializedName("profile_text_color")
	private String profileTextColor;

	@SerializedName("verified")
	private boolean verified;

	@SerializedName("profile_image_url")
	private String profileImageUrl;

	@SerializedName("time_zone")
	private String timeZone;

	@SerializedName("url")
	private String url;

	@SerializedName("contributors_enabled")
	private boolean contributorsEnabled;

	@SerializedName("profile_background_tile")
	private boolean profileBackgroundTile;

	@SerializedName("profile_banner_url")
	private String profileBannerUrl;

	@SerializedName("entities")
	private Entities entities;

	@SerializedName("statuses_count")
	private int statusesCount;

	@SerializedName("follow_request_sent")
	private Object followRequestSent;

	@SerializedName("followers_count")
	private int followersCount;

	@SerializedName("profile_use_background_image")
	private boolean profileUseBackgroundImage;

	@SerializedName("default_profile")
	private boolean defaultProfile;

	@SerializedName("following")
	private Object following;

	@SerializedName("name")
	private String name;

	@SerializedName("location")
	private String location;

	@SerializedName("profile_sidebar_fill_color")
	private String profileSidebarFillColor;

	@SerializedName("notifications")
	private Object notifications;

	public int getUtcOffset(){
		return utcOffset;
	}

	public int getFriendsCount(){
		return friendsCount;
	}

	public String getProfileImageUrlHttps(){
		return profileImageUrlHttps;
	}

	public int getListedCount(){
		return listedCount;
	}

	public String getProfileBackgroundImageUrl(){
		return profileBackgroundImageUrl;
	}

	public boolean isDefaultProfileImage(){
		return defaultProfileImage;
	}

	public int getFavouritesCount(){
		return favouritesCount;
	}

	public String getDescription(){
		return description;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public boolean isIsTranslator(){
		return isTranslator;
	}

	public String getProfileBackgroundImageUrlHttps(){
		return profileBackgroundImageUrlHttps;
	}

	public boolean isJsonMemberProtected(){
		return jsonMemberProtected;
	}

	public String getScreenName(){
		return screenName;
	}

	public String getIdStr(){
		return idStr;
	}

	public String getProfileLinkColor(){
		return profileLinkColor;
	}

	public boolean isIsTranslationEnabled(){
		return isTranslationEnabled;
	}

	public String getTranslatorType(){
		return translatorType;
	}

	public long getId(){
		return id;
	}

	public boolean isGeoEnabled(){
		return geoEnabled;
	}

	public String getProfileBackgroundColor(){
		return profileBackgroundColor;
	}

	public String getLang(){
		return lang;
	}

	public boolean isHasExtendedProfile(){
		return hasExtendedProfile;
	}

	public String getProfileSidebarBorderColor(){
		return profileSidebarBorderColor;
	}

	public String getProfileTextColor(){
		return profileTextColor;
	}

	public boolean isVerified(){
		return verified;
	}

	public String getProfileImageUrl(){
		return profileImageUrl;
	}

	public String getTimeZone(){
		return timeZone;
	}

	public String getUrl(){
		return url;
	}

	public boolean isContributorsEnabled(){
		return contributorsEnabled;
	}

	public boolean isProfileBackgroundTile(){
		return profileBackgroundTile;
	}

	public String getProfileBannerUrl(){
		return profileBannerUrl;
	}

	public Entities getEntities(){
		return entities;
	}

	public int getStatusesCount(){
		return statusesCount;
	}

	public Object getFollowRequestSent(){
		return followRequestSent;
	}

	public int getFollowersCount(){
		return followersCount;
	}

	public boolean isProfileUseBackgroundImage(){
		return profileUseBackgroundImage;
	}

	public boolean isDefaultProfile(){
		return defaultProfile;
	}

	public Object getFollowing(){
		return following;
	}

	public String getName(){
		return name;
	}

	public String getLocation(){
		return location;
	}

	public String getProfileSidebarFillColor(){
		return profileSidebarFillColor;
	}

	public Object getNotifications(){
		return notifications;
	}
}