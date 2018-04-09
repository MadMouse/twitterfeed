package demo.showcase.twitterfeed.network.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class HashtagsItem{

	@SerializedName("indices")
	private List<Integer> indices;

	@SerializedName("text")
	private String text;

	public List<Integer> getIndices(){
		return indices;
	}

	public String getText(){
		return text;
	}
}