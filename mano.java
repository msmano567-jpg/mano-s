class ManufacturingMachine {

    public void startMachine() {
        System.out.println("Machine Started...");
    }

    public void stopMachine() {
        System.out.println("Machine Stopped.");
    }

    public void runConveyor() throws InterruptedException {
        System.out.println("Conveyor Running...");
        Thread.sleep(2000);
    }

    public void activateCutter() throws InterruptedException {
        System.out.println("Cutter Activated...");
        Thread.sleep(2000);
        System.out.println("Cutting Complete.");
    }

    public static void main(String[] args) throws InterruptedException {

        ManufacturingMachine machine = new ManufacturingMachine();

        machine.startMachine();
        machine.runConveyor();
        machine.activateCutter();
        machine.stopMachine();
    }
}
