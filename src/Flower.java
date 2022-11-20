public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null) {
            this.flowerColor = "белый";
        }else {
            this.flowerColor = flowerColor;
        }
        if (country == null) {
            this.country = "РОссия";
        }else {
            this.country=country;
        }
        if(cost <= 0){
            cost=1;
        }else {
            this.cost = cost;
        }
        if(lifeSpan<=0) {
            lifeSpan = 3;
        }else{
            this.lifeSpan=lifeSpan;
        }
    }
    public Flower(String flowerColor, String country, double cost){
        this(flowerColor,country, cost, 3 );
    }
    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

        public void setFlowerColor(String flowerColor) {
            if (flowerColor == null) {
                this.flowerColor = "белый";
            } else {
                this.flowerColor = flowerColor;
            }
        }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
