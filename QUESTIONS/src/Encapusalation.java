public class Encapusalation {

    private String name;
    private int age;


    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(age);
    }
    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }


    public static void main(String[] args) {
        Encapusalation getEverything = new Encapusalation();

        System.out.println();
        getEverything.setAge(19);
        getEverything.setName("phedwine");
    }
}
