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
                if (game != null) {
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
        fussballSpiel.setAway_team_events_5_type_of_event_103(spielAttribute[103]);
        fussballSpiel.setAway_team_events_5_player_104(spielAttribute[104]);
        fussballSpiel.setAway_team_events_6_type_of_event_107(spielAttribute[107]);
        fussballSpiel.setAway_team_events_6_player_108(spielAttribute[108]);
        fussballSpiel.setAway_team_events_7_type_of_event_111(spielAttribute[111]);
        fussballSpiel.setAway_team_events_7_player_112(spielAttribute[112]);
        fussballSpiel.setHome_team_statistics_country_114(spielAttribute[114]);
        fussballSpiel.setHome_team_statistics_attempts_on_goal_115(spielAttribute[115]);
        fussballSpiel.setHome_team_statistics_on_target_116(spielAttribute[116]);
        fussballSpiel.setHome_team_statistics_off_target_117(spielAttribute[117]);
        fussballSpiel.setHome_team_statistics_blocked_118(spielAttribute[118]);
        fussballSpiel.setHome_team_statistics_woodwork_119(spielAttribute[119]);
        fussballSpiel.setHome_team_statistics_corners_120(spielAttribute[120]);
        fussballSpiel.setHome_team_statistics_offsides_121(spielAttribute[121]);

        fussballSpiel.setHome_team_statistics_ball_possession_122(spielAttribute[122]);
        fussballSpiel.setHome_team_statistics_pass_accuracy_123(spielAttribute[123]);
        fussballSpiel.setHome_team_statistics_num_passes_124(spielAttribute[124]);
        fussballSpiel.setHome_team_statistics_passes_completed_125(spielAttribute[125]);
        fussballSpiel.setHome_team_statistics_distance_covered_126(spielAttribute[126]);
        fussballSpiel.setHome_team_statistics_balls_recovered_127(spielAttribute[127]);
        fussballSpiel.setHome_team_statistics_tackles_128(spielAttribute[128]);
        fussballSpiel.setHome_team_statistics_clearances_129(spielAttribute[129]);
        fussballSpiel.setHome_team_statistics_yellow_cards_130(spielAttribute[130]);
        fussballSpiel.setHome_team_statistics_red_cards_131(spielAttribute[131]);
        fussballSpiel.setHome_team_statistics_fouls_committed_132(spielAttribute[132]);
        fussballSpiel.setHome_team_statistics_tactics_133(spielAttribute[133]);
        fussballSpiel.setAway_team_statistics_country_226(spielAttribute[226]);
        fussballSpiel.setAway_team_statistics_attempts_on_goal_227(spielAttribute[227]);
        fussballSpiel.setAway_team_statistics_on_target_228(spielAttribute[228]);
        fussballSpiel.setAway_team_statistics_off_target_229(spielAttribute[229]);
        fussballSpiel.setAway_team_statistics_blocked_230(spielAttribute[230]);
        fussballSpiel.setAway_team_statistics_woodwork_231(spielAttribute[231]);
        fussballSpiel.setAway_team_statistics_corners_232(spielAttribute[232]);
        fussballSpiel.setAway_team_statistics_offsides_233(spielAttribute[233]);
        fussballSpiel.setAway_team_statistics_ball_possession_234(spielAttribute[234]);
        fussballSpiel.setAway_team_statistics_pass_accuracy_235(spielAttribute[235]);
        fussballSpiel.setAway_team_statistics_num_passes_236(spielAttribute[236]);
        fussballSpiel.setAway_team_statistics_passes_completed_237(spielAttribute[237]);
        fussballSpiel.setAway_team_statistics_distance_covered_238(spielAttribute[238]);
        fussballSpiel.setAway_team_statistics_balls_recovered_239(spielAttribute[239]);
        fussballSpiel.setAway_team_statistics_tackles_240(spielAttribute[240]);
        fussballSpiel.setAway_team_statistics_clearances_241(spielAttribute[241]);
        fussballSpiel.setAway_team_statistics_yellow_cards_242(spielAttribute[242]);
        fussballSpiel.setAway_team_statistics_red_cards_243(spielAttribute[243]);
        fussballSpiel.setAway_team_statistics_fouls_committed_244(spielAttribute[244]);
        fussballSpiel.setAway_team_statistics_tactics_245(spielAttribute[245]);
        fussballSpiel.setAway_team_events_8_type_of_event_341(spielAttribute[341]);
        fussballSpiel.setAway_team_events_8_player_342(spielAttribute[342]);
        fussballSpiel.setAway_team_events_9_type_of_event_345(spielAttribute[345]);
        fussballSpiel.setAway_team_events_9_player_346(spielAttribute[346]);
        fussballSpiel.setAway_team_events_10_type_of_event_349(spielAttribute[349]);
        fussballSpiel.setAway_team_events_10_player_350(spielAttribute[350]);
        fussballSpiel.setAway_team_events_11_type_of_event_353(spielAttribute[353]);
        fussballSpiel.setAway_team_events_11_player_354(spielAttribute[354]);
        fussballSpiel.setAway_team_events_12_type_of_event_357(spielAttribute[357]);
        fussballSpiel.setAway_team_events_12_player_358(spielAttribute[358]);
        fussballSpiel.setAway_team_events_13_type_of_event_361(spielAttribute[361]);
        fussballSpiel.setAway_team_events_13_player_362(spielAttribute[362]);
        fussballSpiel.setAway_team_events_14_type_of_event_365(spielAttribute[365]);
        fussballSpiel.setAway_team_events_14_player_366(spielAttribute[366]);
        fussballSpiel.setHome_team_events_12_type_of_event_369(spielAttribute[369]);
        fussballSpiel.setHome_team_events_12_player_370(spielAttribute[370]);
        fussballSpiel.setAway_team_events_15_type_of_event_373(spielAttribute[373]);
        fussballSpiel.setAway_team_events_15_player_374(spielAttribute[374]);
        fussballSpiel.setHome_team_events_13_type_of_event_377(spielAttribute[377]);
        fussballSpiel.setHome_team_events_13_player_378(spielAttribute[378]);
        fussballSpiel.setHome_team_events_14_type_of_event_381(spielAttribute[381]);
        fussballSpiel.setHome_team_events_14_player_382(spielAttribute[382]);


        return fussballSpiel;

    }

    //TODO in File schreiben
    public void statistikFileSchreiben() {
    }
}
