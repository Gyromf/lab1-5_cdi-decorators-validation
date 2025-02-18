package Lab1_CDI;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class YourDataObject {


    private String name;
    private int age;


    public YourDataObject() {}


    public YourDataObject(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @XmlElement
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    @JsonProperty("age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "YourDataObject{name='" + name + "', age=" + age + '}';
    }
}
