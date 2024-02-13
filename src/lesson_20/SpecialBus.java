package lesson_20;

public class SpecialBus extends Bus {
    private int bicyclePlaces;
    private int bicycleCount; // по дефолту инициализируется 0

    public SpecialBus(String model, int yearManufactured, int capacity, int bicyclePlaces) {
        super(model, yearManufactured, capacity);
        this.bicyclePlaces = bicyclePlaces;
    }

    public int getBicyclePlaces() {
        return bicyclePlaces;
    }

    public int getBicycleCount() {
        return bicycleCount;
    }

    public void takePassengerWithBicycle(){
        // Есть ли место для пассажира и велосипеда
        // Если есть оба свободных места, тогда добавить
        // А если для кого-то места нет, никого не садить
    }

    public int example(){
        return super.getCapacity();
    }

}
