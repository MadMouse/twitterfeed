package demo.showcase.twitterfeed.network.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Medium{

	@SerializedName("w")
	private int W;

	@SerializedName("h")
	private int H;

	@SerializedName("resize")
	private String resize;

	public int getW(){
		return W;
	}

	public int getH(){
		return H;
	}

	public String getResize(){
		return resize;
	}
}