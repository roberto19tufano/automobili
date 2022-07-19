package Main;

class Main{
public static void main (String[] args){
    System.out.println("Ciao!");
    MainDispatcher.getInstance().callAction("CasaAutomobilisticaController", "doControl", null);

}
        }