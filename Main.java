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



        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter command= ");


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
            case "Create Account":
                 String filename5="D:\\Desktop\\VideoPeroject\\src\\Users.csv";
                 utilizator.addNewAccount(filename5,utilizator.getNume(),
                         "andre@yahoo.com","12345678");
                 break;
            case "Rating":
                Serial serial3=new Serial();
                String filename6="D:\\Desktop\\VideoPeroject\\src\\View.csv";
                String filename7="D:\\Desktop\\VideoPeroject\\src\\FavouriteVideos.csv";
                serial3.calculateRating(filename6,filename7);
                break;
            case "Average":
                Serial serial4=new Serial();
                String filename10="D:\\Desktop\\VideoPeroject\\src\\View.csv";
                serial4.sortActoresByRating(filename10);
                break;
            case "FavoriteVideos":
                 Serial serial5=new Serial();
                 String filename11="D:\\Desktop\\VideoPeroject\\src\\FavouriteVideos.csv";
                 serial5.SortareSerialeFavorite(filename11);
            case "NumberOfViews":
                  String numeFilm="Survivor";
                  String filename14="D:\\Desktop\\VideoPeroject\\src\\View.csv";
                  Serial serial2000=new Serial();
                  serial2000.cresteNumarulDeVizionari(filename14,numeFilm);
                  break;




                 default:
                // code block
        }




    }
}
