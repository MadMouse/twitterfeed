package demo.showcase.twitterfeed.network.converters;

import java.util.ArrayList;
import java.util.List;

import demo.showcase.twitterfeed.core.model.TwitterPost;
import demo.showcase.twitterfeed.network.model.Response;

/**
 * Created by leslied on 08/04/2018.
 */

public class RestModelConverter {

    public static TwitterPost convertToCoreModel(Response response){

        return new TwitterPost(response.getCreatedAt(),
                        response.getFullText(),
                        response.getUser().getProfileImageUrl());
    }

    public static List<TwitterPost> convertToCoreModelList(List<Response> responseList){
        List<TwitterPost> resultList = new ArrayList<TwitterPost>();
        for(Response response : responseList){
            resultList.add(convertToCoreModel(response));
        }
        return resultList;

    }
}
