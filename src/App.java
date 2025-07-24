public class App {
    public static void main(String[] args) {
        Television tv1 = new Television("Sony", 42.5); //экземпляр класса Television
        Television tv2 = new Television("LG", 32.0); //экземпляр класса Television

        tv1.powerOn(); //tv включен
        tv1.changeChannel(5); //т.к тв включен - нужно задать параметр канала
        tv1.printInfo();
        //tv2 по умолчанию выключен, поэтому просто выводим инфу из экземпляра, канал по умолчанию '1'
        tv2.printInfo();
    }
}
