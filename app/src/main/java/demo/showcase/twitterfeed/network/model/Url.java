package demo.showcase.twitterfeed.network.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Url{

	@SerializedName("urls")
	private List<UrlsItem> urls;

	public List<UrlsItem> getUrls(){
		return urls;
	}
}