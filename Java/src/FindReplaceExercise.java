public class FindReplaceExercise {
        public static void main(String[] args) {
            testCase1();
            testCase2();
            findAndReplace(null, null, null);
        }
       
        public static int findAndReplace(char[] text, char[] find, char[] replace) {
           int i;
        for(i=0; i<text.length; i++){
                    int j;
            for( j=0; j<find.length; j++){

                 if(text[j+i]!= find[j]){
                 break;
            }
        }
            if (j == find.length){
                 return i;
             }
        }
            return -1;
        }
       
         public static void testCase1() {
            System.out.println("testCase1");
            char[] text = "João Batista Coelho, ou melhor, Slow J é um músico português que nasceu e viveu na cidade de Setúbal até aos 8 anos...".toCharArray();
            char[] find = "Batista".toCharArray();
            char[] replace = "Batxsta".toCharArray();
            char[] result = findAndReplace(text, find, replace);
            
            assertEquals("João Batxsta Coelho, ou melhor, Slow J é um músico português que nasceu e viveu na cidade de Setúbal até aos 8 anos...".toCharArray(),
                result, "Should replace all occurrence of 'Batista' by 'Batxsta'");
        }
        public static void testCase2() {
            System.out.println("testCase2");
            char[] text = "João Batista Coelho, ou melhor, Slow J é um músico português que nasceu e viveu na cidade de Setúbal até aos 8 anos...".toCharArray();
            char[] find = "músico inglês".toCharArray();
            char[] replace = "músico qwerty".toCharArray();
            char[] result = findAndReplace(text, find, replace);
            assertEquals("João Batista Coelho, ou melhor, Slow J é um músico português que nasceu e viveu na cidade de Setúbal até aos 8 anos...".toCharArray(),
                result, "Should not replace anything");
        }
        public static void assertEquals(char[] expected, char[] actual, String message) {
            if (expected.equals(actual)) {
                System.out.println("OK");
            } else {
                System.err.println("Failed: " + message);
            }
        }
    }