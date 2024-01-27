public class Lab13A {
    public static void main(String[] args) {
        Building buildingOne = new Building();
        Building buildingTwo = new Building(30, 30, 0.75f);

        System.out.println("Year 2020:");
        System.out.printf("Building 1 has %d floors, %d apartments, and is %.0f%% occupied. Full? %b\n", buildingOne.getStories(), buildingOne.getApartments(), buildingOne.getOccupancy() * 100, buildingOne.isFullyOccupied());
        System.out.printf("Building 2 has %d floors, %d apartments, and is %.0f%% occupied. Full? %b\n", buildingTwo.getStories(), buildingTwo.getApartments(), buildingTwo.getOccupancy() * 100, buildingTwo.isFullyOccupied());

        buildingOne.setOccupancy(0.0f);
        buildingTwo.setOccupancy(1.0f);

        System.out.println("Many years pass.");
        System.out.println("Year 2043:");
        System.out.printf("Building 1 has %d floors, %d apartments, and is %.0f%% occupied. Full? %b\n", buildingOne.getStories(), buildingOne.getApartments(), buildingOne.getOccupancy() * 100, buildingOne.isFullyOccupied());
        System.out.printf("Building 2 has %d floors, %d apartments, and is %.0f%% occupied. Full? %b\n", buildingTwo.getStories(), buildingTwo.getApartments(), buildingTwo.getOccupancy() * 100, buildingTwo.isFullyOccupied());

        System.out.println("Looks like people prefer taller buildings.");
    }
}
class Building {
    private int stories;
    private int apartments;
    private float occupancy;
    private boolean fullyOccupied;

    public Building() {
        stories = 10;
        apartments = 20;
        occupancy = 1.0f;
        fullyOccupied = true;
    }

    public Building(int stories, int apartments, float occupancy) {
        this.stories = stories;
        this.apartments = apartments;
        this.occupancy = occupancy;
        fullyOccupied = occupancy == 1.0f;
    }

    public int getStories() {
        return stories;
    }

    public int getApartments() {
        return apartments;
    }

    public float getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(float occupancy) {
        this.occupancy = occupancy;
        fullyOccupied = occupancy == 1.0f;
    }

    public boolean isFullyOccupied() {
        return fullyOccupied;
    }
}