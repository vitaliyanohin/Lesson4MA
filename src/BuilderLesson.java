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

class Car {
  private String name;
  private String color;
  private int maxSpeed;

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  private Car(Builder builder) {
    this.name = builder.name;
    this.color = builder.color;
    this.maxSpeed = builder.maxSpeed;
  }


  static class Builder {
    private String name;
    private String color;
    private int maxSpeed;

    public Builder(String name) {
      this.name = name;
    }

    public Builder setColor(String color) {
      this.color = color;
      return this;
    }

    public Builder setMaxSpeed(int maxSpeed) {
      this.maxSpeed = maxSpeed;
      return this;
    }

    public Car build() {
      return new Car(this);
    }
  }
}