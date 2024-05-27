public class WordReverse {
    public static void main(String arr[]){
       String str = "Happy to See You";
       String SplitArr[] = str.split(" ");
       for(int i=SplitArr.length-1; i>=0;i--){
          System.out.print(SplitArr[i]);
       } 
    }
}
