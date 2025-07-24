public class Television { //параметры
    private String brand;
    private double size;
    private boolean isOn;
    private int channel;

    public Television(String brand, double size) { //бренд и размер будем передавать в экземплярах
        this.brand = brand;
        this.size = size;
        this.isOn = false;
        this.channel = 1;
    }
    //геттеры
    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getChannel() {
        return channel;
    }
    //сеттеры
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void powerOn() {
        isOn = true;
    }

    public void powerOff() {
        isOn = false;
    }

    public void changeChannel(int channel) {
        if(isOn) this.channel = channel; //если телевизор включен - меняет канал
    }

    public void printInfo() { //вывод в консоль
        String status = isOn ? "вкл" : "выкл";
        System.out.println(brand + ", " + size + "\", " + status + ", канал " + channel);
    }
}

