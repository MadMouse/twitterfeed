package demo.showcase.twitterfeed.network.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class MediaItem{

	@SerializedName("display_url")
	private String displayUrl;

	@SerializedName("indices")
	private List<Integer> indices;

	@SerializedName("sizes")
	private Sizes sizes;

	@SerializedName("id_str")
	private String idStr;

	@SerializedName("expanded_url")
	private String expandedUrl;

	@SerializedName("media_url_https")
	private String mediaUrlHttps;

	@SerializedName("id")
	private long id;

	@SerializedName("type")
	private String type;

	@SerializedName("media_url")
	private String mediaUrl;

	@SerializedName("url")
	private String url;

	public String getDisplayUrl(){
		return displayUrl;
	}

	public List<Integer> getIndices(){
		return indices;
	}

	public Sizes getSizes(){
		return sizes;
	}

	public String getIdStr(){
		return idStr;
	}

	public String getExpandedUrl(){
		return expandedUrl;
	}

	public String getMediaUrlHttps(){
		return mediaUrlHttps;
	}

	public long getId(){
		return id;
	}

	public String getType(){
		return type;
	}

	public String getMediaUrl(){
		return mediaUrl;
	}

	public String getUrl(){
		return url;
	}
}