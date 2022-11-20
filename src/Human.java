import javax.print.attribute.HashAttributeSet;

public class Human {
    public String name;
    private int age;
    private String city;
    public String job;

    public Human(String name, int age, String city, String job) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
            if (name == null) {
                this.name = "Информация не указана";
            } else {
                this.name = name;
            }
            if (city == null) {
                this.city = "Информация не указана";
            } else {
                this.city = city;
            }
            if (job == null) {
                this.job = "Информация не указана";
            } else {
                this.job = job;
            }
        }
    }


    public String getCity() {
        return city;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            this.age = 0;
        }else{
            this.age = age;

            }

        }
        public void setCity(String city) {
        if (city == null) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
    }
}



