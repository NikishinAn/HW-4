import java.util.Objects;

class Program {
    private String name;
    private double rating;
    private int viewersCount;

    public Program(String name, double rating, int viewersCount){
        this.name = name;
        this.rating = rating;
        this.viewersCount = viewersCount;
    }

    //геттеры-сеттеры
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getViewersCount() {
        return viewersCount;
    }

    public void setViewersCount(int viewersCount) {
        this.viewersCount = viewersCount;
    }

    // метод на увеличение рейтинга
    public void increaseRating (double amount){
        this.rating += amount;
    }

    // метод на уменьшение рейтинга
    public void decreaseRating(double amount) {
        this.rating = Math.max(0, this.rating - amount);
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Program program = (Program) o;
        return Double.compare(program.rating, rating) == 0 &&
                viewersCount == program.viewersCount &&
                Objects.equals(name, program.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, rating, viewersCount);
    }

    @Override
    public String toString() {
        return "Программа{" +
                "название='" + name + '\'' +
                ", рейтинг=" + rating +
                ", количество зрителей=" + viewersCount +
                '}';
    }
}
