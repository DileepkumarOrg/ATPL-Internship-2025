public abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
}

class Tv extends Appliance{

    @Override
    void turnOn() {
        System.out.println("Tv on");
    }

    @Override
    void turnOff() {
        System.out.println("Tv Off");
    }

}


class Fan extends Appliance{

    @Override
    void turnOn() {
        System.out.println("Fan is turned on");
    }

    @Override
    void turnOff() {
        System.out.println("Fan is turned off");
    }
    
}

class HomeAppliances{
    public static void main(String[] args) {
        Appliance tvObj = new Tv();
        Appliance fanObj = new Fan();
        tvObj.turnOn();
        tvObj.turnOff();
        fanObj.turnOn();
        fanObj.turnOff();
    }

}