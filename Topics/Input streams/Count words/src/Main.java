import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        int count = 0;
        String line = new String(reader.readLine());
        String[] arrFromLine = line.split(" ");
        for (int i = 0; i < arrFromLine.length; ++i) {
            if (arrFromLine[i].length() > 0) {
                ++count;
            }
        }
        System.out.println(count);
        reader.close();
    }
}