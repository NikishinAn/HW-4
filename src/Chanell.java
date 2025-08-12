import java.util.Objects;

class Channel {
    private String name;
    private int number;
    private Program currentProgram;

    public Channel(String name, int number, Program currentProgram) {
        this.name = name;
        this.number = number;
        this.currentProgram = currentProgram;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Program getCurrentProgram() {
        return currentProgram;
    }

    public void setCurrentProgram(Program currentProgram) {
        this.currentProgram = currentProgram;
    }

    public void changeProgram(Program newProgram) {
        this.currentProgram = newProgram;
        System.out.println("На канале " + name + " теперь идет: " + newProgram.getName());
    }

    public void showProgramInfo() {
        System.out.println("Канал: " + name + " (" + number + ")");
        System.out.println("Текущая программа: " + currentProgram.getName());
        System.out.println("Рейтинг: " + currentProgram.getRating());
        System.out.println("Зрителей: " + currentProgram.getViewersCount());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Channel channel = (Channel) o;
        return number == channel.number && Objects.equals(name, channel.name) && Objects.equals(currentProgram, channel.currentProgram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, currentProgram);
    }

    @Override
    public String toString() {
        return "Канал{" +
                "название='" + name + '\'' +
                ", номер=" + number +
                ", текущая программа=" + currentProgram +
                '}';
    }
}
