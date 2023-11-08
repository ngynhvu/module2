package practice.mvc1.model;

public class Marketing {
    private String position;
    private int id;
    private String name;
    private int old;
    private String city;
    private String gmail;
    private int salary;
    private int productBonus;
    public Marketing(){}
    public Marketing(String position, int id, String name, int old, String city, String gmail, int salary, int productBonus){
        this.position = position;
        this.id = id;
        this.name = name;
        this.old = old;
        this.city = city;
        this.gmail = gmail;
        this.salary = salary;
        this.productBonus = productBonus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getProductBonus() {
        return productBonus;
    }

    public void setProductBonus(int productBonus) {
        this.productBonus = productBonus;
    }

    @Override
    public String toString() {
        return "Marketing{" +
                "position='" + position + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", old=" + old +
                ", city='" + city + '\'' +
                ", gmail='" + gmail + '\'' +
                ", salary=" + salary +
                ", bonus=" + productBonus +
                '}';
    }
}
