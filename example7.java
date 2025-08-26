// parent class--------------------------------------
class Vehicle {
    void showVehicle() {
        System.out.println("Vehicle");
    }
}

// child class ----------------------------------
class Car extends Vehicle {
    void car() {
        System.out.println("Vehicle to Car");
    }
}

// grandchild ------------------------------------
class BMW extends Car {
    void bmw() {
        System.out.println("Vehicle to Car to BMW");
    }
}

class Audi extends Car {
    void audi() {
        System.out.println("Vehicle to Car to Audi");
    }
}

class CTata extends Car {
    void tata() {
        System.out.println("Vehicle to Car to Tata");
    }
}

// child class----------------------------------
class Bus extends Vehicle {
    void bus() {
        System.out.println("Vehicle to Bus");
    }
}

// grandchild--------------------------------
class Ashok extends Bus {
    void ashok() {
        System.out.println("Vehicle to Bus to Ashok");
    }
}

class Mahindra extends Bus {
    void mahindra() {
        System.out.println("Vehicle to Bus to Mahindra");
    }
}

class BTata extends Bus {
    void tata() {
        System.out.println("Vehicle to Bus to Tata");
    }
}

// child class--------------------------------------------
class Bike extends Vehicle {
    void bike() {
        System.out.println("Vehicle to Bike");
    }
}

// grandchild--------------------------------------
class Hero extends Bike {
    void hero() {
        System.out.println("Vehicle to Bike to Hero");
    }
}

// great - grandchild----------------------------
class Petrol extends Hero {
    void petrol() {
        System.out.println("Vehicle to Bike to Hero to Petrol");
    }
}

// great great grandchild---------------------------
class P110CC extends Petrol {
    void cc110() {
        System.out.println("Vehicle to Bike to Hero to Petrol to 110CC");
    }
}

class P100CC extends Petrol {
    void cc100() {
        System.out.println("Vehicle to Bike to Hero to Petrol to 100CC");
    }
}

class P125CC extends Petrol {
    void cc125() {
        System.out.println("Vehicle to Bike to Hero to Petrol to 125CC");
    }
}

// -------------------------------------------
class EV extends Hero {
    void ev() {
        System.out.println("Vehicle to Bike to Hero to EV");
    }
}

class CNG extends Hero {
    void cng() {
        System.out.println("Vehicle to Bike to Hero to CNG");
    }
}

// -----------------------------------------
class Handa extends Bike {
    void handa() {
        System.out.println("Vehicle to Bike to Handa");
    }
}

class Ola extends Bike {
    void ola() {
        System.out.println("Vehicle to Bike to Ola");
    }
}

// main class
class example7 {
    public static void main(String[] args) {
        CNG c = new CNG();
        c.showVehicle(); // from parent
        c.hero();        // from Hero
        c.cng();         // specific to CNG
    }
}
