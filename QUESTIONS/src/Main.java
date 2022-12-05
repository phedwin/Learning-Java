
abstract class students {
    int age = 21;
    int graduatonYear = 2018;

    abstract void study();
}

class followStudents extends students {
    String name =  "phedwine";

    void study(){
        System.out.println("yes studied");
    };
}

class Main {
    public static void main(String[] args) {
        followStudents getInfo = new followStudents();
        System.out.println("name: " + getInfo.name);
        System.out.println("Age: " +  getInfo.age);
        System.out.println("Graduation year: " + getInfo.graduatonYear);
        getInfo.study();
    }
}