package ch.bs.fhnw.sna.pojo;

import java.math.BigInteger;

public class FussballSpiel {
    private String venue_0;
    private String location_1;
    private String status_2;
    private String time_3;
    private String Id_4;
    //  private String humidity;
    private String temp_celsius_6;
    //private String temp_farenheit;
    // private String  wind_speed;
    private String description_9;
    private String attendance_10;
    // private String  officials_0;
    // private String  officials/1;
    // private String  officials/2;
    // private String  officials_3;
    // private String  officials_4;
    // private String  officials_5;
    // private String  officials_6;
    // private String  officials_7;
    // private String  officials_8;
    private String stage_name_20;
    private String Source_21;
    private String Target_22;
    private String datetime_23;
    private String winner_24;
    // private String  winner_code_25;
    // private String  home_team_country_26;
    // private String  home_team_code_27;
    private String home_team_goals_28;
    private String home_team_penalties_29;
    //private String  away_team_country_30;
    //private String  away_team_code_31;
    private String away_team_goals_32;
    private String away_team_penalties_33;
    //private String  home_team_events_0_id_34;
    private String home_team_events_0_type_of_event_35;
    private String home_team_events_0_player36;
    // private String  home_team_events_0_time_37;
    // private String  home_team_events_1_id_38;
    private String home_team_events_1_type_of_event_39;
    private String home_team_events_1_player_40;
    // private String  home_team_events_1_time_41;
    // private String  home_team_events_2_id_42;
    private String home_team_events_2_type_of_event_43;
    private String home_team_events_2_player_44;
    // private String  home_team_events_2_time_45;
    // private String  home_team_events_3_id_46;
    private String home_team_events_3_type_of_event_47;
   private String  home_team_events_3_player_48;
    //home_team_events_3_time_49;
    // home_team_events_4_id_50;
    private String home_team_events_4_type_of_event_51;
    private String home_team_events_4_player_52;
    // home_team_events_4_time_53;
    // home_team_events_5_id_54;
    private String home_team_events_5_type_of_event_55;
    private String home_team_events_5_player_56;
    //private String  home_team_events_5_time;
    //private String  home_team_events_6_id;
    private String home_team_events_6_type_of_event_59;
   private String  home_team_events_6_player_60;
    //private String  home_team_events_6_time;
    //private String  home_team_events_7_id;
    private String home_team_events_7_type_of_event_63;
    private String home_team_events_7_player_64;
    //private String  home_team_events_7_time;
    // private String  home_team_events_8_id;
    private String home_team_events_8_type_of_event_67;
    private String home_team_events_8_player_68;
    //private String   home_team_events_8_time;
    //private String  home_team_events_9_id;
    private String home_team_events_9_type_of_event_71;
    private String home_team_events_9_player_72;
    //private String  home_team_events_9_time;
    //private String  home_team_events_10_id;
    private String home_team_events_10_type_of_event_75;
   private String  home_team_events_10_player_76;
    //private String home_team_events_10_time;
    //private String home_team_events_11_id;
    private String home_team_events_11_type_of_event_79;
     private String home_team_events_11_player_80;
    //private String  home_team_events_11_time;
    //private String  away_team_events_0_id;
    private String away_team_events_0_type_of_event_83;
    private String away_team_events_0_player_84;
    //private String  away_team_events_0_time;
    //private String  away_team_events_1_id;
    private String away_team_events_1_type_of_event_87;
    private String away_team_events_1_player_88;
    // away_team_events_1_time;
    //  away_team_events_2_id;
    private String away_team_events_2_type_of_event_91;
    private String away_team_events_2_player_92;
    //   private String  away_team_events_2_time;
    //   private String  away_team_events_3_id;
    private String away_team_events_3_type_of_event_95;
    private String away_team_events_3_player_96;
    // private String   away_team_events_3_time;
    // private String   away_team_events_4_id;
    private String away_team_events_4_type_of_event_99;
    private String away_team_events_4_player_100;
    // private String    away_team_events_4_time_101;
    //  private String   away_team_events_5_id_102;
    private String away_team_events_5_type_of_event_103;
    private String away_team_events_5_player_104;
    // private String    away_team_events_5_time;
    //  private String   away_team_events_6_id;
    private String away_team_events_6_type_of_event_107;
    private String away_team_events_6_player_108;
    // private String away_team_events_6_time;
    // private String away_team_events_7_id;
    private String away_team_events_7_type_of_event_111;
    private String away_team_events_7_player_112;
    // private String away_team_events_7_time;
    private String home_team_statistics_country_114;
    private String home_team_statistics_attempts_on_goal_115;
    private String home_team_statistics_on_target_116;
    private String home_team_statistics_off_target_117;
    private String home_team_statistics_blocked_118;
    private String home_team_statistics_woodwork_119;
    private String home_team_statistics_corners_120;
    private String home_team_statistics_offsides_121;
    private String home_team_statistics_ball_possession_122;
    private String home_team_statistics_pass_accuracy_123;
    private String home_team_statistics_num_passes_124;
    private String home_team_statistics_passes_completed_125;
    private String home_team_statistics_distance_covered_126;
    private String home_team_statistics_balls_recovered_127;
    private String home_team_statistics_tackles_128;
    private String home_team_statistics_clearances_129;
    private String home_team_statistics_yellow_cards_130;
    private String home_team_statistics_red_cards_131;
    private String home_team_statistics_fouls_committed_132;
    private String home_team_statistics_tactics_133;
    // private String   home_team_statistics_starting_eleven_0_name;
    // private String   home_team_statistics_starting_eleven_0_captain;
    // private String   home_team_statistics_starting_eleven_0_shirt_number;
    // private String   home_team_statistics_starting_eleven_0_position;
    // private String   home_team_statistics_starting_eleven_1_name;
    // private String   home_team_statistics_starting_eleven_1_captain;
    // private String   home_team_statistics_starting_eleven_1_shirt_number_140;
    // private String   home_team_statistics_starting_eleven_1_position;
    // private String   home_team_statistics_starting_eleven_2_name;
    // private String   home_team_statistics_starting_eleven_2_captain;
    // private String   home_team_statistics_starting_eleven_2_shirt_number;
    // private String   home_team_statistics_starting_eleven_2_position;
    // private String   home_team_statistics_starting_eleven_3_name;
    // private String   home_team_statistics_starting_eleven_3_captain;
    // private String   home_team_statistics_starting_eleven_3_shirt_number;
    // private String   home_team_statistics_starting_eleven_3_position;
    // private String   home_team_statistics_starting_eleven_4_name_150;
    // private String   home_team_statistics_starting_eleven_4_captain;
    // private String   home_team_statistics_starting_eleven_4_shirt_number;
    // private String   home_team_statistics_starting_eleven_4_position;
    // private String   home_team_statistics_starting_eleven_5_name;
    // private String   home_team_statistics_starting_eleven_5_captain ;
    // private String   home_team_statistics_starting_eleven_5_shirt_number;
    // private String   home_team_statistics_starting_eleven_5_position;
    // private String   home_team_statistics_starting_eleven_6_name;
    // private String   home_team_statistics_starting_eleven_6_captain;
    // private String   home_team_statistics_starting_eleven_6_shirt_number_160;
    // private String   home_team_statistics_starting_eleven_6_position;
    // private String   home_team_statistics_starting_eleven_7_name;
    // private String   home_team_statistics_starting_eleven_7_captain;
    // private String   home_team_statistics_starting_eleven_7_shirt_number;
    // private String   home_team_statistics_starting_eleven_7_position;
    // private String   home_team_statistics_starting_eleven_8_name;
    // private String   home_team_statistics_starting_eleven_8_captain;
    // private String   home_team_statistics_starting_eleven_8_shirt_number;
    // private String   home_team_statistics_starting_eleven_8_position;
    // private String   home_team_statistics_starting_eleven_9_name_170;
    // private String   home_team_statistics_starting_eleven_9_captain;
    // private String   home_team_statistics_starting_eleven_9_shirt_number;
    // private String   home_team_statistics_starting_eleven_9_position;
    // private String   home_team_statistics_starting_eleven_10_name;
    // private String   home_team_statistics_starting_eleven_10_captain;
    // private String   home_team_statistics_starting_eleven_10_shirt_number;
    // private String   home_team_statistics_starting_eleven_10_position;
    // private String   home_team_statistics_substitutes_0_name;
    // private String   home_team_statistics_substitutes_0_captain;
    // private String   home_team_statistics_substitutes_0_shirt_number_180;
    // private String   home_team_statistics_substitutes_0_position;
    // private String   home_team_statistics_substitutes_1_name;
    // private String   home_team_statistics_substitutes_1_captain;
    // private String   home_team_statistics_substitutes_1_shirt_number;
    // private String   home_team_statistics_substitutes_1_position;
    // private String   home_team_statistics_substitutes_2_name;
    // private String   home_team_statistics_substitutes_2_captain;
    // private String   home_team_statistics_substitutes_2_shirt_number;
    // private String   home_team_statistics_substitutes_2_position;
    // private String   home_team_statistics_substitutes_3_name_190;
    // private String   home_team_statistics_substitutes_3_captain;
    // private String   home_team_statistics_substitutes_3_shirt_number;
    // private String   home_team_statistics_substitutes_3_position;
    // private String   home_team_statistics_substitutes_4_name;
    // private String   home_team_statistics_substitutes_4_captain;
    // private String   home_team_statistics_substitutes_4_shirt_number;
    // private String   home_team_statistics_substitutes_4_position;
    // private String   home_team_statistics_substitutes_5_name;
    // private String   home_team_statistics_substitutes_5_captain;
    // private String   home_team_statistics_substitutes_5_shirt_number_200;
    // private String   home_team_statistics_substitutes_5_position;
    // private String   home_team_statistics_substitutes_6_name;
    // private String   home_team_statistics_substitutes_6_captain;
    // private String   home_team_statistics_substitutes_6_shirt_number;
    // private String   home_team_statistics_substitutes_6_position;
    // private String   home_team_statistics_substitutes_7_name;
    // private String   home_team_statistics_substitutes_7_captain;
    // private String   home_team_statistics_substitutes_7_shirt_number;
    // private String   home_team_statistics_substitutes_7_position;
    // private String   home_team_statistics_substitutes_8_name_210;
    // private String   home_team_statistics_substitutes_8_captain;
    // private String   home_team_statistics_substitutes_8_shirt_number;
    // private String   home_team_statistics_substitutes_8_position;
    // private String   home_team_statistics_substitutes_9_name;
    // private String   home_team_statistics_substitutes_9_captain;
    // private String   home_team_statistics_substitutes_9_shirt_number;
    // private String   home_team_statistics_substitutes_9_position;
    // private String   home_team_statistics_substitutes_10_name;
    // private String   home_team_statistics_substitutes_10_captain;
    // private String   home_team_statistics_substitutes_10_shirt_number_220;
    // private String   home_team_statistics_substitutes_10_position;
    // private String   home_team_statistics_substitutes_11_name;
    // private String   home_team_statistics_substitutes_11_captain;
    // private String   home_team_statistics_substitutes_11_shirt_number;
    // private String   home_team_statistics_substitutes_11_position;
    private String away_team_statistics_country_226;
    private String away_team_statistics_attempts_on_goal_227;
    private String away_team_statistics_on_target_228;
    private String away_team_statistics_off_target_229;
    private String away_team_statistics_blocked_230;
    private String away_team_statistics_woodwork_231;
    private String away_team_statistics_corners_232;
    private String away_team_statistics_offsides_233;
    private String away_team_statistics_ball_possession_234;
    private String away_team_statistics_pass_accuracy_235;
    private String away_team_statistics_num_passes_236;
    private String away_team_statistics_passes_completed_237;
    private String away_team_statistics_distance_covered_238;
    private String away_team_statistics_balls_recovered_239;
    private String away_team_statistics_tackles_240;
    private String away_team_statistics_clearances_241;
    private String away_team_statistics_yellow_cards_242;
    private String away_team_statistics_red_cards_243;
    private String away_team_statistics_fouls_committed_244;
    private String away_team_statistics_tactics_245;
    // private String   away_team_statistics_starting_eleven_0_name;
    // private String   away_team_statistics_starting_eleven_0_captain;
    // private String   away_team_statistics_starting_eleven_0_shirt_number;
    // private String   away_team_statistics_starting_eleven_0_position;
    // private String   away_team_statistics_starting_eleven_1_name;
    // private String   away_team_statistics_starting_eleven_1_captain;
    // private String   away_team_statistics_starting_eleven_1_shirt_number;
    // private String   away_team_statistics_starting_eleven_1_position;
    // private String   away_team_statistics_starting_eleven_2_name;
    // private String   away_team_statistics_starting_eleven_2_captain;
    // private String   away_team_statistics_starting_eleven_2_shirt_number;
    // private String   away_team_statistics_starting_eleven_2_position;
    // private String   away_team_statistics_starting_eleven_3_name;
    // private String   away_team_statistics_starting_eleven_3_captain;
    // private String   away_team_statistics_starting_eleven_3_shirt_number;
    // private String   away_team_statistics_starting_eleven_3_position;
    // private String   away_team_statistics_starting_eleven_4_name;
    // private String   away_team_statistics_starting_eleven_4_captain;
    // private String   away_team_statistics_starting_eleven_4_shirt_number;
    // private String   away_team_statistics_starting_eleven_4_position;
    // private String   away_team_statistics_starting_eleven_5_name;
    // private String   away_team_statistics_starting_eleven_5_captain;
    // private String   away_team_statistics_starting_eleven_5_shirt_number;
    // private String   away_team_statistics_starting_eleven_5_position;
    // private String   away_team_statistics_starting_eleven_6_name;
    // private String   away_team_statistics_starting_eleven_6_captain;
    // private String   away_team_statistics_starting_eleven_6_shirt_number;
    // private String   away_team_statistics_starting_eleven_6_position;
    // private String   away_team_statistics_starting_eleven_7_name;
    // private String   away_team_statistics_starting_eleven_7_captain;
    // private String   away_team_statistics_starting_eleven_7_shirt_number;
    // private String   away_team_statistics_starting_eleven_7_position;
    // private String   away_team_statistics_starting_eleven_8_name;
    // private String   away_team_statistics_starting_eleven_8_captain;
    // private String   away_team_statistics_starting_eleven_8_shirt_number;
    // private String   away_team_statistics_starting_eleven_8_position;
    // private String   away_team_statistics_starting_eleven_9_name;
    // private String   away_team_statistics_starting_eleven_9_captain;
    // private String   away_team_statistics_starting_eleven_9_shirt_number;
    // private String   away_team_statistics_starting_eleven_9_position;
    // private String   away_team_statistics_starting_eleven_10_name;
    // private String   away_team_statistics_starting_eleven_10_captain;
    // private String   away_team_statistics_starting_eleven_10_shirt_number;
    // private String   away_team_statistics_starting_eleven_10_position;
    // private String   away_team_statistics_substitutes_0_name;
    // private String   away_team_statistics_substitutes_0_captain;
    // private String   away_team_statistics_substitutes_0_shirt_number;
    // private String   away_team_statistics_substitutes_0_position;
    // private String   away_team_statistics_substitutes_1_name;
    // private String   away_team_statistics_substitutes_1_captain;
    // private String   away_team_statistics_substitutes_1_shirt_number;
    // private String   away_team_statistics_substitutes_1_position;
    // private String   away_team_statistics_substitutes_2_name;
    // private String   away_team_statistics_substitutes_2_captain;
    // private String   away_team_statistics_substitutes_2_shirt_number;
    // private String   away_team_statistics_substitutes_2_position;
    // private String   away_team_statistics_substitutes_3_name;
    // private String   away_team_statistics_substitutes_3_captain;
    // private String   away_team_statistics_substitutes_3_shirt_number;
    // private String   away_team_statistics_substitutes_3_position;
    // private String   away_team_statistics_substitutes_4_name;
    // private String   away_team_statistics_substitutes_4_captain;
    // private String   away_team_statistics_substitutes_4_shirt_number;
    // private String   away_team_statistics_substitutes_4_position;
    // private String   away_team_statistics_substitutes_5_name;
    // private String   away_team_statistics_substitutes_5_captain;
    // private String   away_team_statistics_substitutes_5_shirt_number;
    // private String   away_team_statistics_substitutes_5_position;
    // private String   away_team_statistics_substitutes_6_name;
    // private String   away_team_statistics_substitutes_6_captain;
    // private String   away_team_statistics_substitutes_6_shirt_number;
    // private String   away_team_statistics_substitutes_6_position;
    // private String   away_team_statistics_substitutes_7_name;
    // private String   away_team_statistics_substitutes_7_captain;
    // private String   away_team_statistics_substitutes_7_shirt_number;
    // private String   away_team_statistics_substitutes_7_position;
    // private String   away_team_statistics_substitutes_8_name;
    // private String   away_team_statistics_substitutes_8_captain;
    // private String   away_team_statistics_substitutes_8_shirt_number;
    // private String   away_team_statistics_substitutes_8_position;
    // private String   away_team_statistics_substitutes_9_name;
    // private String   away_team_statistics_substitutes_9_captain;
    // private String   away_team_statistics_substitutes_9_shirt_number;
    // private String   away_team_statistics_substitutes_9_position;
    // private String   away_team_statistics_substitutes_10_name;
    // private String   away_team_statistics_substitutes_10_captain;
    // private String   away_team_statistics_substitutes_10_shirt_number;
    // private String   away_team_statistics_substitutes_10_position;
    // private String   away_team_statistics_substitutes_11_name;
    // private String   away_team_statistics_substitutes_11_captain;
    // private String   away_team_statistics_substitutes_11_shirt_number;
    // private String   away_team_statistics_substitutes_11_position;
    // private String   last_event_update_at;
    // private String   last_score_update_at;
    //private String   away_team_events_8_id;
    private String away_team_events_8_type_of_event;
    private String away_team_events_8_player;
    // private String   away_team_events_8_time;
    // private String   away_team_events_9_id;
    private String away_team_events_9_type_of_event;
    private String away_team_events_9_player;
    // private String   away_team_events_9_time;
    // private String   away_team_events_10_id;
    private String away_team_events_10_type_of_event;
    private String away_team_events_10_player;
    // private String   away_team_events_10_time;
    // private String   away_team_events_11_id;
    private String away_team_events_11_type_of_event;
    private String away_team_events_11_player;
    // private String   away_team_events_11_time;
    // private String   away_team_events_12_id;
    private String away_team_events_12_type_of_event;
    private String away_team_events_12_player;
    // private String   away_team_events_12_time;
    // private String   away_team_events_13_id;
    private String away_team_events_13_type_of_event;
    private String away_team_events_13_player;
    // private String   away_team_events_13_time;
    // private String   away_team_events_14_id;
    private String away_team_events_14_type_of_event;
    private String away_team_events_14_player;
    // private String   away_team_events_14_time;
    // private String   home_team_events_12_id;
    private String home_team_events_12_type_of_event;
    private String home_team_events_12_player;
    // private String   home_team_events_12_time;
    // private String   away_team_events_15_id;
    private String away_team_events_15_type_of_event;
    private String away_team_events_15_player;
    // private String   away_team_events_15_time;
    // private String   home_team_events_13_id;
    private String home_team_events_13_type_of_event;
    private String home_team_events_13_player;
    // private String   home_team_events_13_time;
    // private String   home_team_events_14_id;
    private String home_team_events_14_type_of_event;
    private String home_team_events_14_player;
    // private String   home_team_events_14_time;

    public String getVenue_0() {
        return venue_0;
    }

    public void setVenue_0(String venue_0) {
        this.venue_0 = venue_0;
    }

    public String getLocation_1() {
        return location_1;
    }

    public void setLocation_1(String location_1) {
        this.location_1 = location_1;
    }

    public String getStatus_2() {
        return status_2;
    }

    public void setStatus_2(String status_2) {
        this.status_2 = status_2;
    }

    public String getTime_3() {
        return time_3;
    }

    public void setTime_3(String time_3) {
        this.time_3 = time_3;
    }

    public String getId_4() {
        return Id_4;
    }

    public void setId_4(String id_4) {
        Id_4 = id_4;
    }

    public String getTemp_celsius_6() {
        return temp_celsius_6;
    }

    public void setTemp_celsius_6(String temp_celsius_6) {
        this.temp_celsius_6 = temp_celsius_6;
    }

    public String getDescription_9() {
        return description_9;
    }

    public void setDescription_9(String description_9) {
        this.description_9 = description_9;
    }

    public String getAttendance_10() {
        return attendance_10;
    }

    public void setAttendance_10(String attendance_10) {
        this.attendance_10 = attendance_10;
    }

    public String getStage_name_20() {
        return stage_name_20;
    }

    public void setStage_name_20(String stage_name_20) {
        this.stage_name_20 = stage_name_20;
    }

    public String getSource_21() {
        return Source_21;
    }

    public void setSource_21(String source_21) {
        Source_21 = source_21;
    }

    public String getTarget_22() {
        return Target_22;
    }

    public void setTarget_22(String target_22) {
        Target_22 = target_22;
    }

    public String getDatetime_23() {
        return datetime_23;
    }

    public void setDatetime_23(String datetime_23) {
        this.datetime_23 = datetime_23;
    }

    public String getWinner_24() {
        return winner_24;
    }

    public void setWinner_24(String winner_24) {
        this.winner_24 = winner_24;
    }

    public String getHome_team_goals_28() {
        return home_team_goals_28;
    }

    public void setHome_team_goals_28(String home_team_goals_28) {
        this.home_team_goals_28 = home_team_goals_28;
    }

    public String getHome_team_penalties_29() {
        return home_team_penalties_29;
    }

    public void setHome_team_penalties_29(String home_team_penalties_29) {
        this.home_team_penalties_29 = home_team_penalties_29;
    }

    public String getAway_team_goals_32() {
        return away_team_goals_32;
    }

    public void setAway_team_goals_32(String away_team_goals_32) {
        this.away_team_goals_32 = away_team_goals_32;
    }

    public String getAway_team_penalties_33() {
        return away_team_penalties_33;
    }

    public void setAway_team_penalties_33(String away_team_penalties_33) {
        this.away_team_penalties_33 = away_team_penalties_33;
    }

    public String getHome_team_events_0_type_of_event_35() {
        return home_team_events_0_type_of_event_35;
    }

    public void setHome_team_events_0_type_of_event_35(String home_team_events_0_type_of_event_35) {
        this.home_team_events_0_type_of_event_35 = home_team_events_0_type_of_event_35;
    }

    public String getHome_team_events_0_player36() {
        return home_team_events_0_player36;
    }

    public void setHome_team_events_0_player36(String home_team_events_0_player36) {
        this.home_team_events_0_player36 = home_team_events_0_player36;
    }

    public String getHome_team_events_1_type_of_event_39() {
        return home_team_events_1_type_of_event_39;
    }

    public void setHome_team_events_1_type_of_event_39(String home_team_events_1_type_of_event_39) {
        this.home_team_events_1_type_of_event_39 = home_team_events_1_type_of_event_39;
    }

    public String getHome_team_events_1_player_40() {
        return home_team_events_1_player_40;
    }

    public void setHome_team_events_1_player_40(String home_team_events_1_player_40) {
        this.home_team_events_1_player_40 = home_team_events_1_player_40;
    }

    public String getHome_team_events_2_type_of_event_43() {
        return home_team_events_2_type_of_event_43;
    }

    public void setHome_team_events_2_type_of_event_43(String home_team_events_2_type_of_event_43) {
        this.home_team_events_2_type_of_event_43 = home_team_events_2_type_of_event_43;
    }

    public String getHome_team_events_2_player_44() {
        return home_team_events_2_player_44;
    }

    public void setHome_team_events_2_player_44(String home_team_events_2_player_44) {
        this.home_team_events_2_player_44 = home_team_events_2_player_44;
    }

    public String getHome_team_events_3_type_of_event_47() {
        return home_team_events_3_type_of_event_47;
    }

    public void setHome_team_events_3_type_of_event_47(String home_team_events_3_type_of_event_47) {
        this.home_team_events_3_type_of_event_47 = home_team_events_3_type_of_event_47;
    }

    public String getHome_team_events_3_player_48() {
        return home_team_events_3_player_48;
    }

    public void setHome_team_events_3_player_48(String home_team_events_3_player_48) {
        this.home_team_events_3_player_48 = home_team_events_3_player_48;
    }

    public String getHome_team_events_4_type_of_event_51() {
        return home_team_events_4_type_of_event_51;
    }

    public void setHome_team_events_4_type_of_event_51(String home_team_events_4_type_of_event_51) {
        this.home_team_events_4_type_of_event_51 = home_team_events_4_type_of_event_51;
    }

    public String getHome_team_events_4_player_52() {
        return home_team_events_4_player_52;
    }

    public void setHome_team_events_4_player_52(String home_team_events_4_player_52) {
        this.home_team_events_4_player_52 = home_team_events_4_player_52;
    }

    public String getHome_team_events_5_type_of_event_55() {
        return home_team_events_5_type_of_event_55;
    }

    public void setHome_team_events_5_type_of_event_55(String home_team_events_5_type_of_event_55) {
        this.home_team_events_5_type_of_event_55 = home_team_events_5_type_of_event_55;
    }

    public String getHome_team_events_5_player_56() {
        return home_team_events_5_player_56;
    }

    public void setHome_team_events_5_player_56(String home_team_events_5_player_56) {
        this.home_team_events_5_player_56 = home_team_events_5_player_56;
    }

    public String getHome_team_events_6_type_of_event_59() {
        return home_team_events_6_type_of_event_59;
    }

    public void setHome_team_events_6_type_of_event_59(String home_team_events_6_type_of_event_59) {
        this.home_team_events_6_type_of_event_59 = home_team_events_6_type_of_event_59;
    }

    public String getHome_team_events_6_player_60() {
        return home_team_events_6_player_60;
    }

    public void setHome_team_events_6_player_60(String home_team_events_6_player_60) {
        this.home_team_events_6_player_60 = home_team_events_6_player_60;
    }

    public String getHome_team_events_7_type_of_event_63() {
        return home_team_events_7_type_of_event_63;
    }

    public void setHome_team_events_7_type_of_event_63(String home_team_events_7_type_of_event_63) {
        this.home_team_events_7_type_of_event_63 = home_team_events_7_type_of_event_63;
    }

    public String getHome_team_events_7_player_64() {
        return home_team_events_7_player_64;
    }

    public void setHome_team_events_7_player_64(String home_team_events_7_player_64) {
        this.home_team_events_7_player_64 = home_team_events_7_player_64;
    }

    public String getHome_team_events_8_type_of_event_67() {
        return home_team_events_8_type_of_event_67;
    }

    public void setHome_team_events_8_type_of_event_67(String home_team_events_8_type_of_event_67) {
        this.home_team_events_8_type_of_event_67 = home_team_events_8_type_of_event_67;
    }

    public String getHome_team_events_8_player_68() {
        return home_team_events_8_player_68;
    }

    public void setHome_team_events_8_player_68(String home_team_events_8_player_68) {
        this.home_team_events_8_player_68 = home_team_events_8_player_68;
    }

    public String getHome_team_events_9_type_of_event_71() {
        return home_team_events_9_type_of_event_71;
    }

    public void setHome_team_events_9_type_of_event_71(String home_team_events_9_type_of_event_71) {
        this.home_team_events_9_type_of_event_71 = home_team_events_9_type_of_event_71;
    }

    public String getHome_team_events_9_player_72() {
        return home_team_events_9_player_72;
    }

    public void setHome_team_events_9_player_72(String home_team_events_9_player_72) {
        this.home_team_events_9_player_72 = home_team_events_9_player_72;
    }

    public String getHome_team_events_10_type_of_event_75() {
        return home_team_events_10_type_of_event_75;
    }

    public void setHome_team_events_10_type_of_event_75(String home_team_events_10_type_of_event_75) {
        this.home_team_events_10_type_of_event_75 = home_team_events_10_type_of_event_75;
    }

    public String getHome_team_events_10_player_76() {
        return home_team_events_10_player_76;
    }

    public void setHome_team_events_10_player_76(String home_team_events_10_player_76) {
        this.home_team_events_10_player_76 = home_team_events_10_player_76;
    }

    public String getHome_team_events_11_type_of_event_79() {
        return home_team_events_11_type_of_event_79;
    }

    public void setHome_team_events_11_type_of_event_79(String home_team_events_11_type_of_event_79) {
        this.home_team_events_11_type_of_event_79 = home_team_events_11_type_of_event_79;
    }

    public String getHome_team_events_11_player_80() {
        return home_team_events_11_player_80;
    }

    public void setHome_team_events_11_player_80(String home_team_events_11_player_80) {
        this.home_team_events_11_player_80 = home_team_events_11_player_80;
    }

    public String getAway_team_events_0_type_of_event_83() {
        return away_team_events_0_type_of_event_83;
    }

    public void setAway_team_events_0_type_of_event_83(String away_team_events_0_type_of_event_83) {
        this.away_team_events_0_type_of_event_83 = away_team_events_0_type_of_event_83;
    }

    public String getAway_team_events_0_player_84() {
        return away_team_events_0_player_84;
    }

    public void setAway_team_events_0_player_84(String away_team_events_0_player_84) {
        this.away_team_events_0_player_84 = away_team_events_0_player_84;
    }

    public String getAway_team_events_1_type_of_event_87() {
        return away_team_events_1_type_of_event_87;
    }

    public void setAway_team_events_1_type_of_event_87(String away_team_events_1_type_of_event_87) {
        this.away_team_events_1_type_of_event_87 = away_team_events_1_type_of_event_87;
    }

    public String getAway_team_events_1_player_88() {
        return away_team_events_1_player_88;
    }

    public void setAway_team_events_1_player_88(String away_team_events_1_player_88) {
        this.away_team_events_1_player_88 = away_team_events_1_player_88;
    }

    public String getAway_team_events_2_type_of_event_91() {
        return away_team_events_2_type_of_event_91;
    }

    public void setAway_team_events_2_type_of_event_91(String away_team_events_2_type_of_event_91) {
        this.away_team_events_2_type_of_event_91 = away_team_events_2_type_of_event_91;
    }

    public String getAway_team_events_2_player_92() {
        return away_team_events_2_player_92;
    }

    public void setAway_team_events_2_player_92(String away_team_events_2_player_92) {
        this.away_team_events_2_player_92 = away_team_events_2_player_92;
    }

    public String getAway_team_events_3_type_of_event_95() {
        return away_team_events_3_type_of_event_95;
    }

    public void setAway_team_events_3_type_of_event_95(String away_team_events_3_type_of_event_95) {
        this.away_team_events_3_type_of_event_95 = away_team_events_3_type_of_event_95;
    }

    public String getAway_team_events_3_player_96() {
        return away_team_events_3_player_96;
    }

    public void setAway_team_events_3_player_96(String away_team_events_3_player_96) {
        this.away_team_events_3_player_96 = away_team_events_3_player_96;
    }

    public String getAway_team_events_4_type_of_event_99() {
        return away_team_events_4_type_of_event_99;
    }

    public void setAway_team_events_4_type_of_event_99(String away_team_events_4_type_of_event_99) {
        this.away_team_events_4_type_of_event_99 = away_team_events_4_type_of_event_99;
    }

    public String getAway_team_events_4_player_100() {
        return away_team_events_4_player_100;
    }

    public void setAway_team_events_4_player_100(String away_team_events_4_player_100) {
        this.away_team_events_4_player_100 = away_team_events_4_player_100;
    }

    public String getAway_team_events_5_type_of_event_103() {
        return away_team_events_5_type_of_event_103;
    }

    public void setAway_team_events_5_type_of_event_103(String away_team_events_5_type_of_event_103) {
        this.away_team_events_5_type_of_event_103 = away_team_events_5_type_of_event_103;
    }

    public String getAway_team_events_5_player_104() {
        return away_team_events_5_player_104;
    }

    public void setAway_team_events_5_player_104(String away_team_events_5_player_104) {
        this.away_team_events_5_player_104 = away_team_events_5_player_104;
    }

    public String getAway_team_events_6_type_of_event_107() {
        return away_team_events_6_type_of_event_107;
    }

    public void setAway_team_events_6_type_of_event_107(String away_team_events_6_type_of_event_107) {
        this.away_team_events_6_type_of_event_107 = away_team_events_6_type_of_event_107;
    }

    public String getAway_team_events_6_player_108() {
        return away_team_events_6_player_108;
    }

    public void setAway_team_events_6_player_108(String away_team_events_6_player_108) {
        this.away_team_events_6_player_108 = away_team_events_6_player_108;
    }

    public String getAway_team_events_7_type_of_event_111() {
        return away_team_events_7_type_of_event_111;
    }

    public void setAway_team_events_7_type_of_event_111(String away_team_events_7_type_of_event_111) {
        this.away_team_events_7_type_of_event_111 = away_team_events_7_type_of_event_111;
    }

    public String getAway_team_events_7_player_112() {
        return away_team_events_7_player_112;
    }

    public void setAway_team_events_7_player_112(String away_team_events_7_player_112) {
        this.away_team_events_7_player_112 = away_team_events_7_player_112;
    }

    public String getHome_team_statistics_country_114() {
        return home_team_statistics_country_114;
    }

    public void setHome_team_statistics_country_114(String home_team_statistics_country_114) {
        this.home_team_statistics_country_114 = home_team_statistics_country_114;
    }

    public String getHome_team_statistics_attempts_on_goal_115() {
        return home_team_statistics_attempts_on_goal_115;
    }

    public void setHome_team_statistics_attempts_on_goal_115(String home_team_statistics_attempts_on_goal_115) {
        this.home_team_statistics_attempts_on_goal_115 = home_team_statistics_attempts_on_goal_115;
    }

    public String getHome_team_statistics_on_target_116() {
        return home_team_statistics_on_target_116;
    }

    public void setHome_team_statistics_on_target_116(String home_team_statistics_on_target_116) {
        this.home_team_statistics_on_target_116 = home_team_statistics_on_target_116;
    }

    public String getHome_team_statistics_off_target_117() {
        return home_team_statistics_off_target_117;
    }

    public void setHome_team_statistics_off_target_117(String home_team_statistics_off_target_117) {
        this.home_team_statistics_off_target_117 = home_team_statistics_off_target_117;
    }

    public String getHome_team_statistics_blocked_118() {
        return home_team_statistics_blocked_118;
    }

    public void setHome_team_statistics_blocked_118(String home_team_statistics_blocked_118) {
        this.home_team_statistics_blocked_118 = home_team_statistics_blocked_118;
    }

    public String getHome_team_statistics_woodwork_119() {
        return home_team_statistics_woodwork_119;
    }

    public void setHome_team_statistics_woodwork_119(String home_team_statistics_woodwork_119) {
        this.home_team_statistics_woodwork_119 = home_team_statistics_woodwork_119;
    }

    public String getHome_team_statistics_corners_120() {
        return home_team_statistics_corners_120;
    }

    public void setHome_team_statistics_corners_120(String home_team_statistics_corners_120) {
        this.home_team_statistics_corners_120 = home_team_statistics_corners_120;
    }

    public String getHome_team_statistics_offsides_121() {
        return home_team_statistics_offsides_121;
    }

    public void setHome_team_statistics_offsides_121(String home_team_statistics_offsides_121) {
        this.home_team_statistics_offsides_121 = home_team_statistics_offsides_121;
    }

    public String getHome_team_statistics_ball_possession_122() {
        return home_team_statistics_ball_possession_122;
    }

    public void setHome_team_statistics_ball_possession_122(String home_team_statistics_ball_possession_122) {
        this.home_team_statistics_ball_possession_122 = home_team_statistics_ball_possession_122;
    }

    public String getHome_team_statistics_pass_accuracy_123() {
        return home_team_statistics_pass_accuracy_123;
    }

    public void setHome_team_statistics_pass_accuracy_123(String home_team_statistics_pass_accuracy_123) {
        this.home_team_statistics_pass_accuracy_123 = home_team_statistics_pass_accuracy_123;
    }

    public String getHome_team_statistics_num_passes_124() {
        return home_team_statistics_num_passes_124;
    }

    public void setHome_team_statistics_num_passes_124(String home_team_statistics_num_passes_124) {
        this.home_team_statistics_num_passes_124 = home_team_statistics_num_passes_124;
    }

    public String getHome_team_statistics_passes_completed_125() {
        return home_team_statistics_passes_completed_125;
    }

    public void setHome_team_statistics_passes_completed_125(String home_team_statistics_passes_completed_125) {
        this.home_team_statistics_passes_completed_125 = home_team_statistics_passes_completed_125;
    }

    public String getHome_team_statistics_distance_covered_126() {
        return home_team_statistics_distance_covered_126;
    }

    public void setHome_team_statistics_distance_covered_126(String home_team_statistics_distance_covered_126) {
        this.home_team_statistics_distance_covered_126 = home_team_statistics_distance_covered_126;
    }

    public String getHome_team_statistics_balls_recovered_127() {
        return home_team_statistics_balls_recovered_127;
    }

    public void setHome_team_statistics_balls_recovered_127(String home_team_statistics_balls_recovered_127) {
        this.home_team_statistics_balls_recovered_127 = home_team_statistics_balls_recovered_127;
    }

    public String getHome_team_statistics_tackles_128() {
        return home_team_statistics_tackles_128;
    }

    public void setHome_team_statistics_tackles_128(String home_team_statistics_tackles_128) {
        this.home_team_statistics_tackles_128 = home_team_statistics_tackles_128;
    }

    public String getHome_team_statistics_clearances_129() {
        return home_team_statistics_clearances_129;
    }

    public void setHome_team_statistics_clearances_129(String home_team_statistics_clearances_129) {
        this.home_team_statistics_clearances_129 = home_team_statistics_clearances_129;
    }

    public String getHome_team_statistics_yellow_cards_130() {
        return home_team_statistics_yellow_cards_130;
    }

    public void setHome_team_statistics_yellow_cards_130(String home_team_statistics_yellow_cards_130) {
        this.home_team_statistics_yellow_cards_130 = home_team_statistics_yellow_cards_130;
    }

    public String getHome_team_statistics_red_cards_131() {
        return home_team_statistics_red_cards_131;
    }

    public void setHome_team_statistics_red_cards_131(String home_team_statistics_red_cards_131) {
        this.home_team_statistics_red_cards_131 = home_team_statistics_red_cards_131;
    }

    public String getHome_team_statistics_fouls_committed_132() {
        return home_team_statistics_fouls_committed_132;
    }

    public void setHome_team_statistics_fouls_committed_132(String home_team_statistics_fouls_committed_132) {
        this.home_team_statistics_fouls_committed_132 = home_team_statistics_fouls_committed_132;
    }

    public String getHome_team_statistics_tactics_133() {
        return home_team_statistics_tactics_133;
    }

    public void setHome_team_statistics_tactics_133(String home_team_statistics_tactics_133) {
        this.home_team_statistics_tactics_133 = home_team_statistics_tactics_133;
    }

    public String getAway_team_statistics_country_226() {
        return away_team_statistics_country_226;
    }

    public void setAway_team_statistics_country_226(String away_team_statistics_country_226) {
        this.away_team_statistics_country_226 = away_team_statistics_country_226;
    }

    public String getAway_team_statistics_attempts_on_goal_227() {
        return away_team_statistics_attempts_on_goal_227;
    }

    public void setAway_team_statistics_attempts_on_goal_227(String away_team_statistics_attempts_on_goal_227) {
        this.away_team_statistics_attempts_on_goal_227 = away_team_statistics_attempts_on_goal_227;
    }

    public String getAway_team_statistics_on_target_228() {
        return away_team_statistics_on_target_228;
    }

    public void setAway_team_statistics_on_target_228(String away_team_statistics_on_target_228) {
        this.away_team_statistics_on_target_228 = away_team_statistics_on_target_228;
    }

    public String getAway_team_statistics_off_target_229() {
        return away_team_statistics_off_target_229;
    }

    public void setAway_team_statistics_off_target_229(String away_team_statistics_off_target_229) {
        this.away_team_statistics_off_target_229 = away_team_statistics_off_target_229;
    }

    public String getAway_team_statistics_blocked_230() {
        return away_team_statistics_blocked_230;
    }

    public void setAway_team_statistics_blocked_230(String away_team_statistics_blocked_230) {
        this.away_team_statistics_blocked_230 = away_team_statistics_blocked_230;
    }

    public String getAway_team_statistics_woodwork_231() {
        return away_team_statistics_woodwork_231;
    }

    public void setAway_team_statistics_woodwork_231(String away_team_statistics_woodwork_231) {
        this.away_team_statistics_woodwork_231 = away_team_statistics_woodwork_231;
    }

    public String getAway_team_statistics_corners_232() {
        return away_team_statistics_corners_232;
    }

    public void setAway_team_statistics_corners_232(String away_team_statistics_corners_232) {
        this.away_team_statistics_corners_232 = away_team_statistics_corners_232;
    }

    public String getAway_team_statistics_offsides_233() {
        return away_team_statistics_offsides_233;
    }

    public void setAway_team_statistics_offsides_233(String away_team_statistics_offsides_233) {
        this.away_team_statistics_offsides_233 = away_team_statistics_offsides_233;
    }

    public String getAway_team_statistics_ball_possession_234() {
        return away_team_statistics_ball_possession_234;
    }

    public void setAway_team_statistics_ball_possession_234(String away_team_statistics_ball_possession_234) {
        this.away_team_statistics_ball_possession_234 = away_team_statistics_ball_possession_234;
    }

    public String getAway_team_statistics_pass_accuracy_235() {
        return away_team_statistics_pass_accuracy_235;
    }

    public void setAway_team_statistics_pass_accuracy_235(String away_team_statistics_pass_accuracy_235) {
        this.away_team_statistics_pass_accuracy_235 = away_team_statistics_pass_accuracy_235;
    }

    public String getAway_team_statistics_num_passes_236() {
        return away_team_statistics_num_passes_236;
    }

    public void setAway_team_statistics_num_passes_236(String away_team_statistics_num_passes_236) {
        this.away_team_statistics_num_passes_236 = away_team_statistics_num_passes_236;
    }

    public String getAway_team_statistics_passes_completed_237() {
        return away_team_statistics_passes_completed_237;
    }

    public void setAway_team_statistics_passes_completed_237(String away_team_statistics_passes_completed_237) {
        this.away_team_statistics_passes_completed_237 = away_team_statistics_passes_completed_237;
    }

    public String getAway_team_statistics_distance_covered_238() {
        return away_team_statistics_distance_covered_238;
    }

    public void setAway_team_statistics_distance_covered_238(String away_team_statistics_distance_covered_238) {
        this.away_team_statistics_distance_covered_238 = away_team_statistics_distance_covered_238;
    }

    public String getAway_team_statistics_balls_recovered_239() {
        return away_team_statistics_balls_recovered_239;
    }

    public void setAway_team_statistics_balls_recovered_239(String away_team_statistics_balls_recovered_239) {
        this.away_team_statistics_balls_recovered_239 = away_team_statistics_balls_recovered_239;
    }

    public String getAway_team_statistics_tackles_240() {
        return away_team_statistics_tackles_240;
    }

    public void setAway_team_statistics_tackles_240(String away_team_statistics_tackles_240) {
        this.away_team_statistics_tackles_240 = away_team_statistics_tackles_240;
    }

    public String getAway_team_statistics_clearances_241() {
        return away_team_statistics_clearances_241;
    }

    public void setAway_team_statistics_clearances_241(String away_team_statistics_clearances_241) {
        this.away_team_statistics_clearances_241 = away_team_statistics_clearances_241;
    }

    public String getAway_team_statistics_yellow_cards_242() {
        return away_team_statistics_yellow_cards_242;
    }

    public void setAway_team_statistics_yellow_cards_242(String away_team_statistics_yellow_cards_242) {
        this.away_team_statistics_yellow_cards_242 = away_team_statistics_yellow_cards_242;
    }

    public String getAway_team_statistics_red_cards_243() {
        return away_team_statistics_red_cards_243;
    }

    public void setAway_team_statistics_red_cards_243(String away_team_statistics_red_cards_243) {
        this.away_team_statistics_red_cards_243 = away_team_statistics_red_cards_243;
    }

    public String getAway_team_statistics_fouls_committed_244() {
        return away_team_statistics_fouls_committed_244;
    }

    public void setAway_team_statistics_fouls_committed_244(String away_team_statistics_fouls_committed_244) {
        this.away_team_statistics_fouls_committed_244 = away_team_statistics_fouls_committed_244;
    }

    public String getAway_team_statistics_tactics_245() {
        return away_team_statistics_tactics_245;
    }

    public void setAway_team_statistics_tactics_245(String away_team_statistics_tactics_245) {
        this.away_team_statistics_tactics_245 = away_team_statistics_tactics_245;
    }

    public String getAway_team_events_8_type_of_event() {
        return away_team_events_8_type_of_event;
    }

    public void setAway_team_events_8_type_of_event(String away_team_events_8_type_of_event) {
        this.away_team_events_8_type_of_event = away_team_events_8_type_of_event;
    }

    public String getAway_team_events_8_player() {
        return away_team_events_8_player;
    }

    public void setAway_team_events_8_player(String away_team_events_8_player) {
        this.away_team_events_8_player = away_team_events_8_player;
    }

    public String getAway_team_events_9_type_of_event() {
        return away_team_events_9_type_of_event;
    }

    public void setAway_team_events_9_type_of_event(String away_team_events_9_type_of_event) {
        this.away_team_events_9_type_of_event = away_team_events_9_type_of_event;
    }

    public String getAway_team_events_9_player() {
        return away_team_events_9_player;
    }

    public void setAway_team_events_9_player(String away_team_events_9_player) {
        this.away_team_events_9_player = away_team_events_9_player;
    }

    public String getAway_team_events_10_type_of_event() {
        return away_team_events_10_type_of_event;
    }

    public void setAway_team_events_10_type_of_event(String away_team_events_10_type_of_event) {
        this.away_team_events_10_type_of_event = away_team_events_10_type_of_event;
    }

    public String getAway_team_events_10_player() {
        return away_team_events_10_player;
    }

    public void setAway_team_events_10_player(String away_team_events_10_player) {
        this.away_team_events_10_player = away_team_events_10_player;
    }

    public String getAway_team_events_11_type_of_event() {
        return away_team_events_11_type_of_event;
    }

    public void setAway_team_events_11_type_of_event(String away_team_events_11_type_of_event) {
        this.away_team_events_11_type_of_event = away_team_events_11_type_of_event;
    }

    public String getAway_team_events_11_player() {
        return away_team_events_11_player;
    }

    public void setAway_team_events_11_player(String away_team_events_11_player) {
        this.away_team_events_11_player = away_team_events_11_player;
    }

    public String getAway_team_events_12_type_of_event() {
        return away_team_events_12_type_of_event;
    }

    public void setAway_team_events_12_type_of_event(String away_team_events_12_type_of_event) {
        this.away_team_events_12_type_of_event = away_team_events_12_type_of_event;
    }

    public String getAway_team_events_12_player() {
        return away_team_events_12_player;
    }

    public void setAway_team_events_12_player(String away_team_events_12_player) {
        this.away_team_events_12_player = away_team_events_12_player;
    }

    public String getAway_team_events_13_type_of_event() {
        return away_team_events_13_type_of_event;
    }

    public void setAway_team_events_13_type_of_event(String away_team_events_13_type_of_event) {
        this.away_team_events_13_type_of_event = away_team_events_13_type_of_event;
    }

    public String getAway_team_events_13_player() {
        return away_team_events_13_player;
    }

    public void setAway_team_events_13_player(String away_team_events_13_player) {
        this.away_team_events_13_player = away_team_events_13_player;
    }

    public String getAway_team_events_14_type_of_event() {
        return away_team_events_14_type_of_event;
    }

    public void setAway_team_events_14_type_of_event(String away_team_events_14_type_of_event) {
        this.away_team_events_14_type_of_event = away_team_events_14_type_of_event;
    }

    public String getAway_team_events_14_player() {
        return away_team_events_14_player;
    }

    public void setAway_team_events_14_player(String away_team_events_14_player) {
        this.away_team_events_14_player = away_team_events_14_player;
    }

    public String getHome_team_events_12_type_of_event() {
        return home_team_events_12_type_of_event;
    }

    public void setHome_team_events_12_type_of_event(String home_team_events_12_type_of_event) {
        this.home_team_events_12_type_of_event = home_team_events_12_type_of_event;
    }

    public String getHome_team_events_12_player() {
        return home_team_events_12_player;
    }

    public void setHome_team_events_12_player(String home_team_events_12_player) {
        this.home_team_events_12_player = home_team_events_12_player;
    }

    public String getAway_team_events_15_type_of_event() {
        return away_team_events_15_type_of_event;
    }

    public void setAway_team_events_15_type_of_event(String away_team_events_15_type_of_event) {
        this.away_team_events_15_type_of_event = away_team_events_15_type_of_event;
    }

    public String getAway_team_events_15_player() {
        return away_team_events_15_player;
    }

    public void setAway_team_events_15_player(String away_team_events_15_player) {
        this.away_team_events_15_player = away_team_events_15_player;
    }

    public String getHome_team_events_13_type_of_event() {
        return home_team_events_13_type_of_event;
    }

    public void setHome_team_events_13_type_of_event(String home_team_events_13_type_of_event) {
        this.home_team_events_13_type_of_event = home_team_events_13_type_of_event;
    }

    public String getHome_team_events_13_player() {
        return home_team_events_13_player;
    }

    public void setHome_team_events_13_player(String home_team_events_13_player) {
        this.home_team_events_13_player = home_team_events_13_player;
    }

    public String getHome_team_events_14_type_of_event() {
        return home_team_events_14_type_of_event;
    }

    public void setHome_team_events_14_type_of_event(String home_team_events_14_type_of_event) {
        this.home_team_events_14_type_of_event = home_team_events_14_type_of_event;
    }

    public String getHome_team_events_14_player() {
        return home_team_events_14_player;
    }

    public void setHome_team_events_14_player(String home_team_events_14_player) {
        this.home_team_events_14_player = home_team_events_14_player;
    }
}
