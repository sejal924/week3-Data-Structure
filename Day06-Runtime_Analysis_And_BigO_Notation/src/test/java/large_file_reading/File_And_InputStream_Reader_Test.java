package large_file_reading;

import org.example.large_file_reading.File_And_InputStream_Reader;
import org.junit.jupiter.api.Test;

public class File_And_InputStream_Reader_Test {
    @Test
    void Test(){
        String filePath = "src\\main\\java\\org\\example\\large_file_reading\\Sample1.txt";
        double start,end;
        start = System.nanoTime();
        File_And_InputStream_Reader.fileReader(filePath);
        end = System.nanoTime();
        System.out.println("Time Taken by FileReader: "+ (end-start)/1000+ "ms");

        start = System.nanoTime();
        File_And_InputStream_Reader.inputStreamReader(filePath);
        end = System.nanoTime();
        System.out.println("Time Taken by InputStreamReader: "+ (end-start)/1000+ "ms");

        String filePath1 = "src\\main\\java\\org\\example\\large_file_reading\\Sample2.txt";
        start = System.nanoTime();
        File_And_InputStream_Reader.fileReader(filePath1);
        end = System.nanoTime();
        System.out.println("Time Taken by FileReader: "+ (end-start)/1000+ "ms");

        start = System.nanoTime();
        File_And_InputStream_Reader.inputStreamReader(filePath1);
        end = System.nanoTime();
        System.out.println("Time Taken by InputStreamReader: "+ (end-start)/1000+ "ms");

    }
}
