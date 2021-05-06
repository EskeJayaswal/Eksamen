public class Bog {
    float ISBN;
    int year;
    String title;

    public Bog(float ISBN, int year, String title) {
        this.ISBN = ISBN;
        this.year = year;
        this.title = title;
    }

    public float getISBN() {
        return ISBN;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public void setISBN(float ISBN) {
        this.ISBN = ISBN;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "ISBN=" + ISBN +
                ", year=" + year +
                ", title='" + title + '\'' +
                '}';
    }
}
