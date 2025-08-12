import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Television { //параметры
    private String brand;
    private double size;
    private boolean isOn;
    private int currentChannel;
    private List<Channel> channels;


    public Television(String brand, double size) { //бренд и размер будем передавать в экземплярах
        this.brand = brand;
        this.size = size;
        this.isOn = false;
        this.currentChannel = 1;
        this.channels = new ArrayList<>();
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

    public int getCurrentChannelNumber() {
        return currentChannel;
    }

    public List<Channel> getChannels() {
        return channels;
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

    public void addChannel(Channel channel) {
        channels.add(channel);
        System.out.println("Добавлен канал: " + channel.getName());
    }

    public void switchChannel(int channelNumber) {
        if (!isOn) {
            System.out.println("Телевизор выключен. Включите его сначала.");
            return;
        }

        boolean channelFound = false;
        for (Channel channel : channels) {
            if (channel.getNumber() == channelNumber) {
                currentChannel = channelNumber;
                channelFound = true;
                System.out.println("Переключено на канал: " + channel.getName());
                channel.showProgramInfo();
                break;
            }
        }

        if (!channelFound) {
            System.out.println("Канал с номером " + channelNumber + " не найден");
        }
    }

    public Channel getCurrentChannel() {
        for (Channel channel : channels) {
            if (channel.getNumber() == currentChannel) {
                return channel;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Television{" +
                "isOn=" + isOn +
                ", currentChannelNumber=" + currentChannel +
                ", channels=" + channels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return isOn == that.isOn &&
                currentChannel == that.currentChannel &&
                Objects.equals(channels, that.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isOn, currentChannel, channels);
    }


}

