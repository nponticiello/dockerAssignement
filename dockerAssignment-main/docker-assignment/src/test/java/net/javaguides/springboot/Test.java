package net.javaguides.springboot;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

import static java.lang.System.out;

public class Test {

    String jsonString = "{\n" +
            "  \"songs\": [\n" +  "    {\n" +  "      \"songTitle\": \"Magic Trick\",\n" +  "      \"artist\": \"The Night Game\",\n" +
            "      \"album\": \"Dog Years\",\n" +  "      \"playlistSpot\": \"1\"\n" +  "    },\n" +  "    {\n" +  "      \"songTitle\": \"Hey Mami\",\n" +
            "      \"artist\": \"Sylvan Esso\",\n" + "      \"album\": \"Sylvan Esso\",\n" + "      \"playlistSpot\": \"2\"\n" +  "    },\n" +
            "    {\n" + "      \"songTitle\": \"All Night\",\n" + "      \"artist\": \"WALK THE MOON\",\n" + "      \"album\":  \"What if Nothing\",\n" +
            "      \"playlistSpot\": \"3\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"83\",\n" + "      \"artist\": \"John Mayer\",\n" +
            "      \"album\": \"Room For Squares\",\n" + "      \"playlistSpot\": \"4\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"American Nights\",\n" +
            "      \"artist\": \"The Night Game\",\n" + "      \"album\": \"The Night Game\",\n" + "      \"playlistSpot\": \"5\"\n" + "    },\n" +
            "    {\n" + "      \"songTitle\": \"I Miss You\",\n" + "      \"artist\": \"blink-182\",\n" + "      \"album\": \"blink-182\",\n" + "      \"playlistSpot\": \"6\"\n" +
            "    },\n" + "    {\n" + "      \"songTitle\": \"Kevin\",\n" + "      \"artist\": \"Macklemore and Ryan Lewis\",\n" + "      \"album\": \"This Unruly Mess I've Made\",\n" +
            "      \"playlistSpot\": \"7\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"Dress\",\n" + "      \"artist\": \"Sylvan Esso\",\n" + "      \"album\": \"Sylvan Esso\",\n" +
            "      \"playlistSpot\":\"8\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"Dunes\",\n" + "      \"artist\": \"Alabama Shakes\",\n" +
            "      \"album\": \"Sound & Color\",\n" + "      \"playlistSpot\": \"9\"\n" + "    },\n" + "\n" + "    {\n" + "      \"songTitle\": \"Better\",\n" +
            "      \"artist\": \"Parachute\",\n" + "      \"album\": \"Parachute\",\n" + "      \"playlistSpot\": \"10\"\n" + "    },\n" +
            "    {\n" + "      \"songTitle\": \"Creepin\",\n" + "      \"artist\": \"Hayley Williams\",\n" + "      \"album\": \"Petals For Armor\",\n" +
            "      \"playlistSpot\": \"11\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"Distance\",\n" + "      \"artist\": \"One Republic\",\n" +
            "      \"album\": \"Human\",\n" + "      \"playlistSpot\": \"12\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"Stay High\",\n" +
            "      \"artist\": \"Brittany Howard\",\n" + "      \"album\": \"Jaime\",\n" + "      \"playlistSpot\": \"13\"\n" + "    },\n" + "    {\n" +
            "      \"songTitle\": \"Something To Believe In\",\n" + "      \"artist\": \"Parachute\",\n" + "      \"album\": \"The Way It Was\",\n" +
            "      \"playlistSpot\": \"14\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"Don't Wanna Fight\",\n" + "      \"artist\": \"Alabama Shakes\",\n" +
            "      \"album\": \"Sound & Color\",\n" +
            "      \"playlistSpot\": \"15\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"Run\",\n" + "      \"artist\": \"One Republic\",\n" +
            "      \"album\": \"Human\",\n" + "      \"playlistSpot\":\"16\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"Raven\",\n" +
            "      \"artist\": \"Dave Matthews Band\",\n" + "      \"album\": \"Busted Stuff\",\n" + "      \"playlistSpot\":\"17\"\n" + "    },\n" +
            "    {\n" + "      \"songTitle\": \"No Such Thing\",\n" + "      \"artist\": \"John Mayer\",\n" + "      \"album\": \"Room For Squares\",\n" +
            "      \"playlistSpot\": \"18\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"Crash Into Me\",\n" + "      \"artist\": \"Dave Matthews Band\",\n" +
            "      \"album\": \"Crash\",\n" + "      \"playlistSpot\": \"19\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"Young\",\n" +
            "      \"artist\": \"Parachute\",\n" + "      \"album\": \"Parachute\",\n" + "      \"playlistSpot\": \"20\"\n" + "    },\n" +
            "    {\n" + "      \"songTitle\": \"Sudden Desire\",\n" + "      \"artist\": \"Hayley Williams\",\n" + "      \"album\": \"Petals For Armor\",\n" +
            "      \"playlistSpot\": \"21\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"Repeat\",\n" + "      \"artist\": \"One Republic\",\n" +
            "      \"album\": \"Human\",\n" + "      \"playlistSpot\":\"22\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"Ocean\",\n" +
            "      \"artist\": \"Parachute\",\n" + "      \"album\": \"Parachute\",\n" + "      \"playlistSpot\": \"23\"\n" + "    },\n" +
            "    {\n" + "      \"songTitle\": \"Forgot About You\",\n" + "      \"artist\": \"One Republic\",\n" + "      \"album\": \"Human\",\n" +
            "      \"playlistSpot\":\"24\"\n" + "    },\n" + "\n" + "    {\n" + "      \"songTitle\": \"My Stupid Mouth\",\n" + "      \"artist\": \"John Mayer\",\n" +
            "      \"album\": \"Room For Squares\",\n" + "      \"playlistSpot\": \"25\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"I Feel Like Dancing\",\n" +
            "      \"artist\": \"The Night Game\",\n" + "      \"album\": \"Dog Years\",\n" + "      \"playlistSpot\": \"26\"\n" + "    },\n" +
            "    {\n" + "      \"songTitle\": \"Our Generation\",\n" + "      \"artist\": \"The Night Game\",\n" + "      \"album\": \"Dog Years\",\n" +
            "      \"playlistSpot\": \"27\"\n" + "    },\n" + "    {\n" + "      \"songTitle\": \"Companion\",\n" + "      \"artist\": \"The Night Game\",\n" +
            "      \"album\": \"Dog Years\",\n" + "      \"playlistSpot\": \"28\"\n" + "    }\n" + "  ]\n" +
            "}";


    @GetMapping("/home")
    public String home(){

        return "song";
    }



    @GetMapping("/nightGame/album=dogyears/songs")
    public String nightGame(){
        String dogYears = "";
        String artist = "";
        String songTitle = "";
        String song = "";
        String nightGame ="";


        try {

            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray songsArray = jsonObject.getJSONArray("songs");

            for(int i = 0; i < songsArray.length(); i++){
                JSONObject songItem = songsArray.getJSONObject(i);
                artist = songItem.getString("artist");
                songTitle = songItem.getString("songTitle");

                dogYears = songItem.getString("album");
                if(dogYears.equals("Dog Years")){
                    song += " " + songTitle + ",";
                }
                if (artist.equals("The Night Game")){
                    nightGame = artist;
                }

            }


        } catch (Exception e) {
            out.println(e.getMessage());
        }
        return nightGame +  ": " + song;
    }
    @GetMapping("/davematthewsband/songs")
    public String daveMatthewsBandSongs() {

        String songTitle = "";
        String info = "";
        String daveMatthews = "";


        try {

            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray songsArray = jsonObject.getJSONArray("songs");

            for(int i = 0; i < songsArray.length(); i++){
                JSONObject songItem = songsArray.getJSONObject(i);
                songTitle = songItem.getString("songTitle");

                daveMatthews = songItem.getString("artist");
                if(daveMatthews.equals("Dave Matthews Band")){
                    info += " " + songTitle;
                }

            }


        } catch (Exception e) {
            out.println(e.getMessage());
        }
        return info ;
    }

    @GetMapping("/artists")
    public String artist(){

        String artist = "";
        String info = "";

        try {

            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray songsArray = jsonObject.getJSONArray("songs");
            ArrayList<String> artistNames = new ArrayList<>();

            for(int i = 0; i < songsArray.length(); i++){
                JSONObject songItem = songsArray.getJSONObject(i);
                artist = songItem.getString("artist");
                artistNames.add(artist);
            }

            ArrayList<String>nonDuplicate = new ArrayList<>();
            for(String s : artistNames){
                if (!nonDuplicate.contains(s)){
                    nonDuplicate.add(s);
                }
            }

            for (String s : nonDuplicate) {
                info += " " + s + ",";
            }


        } catch (Exception e) {
            out.println(e.getMessage());
        }
        return  info ;
    }

    public static void main(String[] args) {
        SpringApplication.run(Test.class, args);
    }
}
