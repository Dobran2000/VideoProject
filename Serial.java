import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Serial extends Video {
    String numarSezoane;
    String durataSezoane;
    String rating;
    int numarVizualizari;
    int n;

    public Serial() {
        super();

    }

    public Serial(String titlu, String anLansare, String gen, String numarSezoane, String durataSezoane, String rating, int numarVizualizari) {
        this.titlu = titlu;
        this.anLansare = anLansare;
        this.gen = gen;
        this.numarSezoane = numarSezoane;
        this.durataSezoane = durataSezoane;
        this.rating = rating;
        this.numarVizualizari = numarVizualizari;
    }

    public String getNumarSezoane() {
        return numarSezoane;
    }

    public void setNumarSezoane(String numarSezoane) {
        this.numarSezoane = numarSezoane;
    }

    public String getDurataSezoane() {
        return durataSezoane;
    }

    public void setDurataSezoane(String durataSezoane) {
        this.durataSezoane = durataSezoane;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getNumarVizualizari() {
        return numarVizualizari;
    }

    public void setNumarVizualizari(int numarVizualizari) {
        this.numarVizualizari = numarVizualizari;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Serial serial = (Serial) o;
        return Objects.equals(numarSezoane, serial.numarSezoane) &&
                Objects.equals(durataSezoane, serial.durataSezoane) &&
                Objects.equals(rating, serial.rating) &&
                Objects.equals(numarVizualizari, serial.numarVizualizari);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numarSezoane, durataSezoane, rating, numarVizualizari);
    }

    @Override
    public String toString() {
        return "Serial{" +
                "title= " + titlu +
                "numarSezoane='" + numarSezoane + '\'' +
                ", durataSezoane='" + durataSezoane + '\'' +
                ", rating='" + rating + '\'' +
                ", numarVizualizari='" + numarVizualizari + '\'' +
                '}';
    }


    public static List<Serial> getSeriale() {
        return Arrays.asList(
                new Serial("Survivor", "2003", "Drama", "3",
                        "1,2,3", "2,4", 0)
        );

    }

    public void readfrom_csv(String filename) {
        String line = "";
        String splitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                System.out.println("" + employee[0]);
            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }


    public void Scarlatescu(String filename, String source, List<Serial> seriale) {
        String line = "";
        String splitBy = ",";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(splitBy);
                for (Serial serial : seriale) {
                    if (source.equals(employee[0])) {
                        int n = 0;
                        n++;
                        employee[1] = String.valueOf(n);
                        // System.out.println(employee[1]);
                    }
                }
                System.out.println(employee[1]);

            }
        } catch (IOException var6) {
            var6.printStackTrace();
        }


    }


    public void riseViews(String filename, String source) {
        List<String[]> rowList = new ArrayList<String[]>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineItems = line.split(",");
                rowList.add(lineItems);
            }
            br.close();
        } catch (Exception e) {

        }
        String[][] matrix = new String[rowList.size()][];
        for (int i = 0; i < rowList.size(); i++) {
            String[] row = rowList.get(i);
            matrix[i] = row;
        }
        for (int i = 0; i < rowList.size(); i++) {
            if (matrix[i][0].equals(source)) {
                int numar = Integer.parseInt(matrix[i][1]);
                numar++;
                matrix[i][1] = "";
                matrix[i][1] = String.valueOf(numar);
                System.out.println(matrix[i][1]);


            }
        }

        for (int i = 0; i < rowList.size(); i++)
            System.out.println(matrix[i][1]);

    }


    public void FavoriteVideo(String filename, String filename2, String source, String numeUser) {
        List<String[]> rowList = new ArrayList<String[]>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineItems = line.split(",");
                rowList.add(lineItems);
            }
            br.close();
        } catch (Exception e) {

        }

        PrintWriter csvWriter;
        try {
            StringBuffer oneLineStringBuffer = new StringBuffer();


            csvWriter = new PrintWriter(new FileWriter(filename2, true));


            String[][] matrix = new String[rowList.size()][];
            for (int i = 0; i < rowList.size(); i++) {
                String[] row = rowList.get(i);
                matrix[i] = row;
            }
            for (int i = 0; i < rowList.size(); i++) {
                if (matrix[i][0].equals(source)) {

                    oneLineStringBuffer.append("\n");
                    oneLineStringBuffer.append(numeUser);
                    oneLineStringBuffer.append(",");
                    oneLineStringBuffer.append(source);

                    csvWriter.print(oneLineStringBuffer);
                    System.out.println(oneLineStringBuffer);
                    csvWriter.close();
                }
            }

            for (int i = 0; i < rowList.size(); i++)
                System.out.println(matrix[i][1]);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


public void UsersView(String filename) {
        List<String[]> rowList = new ArrayList<String[]>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineItems = line.split(",");
                rowList.add(lineItems);
            }
            br.close();
        } catch (Exception e) {

        }
        String[][] matrix = new String[rowList.size()][];
        for (int i = 0; i < rowList.size(); i++) {
            String[] row = rowList.get(i);
            matrix[i] = row;
        }
        for (int i = 0; i < rowList.size(); i++) {

            System.out.println(matrix[i][0]);


        }
    }
}