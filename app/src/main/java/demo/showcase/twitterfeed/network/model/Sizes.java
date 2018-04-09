package demo.showcase.twitterfeed.network.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Sizes{

	@SerializedName("small")
	private Small small;

	@SerializedName("large")
	private Large large;

	@SerializedName("thumb")
	private Thumb thumb;

	@SerializedName("medium")
	private Medium medium;

	public Small getSmall(){
		return small;
	}

	public Large getLarge(){
		return large;
	}

	public Thumb getThumb(){
		return thumb;
	}

	public Medium getMedium(){
		return medium;
	}
}