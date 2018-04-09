package demo.showcase.twitterfeed.network.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class ExtendedEntities{

	@SerializedName("media")
	private List<MediaItem> media;

	public List<MediaItem> getMedia(){
		return media;
	}
}