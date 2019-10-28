public class Abcd {
    public static void main(String[] args) {

        char[] text = new char[]{'a','b','z','d','e','f','g','h','i'};
        char[] find = new char[]{'a','b','c'};
        char[] replace = new char[]{'x','y','z'};
        char[] y = FindReplace(text, find, replace);

        int find(char[]text, char[]find){
        for (int i = 0; i<y.length ; i++){
            System.out.println(y[i]);
        }
    }
    public static char[] FindReplace(char[] text, char[] find, char[]replace){

            for (int i = 0; i<text.length ; i++){
                for (int j = 0; j<find.length ; j++){
        
                    if(text[i]==find[j]){

                        text[i]=replace[i];

                    }

                }

            }
        return text;

    }  
    public static void bro(String[] args) {

        char[] text = new char[]{'a','b','z','d','e','f','g','h','i'};
        char[] find = new char[]{'a','b','c'};
        char[] replace = new char[]{'x','y','z'};
        char[] y = FindReplace(text, find, replace);

             for (int i = 0; i<y.length ; i++){
                 System.out.println(y[i]);
        }
    }

}