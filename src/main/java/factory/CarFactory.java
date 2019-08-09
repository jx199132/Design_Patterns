package factory;

public class CarFactory {
    public Car getCar(String name){
        if ("BWM".equals(name)){
            return new BWMCar();
        }else if ("Audi".equals(name)){
            return new AudiCar();
        }
        return null;
    }
}
