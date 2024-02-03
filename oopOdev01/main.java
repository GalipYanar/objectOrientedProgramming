package oopOdev01;

public class main {

    public static void main(String[] args) {

        Bmw bmw = new Bmw();
        Koenigsegg koenigsegg = new Koenigsegg();

        bmw.setBrand("F80 M3");
        System.out.println("Aracınız bmw " +bmw.getBrand() + " modeldir");

        bmw.setColour("Turkuaz");
        System.out.println(bmw.getColour() + " renktedir");

        bmw.setBodyType("Sedan");
        System.out.println("Aracınız " + bmw.getBodyType() );

        bmw.setEngineType("Benzinli");
        System.out.println("Yakıt-Motor türü: " + bmw.getEngineType());

        bmw.setWhp(750);
        System.out.println("Beygir gücü: " + bmw.getWhp() +"hp");

        bmw.setNumberOfPassangers(4);
        System.out.println("Yolsu sayısı: " + bmw.getNumberOfPassangers());

        bmw.setRelaseDate(2017);
        System.out.println("Aracınız " + bmw.getRelaseDate() + " model");

        bmw.setTransmission("Manuel şanzıman");
        System.out.println(bmw.getTransmission() + " çek 3 ten 2 ye");

        bmw.setFreeServices("Yılda 1 kez ücretsiz bakım");
        System.out.println(bmw.getFreeServices() + " hakkınız vardır");

        bmw.setIsARagularCar("Bu araç, standart M pakettir");
        System.out.println(bmw.getIsARagularCar());

        bmw.setWarranty("Ve 10 sene garantilidir");
        System.out.println(bmw.getWarranty());


        System.out.println("");
        System.out.println("");


        koenigsegg.setBrand("Agera RS");
        System.out.println("aracınız koenigsegg " + koenigsegg.getBrand() + " modeldir");

        koenigsegg.setColour("Kırmız-Siyah");
        System.out.println("Renk : " + koenigsegg.getColour());
        koenigsegg.setBodyType("Sport");
        System.out.println("Bu araç " + koenigsegg.getBodyType()+"tur");
        koenigsegg.setEngineType("Hybrit");
        System.out.println("Motor türü: " + koenigsegg.getEngineType());
        koenigsegg.setWhp(1200);
        System.out.println("Beygir gücü: " + koenigsegg.getWhp()+"hp");
        koenigsegg.setNumberOfPassangers(2);
        System.out.println("Yolcu sayısı: " +koenigsegg.getNumberOfPassangers());
        koenigsegg.setRelaseDate(2015);
        System.out.println("Aracın üretim yılı: " +koenigsegg.getRelaseDate());
        koenigsegg.setTransmission("Otomatik şanzıman");
        System.out.println("Şanzıman türü: " + koenigsegg.getTransmission());
        koenigsegg.setSpeed(399);
        System.out.println("Maksimum hız limiti: " + koenigsegg.getSpeed() + "kmh");
        koenigsegg.setLimited("Bu araçtan Dünyada sayılı adet vardır");
        System.out.println(koenigsegg.getLimited());
        koenigsegg.setIsAHyperCar("Aracınız yüksek süratlere çok hızlı çıkmaktadır.");
        System.out.println("DİKKAT!!! " + koenigsegg.getIsAHyperCar());


    }
}
