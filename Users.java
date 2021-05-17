import java.io.*;
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



    public void addNewAccount(String filename, String username,String email,String parola)
    {
        PrintWriter csvWriter;
        try {

            StringBuffer oneLineStringBuffer = new StringBuffer();

            File file = new File(filename);
            if (!file.exists()) {
                file = new File(filename);

            }
            csvWriter = new PrintWriter(new FileWriter(file, true));

            oneLineStringBuffer.append("\n");
            oneLineStringBuffer.append(username);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(email);
            oneLineStringBuffer.append(",");
            oneLineStringBuffer.append(parola);

            csvWriter.print(oneLineStringBuffer);

            csvWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }






}
