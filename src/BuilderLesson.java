public class BuilderLesson {

  public static void main(String[] args) {
    Car audi = new Car.Builder("Audi").setColor("black").setMaxSpeed(240).build();
    System.out.println(audi.getName());
    System.out.println(audi.getColor());
    System.out.println(audi.getMaxSpeed());
    Car bmw = new Car.Builder("BMW").setMaxSpeed(300).build();
    System.out.println(bmw.getName());
    System.out.println(bmw.getMaxSpeed());
  }
}
