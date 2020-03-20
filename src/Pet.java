import java.util.Random;

public class Pet {
    private int age;
    private Color Color;
    private Shelter shelter;

    private int generateDefaultAge()
    {
        Random r = new Random();
        return r. nextInt (20);
    }


    public int getAge() {
        return age;

    }
    public String  getInfo(){
        return "Питомец {"+
                "Возраст= "+getAge()+
                "Цвет="+getColor()+
                "приют"+shelter.getName()+
                "по адресу"+ shelter.getAddress()+
                "}";
    }


    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return Color;

    }

    public void setColor(Color color) {
        Color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }





    }
