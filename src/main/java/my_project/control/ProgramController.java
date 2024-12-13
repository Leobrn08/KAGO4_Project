package my_project.control;


import KAGO_framework.control.ViewController;
import my_project.model.*;


/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern.
 * Hinweise:
 * - Der Konstruktor sollte nicht geändert werden.
 * - Sowohl die startProgram()- als auch die updateProgram(...)-Methoden müssen vorhanden sein und ihre Signatur sollte
 *   nicht geändert werden
 * - Zusätzliche Methoden sind natürlich gar kein Problem
 */
public class ProgramController {


    //Attribute




    // Referenzen
    private final ViewController viewController; // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.
    private Busch firstBush;
    private House firstHouse; // deklariert eine Referenz für ein Objekt der Klasse House
    private House secondHouse;
    private Tree firstTree;
    private Cloud firstCloud;
    private Sonne firstSonne;


    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }


    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen. Hier sollte also alles geregelt werden,
     * was zu diesem Zeipunkt passieren muss.
     */
    public void startProgram() {
        // Erstelle ein Objekt der Klasse House und initialisiere damit die Referenz house1
        firstHouse = new House(150,300,200,240);
        //secondHouse = new House(600,300,200,240);
        firstTree = new Tree(100,300,20,240);
        firstCloud = new Cloud(100, 100, 75);
        firstSonne = new Sonne(0,0,150);
        // Teile dem ViewController-Objekt mit, dass das House-Objekt gezeichnet werden soll
        viewController.draw(firstHouse);
        //viewController.draw(secondHouse);
        viewController.draw(firstSonne);
        viewController.draw(firstTree);
        viewController.draw(firstCloud);
        viewController.draw(secondHouse);
    }


    /**
     * Diese Methode wird vom ViewController-Objekt automatisch mit jedem Frame aufgerufen (ca. 60mal pro Sekunde)
     * @param dt Zeit seit letztem Frame in Sekunden
     */
    public void updateProgram(double dt){


    }
}
