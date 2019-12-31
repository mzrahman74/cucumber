package files;

public class resources {

    public static  String placePostData(){
        String res="/maps/api/place/add/json";
        return res;
    }

    public static String placeDelete(){
        String res= "/maps/api/place/delete/json";
        return res;
    }

    public static String PlacePostData1(){
        String res = "/maps/api/place/nearbysearch/json";
        return res;
    }
}
