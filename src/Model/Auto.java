package Model;

public class Auto {
    private int id;
    private String nomeModello;
    private int anno;
    private String brand;


    public Auto() {
    }

    public Auto(int id, String nomeModello, int anno, String brand) {
        this.id = id;
        this.nomeModello = nomeModello;
        this.anno = anno;
        this.brand = brand;
    }
    public int getIdAuto() {
    return id;}

    public String getNomeModello(){
    return nomeModello;}

    public String getBrand(){
    return brand;}

    public int getAnno(){
    return anno;}

    public void  setIdAuto(int id) {
        this.id = id;}

    public void setNomeModello(String nomeModello){
        this.nomeModello = nomeModello;}

    public void setBrand(String brand){
        this.brand = brand;}

    public void setAnno(int anno){
        this.anno = anno;}

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return  id  + nomeModello +  brand  + anno;
    }

}

