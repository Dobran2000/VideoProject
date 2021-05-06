import java.util.Objects;

public class Video {

    String titlu;
    String anLansare;
    String gen;

    public Video() {
        this.titlu = titlu;
        this.anLansare = anLansare;
        this.gen = gen;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAnLansare() {
        return anLansare;
    }

    public void setAnLansare(String anLansare) {
        this.anLansare = anLansare;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(titlu, video.titlu) &&
                Objects.equals(anLansare, video.anLansare) &&
                Objects.equals(gen, video.gen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titlu, anLansare, gen);
    }

    @Override
    public String toString() {
        return "Video{" +
                "titlu='" + titlu + '\'' +
                ", anLansare='" + anLansare + '\'' +
                ", gen='" + gen + '\'' +
                '}';
    }
}
