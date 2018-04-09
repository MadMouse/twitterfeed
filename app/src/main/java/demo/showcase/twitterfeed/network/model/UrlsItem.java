package demo.showcase.twitterfeed.network.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class UrlsItem{

	@SerializedName("display_url")
	private String displayUrl;

	@SerializedName("indices")
	private List<Integer> indices;

	@SerializedName("expanded_url")
	private String expandedUrl;

	@SerializedName("url")
	private String url;

	public String getDisplayUrl(){
		return displayUrl;
	}

	public List<Integer> getIndices(){
		return indices;
	}

	public String getExpandedUrl(){
		return expandedUrl;
	}

	public String getUrl(){
		return url;
	}
}