package ch.bs.fhnw.sna;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

//TODO File einlesen
public class Reader {


    private static final String PATHNAME_DATASET = "src/main/java/resources/rawDataset.csv";

    //TODO File einlesen
    public static void einlesen(){

        FileReader csvFile = null;
        try {
            csvFile = new FileReader("src/main/resources/rawDataset.csv");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        try {
            BufferedReader br;
            //   System.out.println(spamFile.getAbsolutePath().toString()+ " File wird geprüft");
            br = new BufferedReader(csvFile);
            String linie = br.readLine();
          //  System.out.println(linie.toString() + " diese Linie wird geprüft");

            while (linie != null) {
             //   this.wortListeInEmailBefuellen(linie, email);
                linie = br.readLine();
            }

        //    System.out.println("Diese Mail hat " + email.getWoerter().size() + "  Woerter");

        //    spamMails.add(email);

            br.close();

        } catch (FileNotFoundException e) {

            System.out.println("Beim einlesen ist was schief gelaufen");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("Beim einlesen ist was schief gelaufen");
            e.printStackTrace();
        }

    }


    //TODO in File schreiben
    public static void inFileSchreiben(){}
}
