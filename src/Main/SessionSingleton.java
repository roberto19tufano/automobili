package Main;



        import java.io.FileInputStream;

        import java.io.InputStream;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.util.Properties;

/*
 * La Classe ConnectionSingleton implementa il pattern di progettazione Singleton, PER DETTAGLI VEDI GUIDA SEZIONE n. 10
 * Nello specifico implementa e fornisce un metodo sicuro ed efficace per la connessione con il nostro database
 */

public class SessionSingleton {

    private static Connection session = null;


    private static int id;


    /*
     * Costruttore vuoto in quanto esso non ha mai bisogno di essere instanziato
     */
    private SessionSingleton() {
    }

    /*
     * La funzione getInstance() � il cuore del pattern Singleton , essa infatti restituisce in output sempre la stesso dato
     * che quindi se modificato verr� modificato la modifica avverr� a tutte le chiamate.
     * All'interno della funzione si spiega passo per passo l'implementazione attuale
     */
    public static Connection getInstance() {
        // eseguo un controllo per assicurarmi che non sia la prima instanza del dato
        if (session == null) {
            // nel caso sia la prima volta procedo con l'eseguire la connessione al database che rimarr� quindi la stessa
            // per tutto il corso del programma.
            // & il costrutto try/catch � utilizzato principalmente per la gestione degli errori, maggiori info SEZIONE 1.
            try {
                // creo un nuovo oggetto properties
                Properties properties = new Properties();
                // tramite un inputStream, nello specifico un FileInputStream, carico le propriet� presenti nel file specificato
                InputStream inputStream = new FileInputStream("config.properties");
                properties.load(inputStream);
                /*
                 *a questo punto recupero dalle propriet� le varie specifiche di cui necessitiamo
                 * a seconda del database utilizzato esse saranno diverse di volta in volta
                 * le varie specifiche sono facilmente recuperabili sulla rete, modificare di conseguenza il file config.properties
                 * PS: quelle di base necessitano solo la modifica del nome del database
                 */
                String vendor = properties.getProperty("db.vendor");
                String driver = properties.getProperty("db.driver");
                String host = properties.getProperty("db.host");
                String port = properties.getProperty("db.port");
                String dbName = properties.getProperty("db.name");
                String username = properties.getProperty("db.username");
                String password = properties.getProperty("db.password");
                String jdbcAdditionalParams = properties.getProperty("db.jdbc_params");

                Class<?> c = Class.forName(driver);
                System.out.println("Ho caricato: " + c.getName());
                // compongo la stringa di connessione al database
                String url = "jdbc:" + vendor + "://" + host + ":" + port + "/" + dbName+"?"+jdbcAdditionalParams;
                // eseguo la connessione al database
                session = DriverManager.getConnection(url, username, password);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // restituisco in output la connessione al database
        // essendo la classe un Singleton una volta creata la prima instanza restituir� sempre la stessa
        return session;
    }



    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        SessionSingleton.id = id;
    }




}
