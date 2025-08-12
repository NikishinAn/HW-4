public class App {
    public static void main(String[] args) {
        Television tv1 = new Television("Sony", 42.5); //экземпляр класса Television
        Television tv2 = new Television("LG", 32.0); //экземпляр класса Television

        // Программы
        Program news = new Program("Новости", 4.5, 1000000);
        Program movie = new Program("Кино", 8.2, 2500000);
        Program show = new Program("Шоу", 6.7, 1800000);
        Program sports = new Program("Спорт", 7.8, 2200000);

        // Каналы с программами
        Channel channel1 = new Channel("Первый канал", 1, news);
        Channel channel2 = new Channel("Кино ТВ", 2, movie);
        Channel channel3 = new Channel("Развлекательный", 3, show);
        Channel channel4 = new Channel("Спортивный", 4, sports);

        // Предположим, что смотрим всё на TV1, а TV2 выключен. Добавляем каналы
        tv1.addChannel(channel1);
        tv1.addChannel(channel2);
        tv1.addChannel(channel3);
        tv1.addChannel(channel4);

        tv1.powerOn(); //Включаем телевизор
        tv1.switchChannel(1);
        tv1.switchChannel(3);
        tv1.switchChannel(5); // Несуществующий канал

        // Меняем программу на канале
        Program newMovie = new Program("Новый фильм", 9.1, 3000000);
        channel2.changeProgram(newMovie);
        tv1.switchChannel(2);

        // Выключаем телевизор
        tv1.powerOff();

        // Проверяем equals и hashCode
        Program newsCopy = new Program("Новости", 4.5, 1000000);
        System.out.println("Программы равны? " + news.equals(newsCopy));
        System.out.println("Хэш-коды программ: " + news.hashCode() + " и " + newsCopy.hashCode());
    }
}
