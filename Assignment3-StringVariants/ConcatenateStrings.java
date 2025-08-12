public class ConcatenateStrings {
    
    public String concatedString ="";
    public void operator(String[] liStrings){
        for(String index : liStrings){
            concatedString += index;
        }
        System.out.println("ConcatedString is using Operator : "+concatedString);
    }

    public void stringBuffer(String[] lStrings){
        StringBuffer coStringBuffer = new StringBuffer(concatedString);
        for(String index : lStrings){
            coStringBuffer.append(index);
        }
        System.out.println("ConcatedString is using String Buffer : "+concatedString);
    }

    public void stringBuilder(String[] lStrings){
        StringBuilder coStringBuilder = new StringBuilder(concatedString);
        for(String index : lStrings){
            coStringBuilder.append(index);
        }
        System.out.println("ConcatedString is using String Builder : "+concatedString);
    }


    public static void main(String[] args) {
        ConcatenateStrings concatenateStringsObj = new ConcatenateStrings();
        
        String[] listStrings = {"Dileep", "Naveen", "Mahesh"};
        long start = System.nanoTime();
        concatenateStringsObj.operator(listStrings);
        long end = System.nanoTime();
        System.out.println("Time : "+ (end-start));
        concatenateStringsObj.stringBuffer(listStrings);
        long stringBufferEnd = System.nanoTime();
        System.out.println("Time : "+ (stringBufferEnd-end));
        long stringBuilderEnd = System.nanoTime();
        concatenateStringsObj.stringBuilder(listStrings);
        System.out.println("Time : "+ (stringBuilderEnd-stringBufferEnd));
    }
}
