import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        int tempByte = inputStream.read();
        while (tempByte != -1) {
            System.out.print(tempByte);
            tempByte = inputStream.read();
        }
        inputStream.close();
    }
}