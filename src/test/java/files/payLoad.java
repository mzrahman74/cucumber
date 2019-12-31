package files;

public class payLoad {

    public static String getPostData(){

        String b = "{\n" +
                "\t\"location\":{\n" +
                "\t\t\"lat\":-38.383494,\n" +
                "\t\t\"lng\":-33.427362\n" +
                "\t\t},\n" +
                "\t\t\"accuracy\":50,\n" +
                "\t\t\"name\":\"Frontline house\",\n" +
                "\t\t\"phone_number\":\"(91) 983 893 3937\",\n" +
                "\t\t\"address\":\"29, side layout, cohen 09\",\n" +
                "\t\t\"website\": \"http://google.com\",\n" +
                "\t\t\"language\": \"French-IN\"\n" +
                "}";

        return b;
    }

    }
