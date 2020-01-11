package ch.bs.fhnw.sna;

import ch.bs.fhnw.sna.pojo.FussballSpiel;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();

      List<FussballSpiel> fussballSpiele= reader.einlesen();
        reader.statistikFileSchreiben(fussballSpiele);

    }
}
