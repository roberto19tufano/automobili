package View;

import java.util.Scanner;

public abstract class AbstractView implements IView {

    private Scanner scanner;

    /**
     *Questo metodo � usato da tutti i controller che lo ereditano (non devono definirlo) estendendo questa classe
     */
    public String getInput() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
