public class ClassesAndObjects {
    public static void main(String[] args){
    Person person1 = new Person();
    person1.setName("Вася");
    person1.setAge(0);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public void setName(String userName){
     if   (userName.isEmpty()){
            System.out.println("Ошибка: передано пустое поле!");
        } else{
        name = userName;
        }
    }
    public String getName(){
        return name;
    }
    public void setAge(int userAge){

        if (userAge > 0){
            age = userAge;}
            else{
                System.out.println("Возраст должен быть положительным");
            }

    }
    public int getAge(){
        return age;
    }

    }

