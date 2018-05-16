package sortingthreadstatus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {

    List<Integer> arrayFragment;
    String fileName;
    

    MyThread(List<Integer> numbers, String fileName) {
        this.arrayFragment = numbers;
        this.fileName = fileName;
    }

    public void run() {
        Collections.sort(arrayFragment);
        BufferedWriter out;
        try {
            out = new BufferedWriter(new FileWriter("P:\\GitHub\\sorting-thread\\src\\files\\write\\" + fileName));
//            System.out.println(arrayFragment.toString());
            out.write(arrayFragment.toString());
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    String getValue() {
        return this.arrayFragment.toString();
    }
}
