package Up_n_Downcast.Upcast;

import Up_n_Downcast.Computer;
import Up_n_Downcast.Notebook;

public class UpcastDemo {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.close();
        notebook.open();
        notebook.turnOff();
        notebook.turnOn();
        Computer computer = new Computer();
        computer.turnOff();
        computer.turnOn();
        Computer computer1 = notebook; // Upcast
        computer1.turnOff();
        computer1.turnOn();
        // computer1.close(); Object has lost his Notebook methods
        // computer1.open();
    }
}
