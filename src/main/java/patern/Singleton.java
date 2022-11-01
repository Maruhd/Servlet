package patern;

class DataBase{
    private static String name = "Pasha";
    private static DataBase base;
    private DataBase(){}
    public static DataBase getInstance(){
        if (base==null){
            base = new DataBase();
        }
        return base;
    }
    public String getName(){
        return name;
    }
    public void setName(String a){
        name=a;
    }
}

public class Singleton {
    public static void main(String[] args) {
        DataBase dataBase1 = DataBase.getInstance();
        DataBase dataBase2 = DataBase.getInstance();
        System.out.println(dataBase1.equals(dataBase2));

//        dataBase1.setName("Sasha");
        System.out.println(dataBase1.getName());
        System.out.println(dataBase2.getName());
        System.out.println(dataBase1.equals(dataBase2));

    }
}
