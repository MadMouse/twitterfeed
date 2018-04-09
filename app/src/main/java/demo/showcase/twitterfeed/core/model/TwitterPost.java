package demo.showcase.twitterfeed.core.model;

/**
 * Created by leslied on 07/04/2018.
 */

public class TwitterPost {
    private String createdAt;
    String full_text;
    String profile_image_url;

    public TwitterPost(String createdAt, String full_text, String profile_image_url) {
        this.createdAt = createdAt;
        this.full_text = full_text;
        this.profile_image_url = profile_image_url;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getFull_text() {
        return full_text;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }
}
