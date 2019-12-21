package ch.bs.fhnw.sna;

import ch.bs.fhnw.sna.pojo.FussballSpiel;

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
    public void einlesen() {
        List<FussballSpiel> fussballSpiele = new ArrayList<>();

        int counter = 0;
        FileReader csvFile = null;
        try {
            csvFile = new FileReader("src/main/resources/rawDataset.csv");
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        try {
            BufferedReader br;
            br = new BufferedReader(csvFile);
            String game = br.readLine();

            while (game != null) {

                game = br.readLine();
                if(game !=null) {
                    String[] spielAttributeArray = game.split(",");
                   // System.out.println(spielAttributeArray[0]);
                    FussballSpiel fussballSpiel = this.fussballspielbefüllen(spielAttributeArray);

                    fussballSpiele.add(fussballSpiel);
                    counter++;
                }
            }

           // System.out.println(counter);
            br.close();


        } catch (FileNotFoundException e) {

            System.out.println("Beim einlesen ist was schief gelaufen");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("Beim einlesen ist was schief gelaufen");
            e.printStackTrace();
        }
        //System.out.println(counter);
        System.out.println(fussballSpiele.size());
    }

    //TODO Alle Attr befüllen
    private FussballSpiel fussballspielbefüllen(String[] spielAttribute) {
        FussballSpiel fussballSpiel = new FussballSpiel();
        fussballSpiel.setVenue_0(spielAttribute[0]);
        fussballSpiel.setLocation_1(spielAttribute[1]);
        fussballSpiel.setStatus_2(spielAttribute[2]);
        fussballSpiel.setTime_3(spielAttribute[3]);
        fussballSpiel.setId_4(spielAttribute[4]);
        fussballSpiel.setTemp_celsius_6(spielAttribute[6]);
        fussballSpiel.setDescription_9(spielAttribute[9]);
        fussballSpiel.setAttendance_10(spielAttribute[10]);
        fussballSpiel.setStage_name_20(spielAttribute[20]);
        fussballSpiel.setSource_21(spielAttribute[21]);
        fussballSpiel.setTarget_22(spielAttribute[22]);
        fussballSpiel.setDatetime_23(spielAttribute[23]);
        fussballSpiel.setWinner_24(spielAttribute[24]);
        fussballSpiel.setHome_team_goals_28(spielAttribute[28]);
        fussballSpiel.setHome_team_penalties_29(spielAttribute[29]);
        fussballSpiel.setAway_team_goals_32(spielAttribute[32]);
        fussballSpiel.setAway_team_penalties_33(spielAttribute[33]);
        fussballSpiel.setHome_team_events_0_type_of_event_35(spielAttribute[35]);
        fussballSpiel.setHome_team_events_0_player36(spielAttribute[36]);
        fussballSpiel.setHome_team_events_1_type_of_event_39(spielAttribute[39]);
        fussballSpiel.setHome_team_events_1_player_40(spielAttribute[40]);
        fussballSpiel.setHome_team_events_2_type_of_event_43(spielAttribute[43]);
        fussballSpiel.setHome_team_events_2_player_44(spielAttribute[44]);
        fussballSpiel.setHome_team_events_3_type_of_event_47(spielAttribute[47]);
        fussballSpiel.setHome_team_events_3_player_48(spielAttribute[48]);
        fussballSpiel.setHome_team_events_4_type_of_event_51(spielAttribute[51]);
        fussballSpiel.setHome_team_events_4_player_52(spielAttribute[52]);
        fussballSpiel.setHome_team_events_5_type_of_event_55(spielAttribute[55]);
        fussballSpiel.setHome_team_events_5_player_56(spielAttribute[56]);
        fussballSpiel.setHome_team_events_6_type_of_event_59(spielAttribute[59]);
        fussballSpiel.setHome_team_events_6_player_60(spielAttribute[60]);
        fussballSpiel.setHome_team_events_7_type_of_event_63(spielAttribute[63]);
        fussballSpiel.setHome_team_events_7_player_64(spielAttribute[64]);
        fussballSpiel.setHome_team_events_8_type_of_event_67(spielAttribute[67]);
        fussballSpiel.setHome_team_events_8_player_68(spielAttribute[68]);
        fussballSpiel.setHome_team_events_9_type_of_event_71(spielAttribute[71]);
        fussballSpiel.setHome_team_events_9_player_72(spielAttribute[72]);
        fussballSpiel.setHome_team_events_10_type_of_event_75(spielAttribute[75]);
        fussballSpiel.setHome_team_events_10_player_76(spielAttribute[76]);
        fussballSpiel.setHome_team_events_11_type_of_event_79(spielAttribute[79]);
        fussballSpiel.setHome_team_events_11_player_80(spielAttribute[80]);
        fussballSpiel.setAway_team_events_0_type_of_event_83(spielAttribute[83]);
        fussballSpiel.setAway_team_events_0_player_84(spielAttribute[84]);
        fussballSpiel.setAway_team_events_1_type_of_event_87(spielAttribute[87]);
        fussballSpiel.setAway_team_events_1_player_88(spielAttribute[88]);
        fussballSpiel.setAway_team_events_2_type_of_event_91(spielAttribute[91]);
        fussballSpiel.setAway_team_events_2_player_92(spielAttribute[92]);
        fussballSpiel.setAway_team_events_3_type_of_event_95(spielAttribute[95]);
        fussballSpiel.setAway_team_events_3_player_96(spielAttribute[96]);
        fussballSpiel.setAway_team_events_4_type_of_event_99(spielAttribute[99]);
        fussballSpiel.setAway_team_events_4_player_100(spielAttribute[100]);


        return fussballSpiel;

    }

    //TODO in File schreiben
    public void statistikFileSchreiben() {
    }
}
