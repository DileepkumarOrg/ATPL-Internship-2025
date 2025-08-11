public class ConcatenateStrings {
    
    public String concatedString ="";
    public void operator(String[] liStrings){
        for(String index : liStrings){
            concatedString += index;
        }
        System.out.println("ConcatedString is using Operator : "+concatedString+"\n"+"Performance using NanoTime() : "+System.nanoTime());
    }

    public void stringBuffer(String[] lStrings){
        StringBuffer coStringBuffer = new StringBuffer(concatedString);
        for(String index : lStrings){
            coStringBuffer.append(index);
        }
        System.out.println("ConcatedString is using String Buffer : "+concatedString+"\n"+"Performance using NanoTime() : "+System.nanoTime());
    }

    public void stringBuilder(String[] lStrings){
        StringBuilder coStringBuilder = new StringBuilder(concatedString);
        for(String index : lStrings){
            coStringBuilder.append(index);
        }
        System.out.println("ConcatedString is using String Builder : "+concatedString+"\n"+"Performance using NanoTime() : "+System.nanoTime());
    }


    public static void main(String[] args) {
        ConcatenateStrings concatenateStringsObj = new ConcatenateStrings();
        
        String[] listStrings = {"Dileep", "Naveen", "Mahesh"};
        concatenateStringsObj.operator(listStrings);
        concatenateStringsObj.stringBuffer(listStrings);
        concatenateStringsObj.stringBuilder(listStrings);

    }
}
