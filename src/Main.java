public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", 35, "Минск", "бренд-менеджером");
        Human anya = new Human("Аня", 29, "Москва", "методистом образовательных программ");
        Human katya = new Human("Катя", 28, null, "продакт-менеджером");
        Human artem = new Human("Артем", 27, "Москва", "директором по развитию бизнеса");
        Human vladimir = new Human("Владимир", 21, "Казань", null);

        Flower rose = new Flower(null, "Голандия", 35.59);
        Flower chrysanthemums = new Flower(null, null, 15, 5);
        Flower pion = new Flower(null, "Англия", 69.9, 1);
        Flower gipsofila = new Flower(null, "Турция", 19.5);

        printInfo(maksim);
        printInfo(anya);
        printInfo(katya);
        printInfo(artem);
        printInfo(vladimir);
        printInfo(rose);
        printInfo(chrysanthemums);
        printInfo(pion);
        printInfo(gipsofila);
    }

    private static void printInfo(Human human) {
        System.out.println("Привет. Меня зовут " + human.name + ". Я из города " + human.getCity() + ". Мне " + human.getAge() + ". Я работаю  " + human.job + ". Будем знакомы!");
    }

    private static void printInfo(Flower flower) {
        System.out.println("Цвет:" + flower.getFlowerColor() + ", страна: " + flower.getCountry() + ", стоимость за штуку" + flower.getCost() + ",  срок стояния цветка  " + flower.lifeSpan + "дней");
    }
    private static void printCostOfBouquet (Flower... flowers){
        int minimumLifeSpan=Integer.MAX_VALUE;
        double totalCost = 0;

        for (Flower flower: flowers){
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan= flower.lifeSpan;
            }
            totalCost=+flower.setCost();
        }
    }
}
