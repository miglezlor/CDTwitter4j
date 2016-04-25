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
        
        Status mistatus = mitwitter.updateStatus(" --Prueba-- ");
        System.out.println(mistatus.getText());
        
        
//        List<Status> statuses = mitwitter.getHomeTimeline();
//        System.out.println("Timeline: ");
//        for (Status status : statuses) {
//            System.out.println(status.getUser().getName() + ":" +status.getText());
//        }
//        
//        Query query = new Query("");
//        QueryResult result = mitwitter.search(query);
//        for (Status status : result.getTweets()) {
//            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
//        }
    
    }
}
