import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws IOException {


        List<Serial> seriale=Serial.getSeriale();
        System.out.println(seriale);
String titluSerial="Survivor";
        Users utilizator=new Users("","Andrei");
        Users utilizator2=new Users("","Radu");
      ;
        //System.out.println(utilizator.getVideoFavorite());

        //System.out.println(utilizator.getVideoFavorite().concat(serial.getTitlu()));
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter command= ");
       // int number = Integer.parseInt(serial.getNumarVizualizari());

        String expression= myObj.nextLine();
        switch(expression) {

            case "View":
              String filename="D:\\Desktop\\VideoPeroject\\src\\View.csv";
                Serial serial1=new Serial();
                serial1.riseViews(filename,titluSerial);
                break;
            case "Favorite":
                String filename1="D:\\Desktop\\VideoPeroject\\src\\View.csv";
                String filename2="D:\\Desktop\\VideoPeroject\\src\\Users.csv";
                String filename3="D:\\Desktop\\VideoPeroject\\src\\FavouriteVideos.csv";
                Serial serial2=new Serial();
                serial2.FavoriteVideo(filename1,filename3,titluSerial,utilizator.getNume());
                serial2.UsersView(filename2);
                  break;

                default:
                // code block
        }




    }
}
