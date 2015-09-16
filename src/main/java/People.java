/**
 * Created by Ангелин on 15.09.2015.
 */
public class People {

    public String name = "Andrey";
    public int age = 27;
    public int weight = 85;
    public int height = 184;

    public People(){

    }

    public People(String name, int age, int weight, int height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof People)) {
            return false;
        }
        People people = (People) obj;
        if (!(name.equals(people.name))){
            return false;
        }
        if (age != people.age){
            return false;
        }
        if (weight != people.weight){
            return false;
        }
        if (height != people.height){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + weight;
        result = 31 * result + height;
        return result;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
