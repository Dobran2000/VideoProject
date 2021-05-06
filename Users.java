import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Users {
    String videoFavorite;
    String nume;

    public Users(String nume)
    {
        this.nume=nume;

    }
    public Users(String videoFavorite, String nume) {
        this.videoFavorite = videoFavorite;
        this.nume = nume;
    }

    public String getVideoFavorite() {
        return videoFavorite;
    }

    public void setVideoFavorite(String videoFavorite) {
        this.videoFavorite = videoFavorite;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }











}
