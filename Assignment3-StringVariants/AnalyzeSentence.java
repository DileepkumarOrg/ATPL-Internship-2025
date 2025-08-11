public class AnalyzeSentence {

    public static void main(String[] args) {
        String sentense ="Learning Java is fun and interesting";
        String[] words = sentense.split(" ");
        System.out.println("Number of Words in Sentense : "+words.length);
        System.out.println("First Occurance of 'i':  "+sentense.indexOf("i"));
        System.out.println("Last Occurance of 'i' :  "+sentense.lastIndexOf("i"));
        System.out.println("Is Sentense Starts With 'Learn': "+sentense.startsWith("Learn"));
        System.out.println("Is Sentense ends With 'ing': "+sentense.endsWith("ing"));

    }
}
