import java.util.Random;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int weight;
    private int height;

    public User(){
        this.id = makeHash("Null");
        this.firstName = makeName();
        this.lastName = makeName();
        this.age = 20;
        this.weight = 180;
        this.height = 72;
    }

    public User(String firstName, String lastName, int age, int weight, int height){
        this.id = makeHash(firstName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    private int makeHash(String name){

        //TODO: Actually make this a hash
        Random rand = new Random();
        int upperbound = 2048;
        int res = rand.nextInt(upperbound);
        return res;
    }

    public String makeName(){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        int length = 8;
        for(int i = 0; i < length; ++i){
            int idx = rand.nextInt(alphabet.length());
            char randChar = alphabet.charAt(idx);
            sb.append(randChar);
        }

        String res = sb.toString();
        return res;
    }

    public void dbAdd(){
        JDBC.insert(this.id, this.lastName, this.firstName, this.age, this.weight, this.height);
    }

}
