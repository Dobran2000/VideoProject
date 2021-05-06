public class Film extends Video{

    String durata;
     String rating;

    public Film(String titlu, String anLansare, String gen, String durata, String rating) {
        super();
        this.durata=durata;
        this.rating=rating;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "durata='" + durata + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
