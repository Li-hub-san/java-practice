package exercises.school.aula13;

public class Division {
  private DivisionType divisionType;
  private double area;
  private int numberOfWindows;
  private int seatedSpots;

  public Division(DivisionType divisionType, double area, int numberOfWindows, int seatedSpots) {
    this.divisionType = divisionType;
    this.area = area;
    this.numberOfWindows = numberOfWindows;
    this.seatedSpots = seatedSpots;
  }


  public DivisionType getDivisionType() {
    return divisionType;
  }

  public void setDivisionType(DivisionType divisionType) {
    this.divisionType = divisionType;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public int getNumberOfWindows() {
    return numberOfWindows;
  }

  public void setNumberOfWindows(int numberOfWindows) {
    this.numberOfWindows = numberOfWindows;
  }

  public int getSeatedSpots() {
    return seatedSpots;
  }

  public void setSeatedSpots(int seatedSpots) {
    this.seatedSpots = seatedSpots;
  }

  @Override
  public String toString() {
    return
        "{Division type: " + divisionType +
            ", area= " + area + "m2" +
            ", numberOfWindows=" + numberOfWindows +
            ", seatedSpots=" + seatedSpots +
            '}';
  }
}
