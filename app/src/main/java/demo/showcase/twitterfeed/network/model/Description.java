package demo.showcase.twitterfeed.network.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Description{

	@SerializedName("urls")
	private List<Object> urls;

	public List<Object> getUrls(){
		return urls;
	}
}