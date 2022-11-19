import java.io.*;
import java.util.ArrayList;
public class impledgetechnoprblm {

    public static void main(String[] args) throws IOException {

        String Input1 = "C:\\Users\\jyoti\\Downloads\\Input_01.txt";
        solve(Input1);
        System.out.println();

        String Input2 = "C:\\Users\\jyoti\\Downloads\\Input_02.txt";

        solve(Input2);
    }

    public static ArrayList<String> getdata(String filename) throws IOException {
        File f = new File(filename);
        String path = f.getAbsolutePath();

        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String string;

        ArrayList<String> array = new ArrayList<>();

        while ((string = br.readLine()) != null) {
            array.add(string);
        }

        return array;
    }

    static int nodesize = 26;

    static class DigitalTree {
        word.DigitalTree children[];
        boolean wordend;

        DigitalTree() {
            children = new word.DigitalTree[nodesize];
            for (int i = 0; i < nodesize; i++)
                children[i] = null;

            wordend = false;
        }}

        static void insert(word.DigitalTree root, String word) {
            word.DigitalTree pCrawl = root;

            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (pCrawl.children[index] == null)
                    pCrawl.children[index] = new word.DigitalTree();


                pCrawl = pCrawl.children[index];
            }
            pCrawl.wordend = true;
        }

        static boolean search(word.DigitalTree root, String word) {
            word.DigitalTree pCrawl = root;

            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (pCrawl.children[index] == null)
                    return false;

                pCrawl = pCrawl.children[index];
            }
            return (pCrawl != null && pCrawl.wordend);
        }

        static boolean compoundedword(String str, word.DigitalTree root, int length) {
            int size = str.length();

            if (size == 0)
                return true;

            for (int i = 1; i <= size; i++) {

                if (search(root, str.substring(0, i)) && compoundedword(str.substring(i, size), root, length)) {
                    if (length != str.length()) return true;
                    if (size - i == 0) return false;
                    return true;
                }

            }

            return false;
        }

        public static void solve(String filename) throws IOException {


            long startTime = System.nanoTime();

            ArrayList<String> listOfWords = getdata(filename);

            word.DigitalTree root = new word.DigitalTree();

            for (String s : listOfWords)
                insert(root, s);

            String firstAnswer = "";
            String secondAnswer = "";
            for (String str : listOfWords) {
                if (compoundedword(str, root, str.length())) {

                    if (str.length() > firstAnswer.length()) {
                        secondAnswer = firstAnswer;
                        firstAnswer = str;
                    } else if (str.length() > secondAnswer.length()) {
                        secondAnswer = str;
                    }
                }
            }

            System.out.println("Longest Compound Word: " + firstAnswer);
            System.out.println("Second Longest Compound Word: " + secondAnswer);
            System.out.println("Execution Time: " + (System.nanoTime() - startTime) / 1e6 + "ms");

        }



}
