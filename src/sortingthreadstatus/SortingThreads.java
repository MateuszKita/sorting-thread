package sortingthreadstatus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class SortingThreads extends javax.swing.JFrame {

    public int numberOfThreads = 4;
    static int flag = 0;

    List<String> filesNames = new ArrayList<>();
    List<List<Integer>> dataFromFiles = new ArrayList<>();

    public SortingThreads() {
        initComponents();
    }

    private static String getField(String line) {
        return line.split(" ")[0];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        thread1 = new javax.swing.JProgressBar();
        thread2 = new javax.swing.JProgressBar();
        thread3 = new javax.swing.JProgressBar();
        thread4 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setText("This program sorts files using Threads");

        jLabel1.setText("Thread 1");

        jLabel2.setText("Thread 2");

        jLabel3.setText("Thread 3");

        jLabel4.setText("Thread 4");

        jButton1.setText("Run Sorting");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        console.setColumns(20);
        console.setRows(5);
        jScrollPane1.setViewportView(console);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("Console:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(thread2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(thread1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(thread3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(thread4, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(thread1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(thread2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(thread3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(thread4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        File folder = new File("P:\\GitHub\\git-flow\\SortingThreadStatus\\src\\files\\read");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile() && file.getName().endsWith(".txt")) {
                filesNames.add(file.getName());
            }
        }

        int filesAmount = filesNames.size();

        console.append("\n-------------------------LIST OF FILES---------------------------------");
        for (int i = 0; i < filesAmount; i++) {
            try {
                console.append("\n" + filesNames.get(i));
                BufferedReader br;
                br = new BufferedReader(new FileReader("P:\\GitHub\\git-flow\\SortingThreadStatus\\src\\files\\read\\" + filesNames.get(i)));
                List<Integer> numbers = new ArrayList<>();
                String line = null;

                while ((line = br.readLine()) != null) {
                    String[] strNumbers = line.split(" ");
                    for (String strNumber : strNumbers) {
                        numbers.add(Integer.parseInt(strNumber));
                    }
                }

                dataFromFiles.add(numbers);

                br.close();
            } catch (IOException ex) {
                Logger.getLogger(SortingThreads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        SortingThread th1 = new SortingThread(thread1, 10);
        SortingThread th2 = new SortingThread(thread2, 20);
        SortingThread th3 = new SortingThread(thread3, 30);
        SortingThread th4 = new SortingThread(thread4, 40);

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Checking");
                if (flag < filesAmount) {
                    if (!th1.isAlive() && flag < filesAmount) {
                        SortingThread th1 = new SortingThread(thread1, 10);
                        System.out.println(!th4.isAlive());
                        th1.start();
                    }
                    if (!th2.isAlive() && flag < filesAmount) {
                        SortingThread th2 = new SortingThread(thread2, 20);
                        System.out.println(!th2.isAlive());
                        th2.start();
                    }
                    if (!th3.isAlive() && flag < filesAmount) {
                        SortingThread th3 = new SortingThread(thread3, 30);
                        System.out.println(!th3.isAlive());
                        th3.start();
                    }
                    if (!th4.isAlive() && flag < filesAmount) {
                        SortingThread th4 = new SortingThread(thread4, 40);
                        System.out.println(!th4.isAlive());
                        th4.start();
                    }
                } else {
                    t.cancel();
                    return;
                }
            }
        }, 0, 800);
    }//GEN-LAST:event_jButton1ActionPerformed

    public class SortingThread extends Thread {

        int time;
//        List<Integer> arrayFragment;
//        String fileName;
        JProgressBar progressBar;

        SortingThread(JProgressBar progressBar, int time) {
            this.progressBar = progressBar;
            this.time = time;
        }

        @Override
        public void run() {
            if (flag < filesNames.size()) {
                try {
                    sleep(time);
                    progressBar.setValue(0);
                    sleep(200);
                    progressBar.setValue(20);
                    sleep(200);
                    progressBar.setValue(40);
                    sleep(200);
                    progressBar.setValue(60);
                    sleep(200);
                    progressBar.setValue(80);
                    sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SortingThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(dataFromFiles.get(flag));
//                System.out.println("\n\n---------" + flag);
                Collections.sort(dataFromFiles.get(flag));
                BufferedWriter out;
                try {
                    out = new BufferedWriter(new FileWriter("P:\\GitHub\\git-flow\\SortingThreadStatus\\src\\files\\write\\" + filesNames.get(flag)));
                    out.write(dataFromFiles.get(flag).toString());
                    out.close();
                    progressBar.setValue(100);
                    ++flag;
                } catch (IOException ex) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

//    public void sort(int filesAmount) throws InterruptedException {
//        for (int i = 0; i < filesAmount; i++) {
//            if (flag < filesAmount) {
//                SortingThread th1 = new SortingThread(thread1);
//                flag++;
//                th1.start();
//            }
//            if (flag < filesAmount) {
//                SortingThread th2 = new SortingThread(thread2);
//                flag++;
//                th2.start();
//            }
//            if (flag < filesAmount) {
//                SortingThread th3 = new SortingThread(thread3);
//                flag++;
//                th3.start();
//            }
//            if (flag < filesAmount) {
//                SortingThread th4 = new SortingThread(thread4);
//                flag++;
//                th4.start();
//            }
//        }
//    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new SortingThreads().setVisible(true);
        });
    }

    public void init() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingThreads.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SortingThreads.this.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea console;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar thread1;
    private javax.swing.JProgressBar thread2;
    private javax.swing.JProgressBar thread3;
    private javax.swing.JProgressBar thread4;
    // End of variables declaration//GEN-END:variables

}
