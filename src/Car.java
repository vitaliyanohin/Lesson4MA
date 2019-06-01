public class Car {

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

  protected Car(Builder builder) {
    this.name = builder.name;
    this.color = builder.color;
    this.maxSpeed = builder.maxSpeed;
  }


  public static class Builder {
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
