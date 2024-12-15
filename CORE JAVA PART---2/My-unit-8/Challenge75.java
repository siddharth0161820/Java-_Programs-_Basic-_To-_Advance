//Take an array of words and concatenate them into a single string using StringBuilder.

public class Challenge75 {
    public static void main(String[] args) {
        String[] arr = new String[] {"HI","THIS",  "IS","SIDDHARTH", "COMPLETELY" ,"LOST" ,"IN" ,"ALL", "FORMATS",
                        "JUST", "LASTLY", "I","DO", "HAVE", "A", "BIT", "OF", "SENSE", "STILL",
                         "ACTIVATED", "WHICH", "HELPS", "ME", "TO", "RECALL", "MAHADEV", "FOR", "NEW" ,"VERSION", "OF", "ME", 
                         "IN", "AN", "APPROPRIATE", "AND" ,"PROGRESSIVE" ,"MANNER"};

                         //APPEND VIA STRINGBUILDER
                        StringBuilder myStringBuilder = new StringBuilder();
                        //array .for each loop
                        for (String arr2 : arr) {
                            myStringBuilder.append(arr2).append(" ");
                            
                        }
        System.out.println(myStringBuilder);
    }
    
}
