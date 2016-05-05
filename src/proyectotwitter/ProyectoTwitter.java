package proyectotwitter;

import twitter4j.*;

/**
 *
 * @author mgonzalezlorenzo
 */
public class ProyectoTwitter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
        // TODO code application logic here
        TwitterFactory tf = new TwitterFactory();
        Twitter mitwitter = tf.getInstance();
        Status miStatus = mitwitter.updateStatus("Cuidado con los spoilers @PokemonArray");
        System.out.println(miStatus.getText());
    }
    
}
