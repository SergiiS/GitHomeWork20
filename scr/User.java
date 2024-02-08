class User {
    public final String name;
    public final String email;
    public final String telephone;
    public String surname;
    public int weight;
    public String pressure;
    public int stepsPerDay;
    public final int birthDay;
    public final int birthMonth;
    public final int birthYear;
    public final int age;

    public User(String name, int day, int month, int year, String email, String telephone) {
        this.name = name;
        this.birthDay = day;
        this.birthMonth = month;
        this.birthYear = year;
        this.email = email;
        this.telephone = telephone;
        this.surname = "";
        this.weight = 0;
        this.pressure = "";
        this.stepsPerDay = 0;
        this.age = 2020 - year;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Date of Birth: " + birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("Age: " + age + " years");
        System.out.println("Email: " + email);
        System.out.println("Telephone: " + telephone);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Blood Pressure: " + pressure);
        System.out.println("Steps Per Day: " + stepsPerDay);
        System.out.println();
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getPressure() {
        return pressure;
    }
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
    public int getStepsPerDay() {
        return stepsPerDay;
    }
    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }
}