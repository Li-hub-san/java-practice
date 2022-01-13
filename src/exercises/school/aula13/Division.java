package exercises.school.aula13;

public class Division {
    private String DivisionType;
    private int area;
    private int numberOfWindows;
    private int seatedSpots;

    public Division(String divisionType, int area, int numberOfWindows, int seatedSpots) {
        DivisionType = divisionType;
        this.area = area;
        this.numberOfWindows = numberOfWindows;
        this.seatedSpots = seatedSpots;
    }

    public String getDivisionType() {
        return DivisionType;
    }

    public void setDivisionType(String divisionType) {
        DivisionType = divisionType;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
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
}
