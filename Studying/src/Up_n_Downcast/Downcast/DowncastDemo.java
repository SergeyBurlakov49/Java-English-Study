package Up_n_Downcast.Downcast;

import Up_n_Downcast.Computer;
import Up_n_Downcast.Notebook;

public class DowncastDemo {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.close();
        notebook.open();
        notebook.turnOff();
        notebook.turnOn();
        Computer computer = notebook;
        computer.turnOff();
        computer.turnOn();
        // computer.close(); Object has lost his Notebook methods
        // computer.open();
        Notebook notebook1 = (Notebook) computer; // Downcast - correct, but potentially unsafe
        notebook1.close();  // Object has returned his Notebook methods
        notebook1.open();
        notebook1.turnOff();
        notebook1.turnOn();

        Computer computer1 = new Computer();
//        Notebook notebook2 = (Notebook) computer1;  Downcast, incorrect, because initially object was only "Computer"

    }
}
