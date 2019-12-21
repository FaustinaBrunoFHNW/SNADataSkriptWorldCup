package ch.bs.fhnw.sna.pojo;

import java.math.BigInteger;

public class FussballSpiel {
    private String venue;
    private String location;
    private String status;
    private String time;
    private String Id;
    //  private String humidity;
    private String temp_celsius;
    //private String temp_farenheit;
    // private String  wind_speed;
    private String description;
    private String attendance;
    // private String  officials_0;
    // private String  officials/1;
    // private String  officials/2;
    // private String  officials_3;
    // private String  officials_4;
    // private String  officials_5;
    // private String  officials_6;
    // private String  officials_7;
    // private String  officials_8;
    private String stage_name;
    private String Source;
    private String Target;
    private String datetime;
    private String winner;
    // private String  winner_code;
    // private String  home_team_country;
    // private String  home_team_code;
    private String home_team_goals;
    private String home_team_penalties;
    //private String  away_team_country;
    //private String  away_team_code;
    private String away_team_goals;
    private String away_team_penalties;
    //private String  home_team_events_0_id;
    private String home_team_events_0_type_of_event;
    private String home_team_events_0_player;
    // private String  home_team_events_0_time;
    // private String  home_team_events_1_id;
    private String home_team_events_1_type_of_event;
    private String home_team_events_1_player;
    // private String  home_team_events_1_time;
    // private String  home_team_events_2_id;
    private String home_team_events_2_type_of_event;
    private String home_team_events_2_player;
    // private String  home_team_events_2_time;
    // private String  home_team_events_3_id;
    private String home_team_events_3_type_of_event;
   private String  home_team_events_3_player;
    //home_team_events_3_time;
    // home_team_events_4_id;
    private String home_team_events_4_type_of_event;
    private String home_team_events_4_player;
    // home_team_events_4_time; home_team_events_5_id;
    private String home_team_events_5_type_of_event;
    private String home_team_events_5_player;
    //private String  home_team_events_5_time;
    //private String  home_team_events_6_id;
    private String home_team_events_6_type_of_event;
   private String  home_team_events_6_player;
    //private String  home_team_events_6_time;
    //private String  home_team_events_7_id;
    private String home_team_events_7_type_of_event;
    private String home_team_events_7_player;
    //private String  home_team_events_7_time;
    // private String  home_team_events_8_id;
    private String home_team_events_8_type_of_event;
    private String home_team_events_8_player;
    //private String   home_team_events_8_time;
    //private String  home_team_events_9_id;
    private String home_team_events_9_type_of_event;
    private String home_team_events_9_player;
    //private String  home_team_events_9_time;
    //private String  home_team_events_10_id;
    private String home_team_events_10_type_of_event;
   private String  home_team_events_10_player;
    //private String home_team_events_10_time;
    //private String home_team_events_11_id;
    private String home_team_events_11_type_of_event;
     private String home_team_events_11_player;
    //private String  home_team_events_11_time;
    //private String  away_team_events_0_id;
    private String away_team_events_0_type_of_event;
    private String away_team_events_0_player;
    //private String  away_team_events_0_time;
    //private String  away_team_events_1_id;
    private String away_team_events_1_type_of_event;
    private String away_team_events_1_player;
    // away_team_events_1_time;
    //  away_team_events_2_id;
    private String away_team_events_2_type_of_event;
    private String away_team_events_2_player;
    //   private String  away_team_events_2_time;
    //   private String  away_team_events_3_id;
    private String away_team_events_3_type_of_event;
    private String away_team_events_3_player;
    // private String   away_team_events_3_time;
    // private String   away_team_events_4_id;
    private String away_team_events_4_type_of_event;
    private String away_team_events_4_player;
    // private String    away_team_events_4_time;
    //  private String   away_team_events_5_id;
    private String away_team_events_5_type_of_event;
    private String away_team_events_5_player;
    // private String    away_team_events_5_time;
    //  private String   away_team_events_6_id;
    private String away_team_events_6_type_of_event;
    private String away_team_events_6_player;
    // private String away_team_events_6_time;
    // private String away_team_events_7_id;
    private String away_team_events_7_type_of_event;
    private String away_team_events_7_player;
    // private String away_team_events_7_time;
    private String home_team_statistics_country;
    private String home_team_statistics_attempts_on_goal;
    private String home_team_statistics_on_target;
    private String home_team_statistics_off_target;
    private String home_team_statistics_blocked;
    private String home_team_statistics_woodwork;
    private String home_team_statistics_corners;
    private String home_team_statistics_offsides;
    private String home_team_statistics_ball_possession;
    private String home_team_statistics_pass_accuracy;
    private String home_team_statistics_num_passes;
    private String home_team_statistics_passes_completed;
    private String home_team_statistics_distance_covered;
    private String home_team_statistics_balls_recovered;
    private String home_team_statistics_tackles;
    private String home_team_statistics_clearances;
    private String home_team_statistics_yellow_cards;
    private String home_team_statistics_red_cards;
    private String home_team_statistics_fouls_committed;
    private String home_team_statistics_tactics;
    // private String   home_team_statistics_starting_eleven_0_name;
    // private String   home_team_statistics_starting_eleven_0_captain;
    // private String   home_team_statistics_starting_eleven_0_shirt_number;
    // private String   home_team_statistics_starting_eleven_0_position;
    // private String   home_team_statistics_starting_eleven_1_name;
    // private String   home_team_statistics_starting_eleven_1_captain;
    // private String   home_team_statistics_starting_eleven_1_shirt_number;
    // private String   home_team_statistics_starting_eleven_1_position;
    // private String   home_team_statistics_starting_eleven_2_name;
    // private String   home_team_statistics_starting_eleven_2_captain;
    // private String   home_team_statistics_starting_eleven_2_shirt_number;
    // private String   home_team_statistics_starting_eleven_2_position;
    // private String   home_team_statistics_starting_eleven_3_name;
    // private String   home_team_statistics_starting_eleven_3_captain;
    // private String   home_team_statistics_starting_eleven_3_shirt_number;
    // private String   home_team_statistics_starting_eleven_3_position;
    // private String   home_team_statistics_starting_eleven_4_name;
    // private String   home_team_statistics_starting_eleven_4_captain;
    // private String   home_team_statistics_starting_eleven_4_shirt_number;
    // private String   home_team_statistics_starting_eleven_4_position;
    // private String   home_team_statistics_starting_eleven_5_name;
    // private String   home_team_statistics_starting_eleven_5_captain ;
    // private String   home_team_statistics_starting_eleven_5_shirt_number;
    // private String   home_team_statistics_starting_eleven_5_position;
    // private String   home_team_statistics_starting_eleven_6_name;
    // private String   home_team_statistics_starting_eleven_6_captain;
    // private String   home_team_statistics_starting_eleven_6_shirt_number;
    // private String   home_team_statistics_starting_eleven_6_position;
    // private String   home_team_statistics_starting_eleven_7_name;
    // private String   home_team_statistics_starting_eleven_7_captain;
    // private String   home_team_statistics_starting_eleven_7_shirt_number;
    // private String   home_team_statistics_starting_eleven_7_position;
    // private String   home_team_statistics_starting_eleven_8_name;
    // private String   home_team_statistics_starting_eleven_8_captain;
    // private String   home_team_statistics_starting_eleven_8_shirt_number;
    // private String   home_team_statistics_starting_eleven_8_position;
    // private String   home_team_statistics_starting_eleven_9_name;
    // private String   home_team_statistics_starting_eleven_9_captain;
    // private String   home_team_statistics_starting_eleven_9_shirt_number;
    // private String   home_team_statistics_starting_eleven_9_position;
    // private String   home_team_statistics_starting_eleven_10_name;
    // private String   home_team_statistics_starting_eleven_10_captain;
    // private String   home_team_statistics_starting_eleven_10_shirt_number;
    // private String   home_team_statistics_starting_eleven_10_position;
    // private String   home_team_statistics_substitutes_0_name;
    // private String   home_team_statistics_substitutes_0_captain;
    // private String   home_team_statistics_substitutes_0_shirt_number;
    // private String   home_team_statistics_substitutes_0_position;
    // private String   home_team_statistics_substitutes_1_name;
    // private String   home_team_statistics_substitutes_1_captain;
    // private String   home_team_statistics_substitutes_1_shirt_number;
    // private String   home_team_statistics_substitutes_1_position;
    // private String   home_team_statistics_substitutes_2_name;
    // private String   home_team_statistics_substitutes_2_captain;
    // private String   home_team_statistics_substitutes_2_shirt_number;
    // private String   home_team_statistics_substitutes_2_position;
    // private String   home_team_statistics_substitutes_3_name;
    // private String   home_team_statistics_substitutes_3_captain;
    // private String   home_team_statistics_substitutes_3_shirt_number;
    // private String   home_team_statistics_substitutes_3_position;
    // private String   home_team_statistics_substitutes_4_name;
    // private String   home_team_statistics_substitutes_4_captain;
    // private String   home_team_statistics_substitutes_4_shirt_number;
    // private String   home_team_statistics_substitutes_4_position;
    // private String   home_team_statistics_substitutes_5_name;
    // private String   home_team_statistics_substitutes_5_captain;
    // private String   home_team_statistics_substitutes_5_shirt_number;
    // private String   home_team_statistics_substitutes_5_position;
    // private String   home_team_statistics_substitutes_6_name;
    // private String   home_team_statistics_substitutes_6_captain;
    // private String   home_team_statistics_substitutes_6_shirt_number;
    // private String   home_team_statistics_substitutes_6_position;
    // private String   home_team_statistics_substitutes_7_name;
    // private String   home_team_statistics_substitutes_7_captain;
    // private String   home_team_statistics_substitutes_7_shirt_number;
    // private String   home_team_statistics_substitutes_7_position;
    // private String   home_team_statistics_substitutes_8_name;
    // private String   home_team_statistics_substitutes_8_captain;
    // private String   home_team_statistics_substitutes_8_shirt_number;
    // private String   home_team_statistics_substitutes_8_position;
    // private String   home_team_statistics_substitutes_9_name;
    // private String   home_team_statistics_substitutes_9_captain;
    // private String   home_team_statistics_substitutes_9_shirt_number;
    // private String   home_team_statistics_substitutes_9_position;
    // private String   home_team_statistics_substitutes_10_name;
    // private String   home_team_statistics_substitutes_10_captain;
    // private String   home_team_statistics_substitutes_10_shirt_number;
    // private String   home_team_statistics_substitutes_10_position;
    // private String   home_team_statistics_substitutes_11_name;
    // private String   home_team_statistics_substitutes_11_captain;
    // private String   home_team_statistics_substitutes_11_shirt_number;
    // private String   home_team_statistics_substitutes_11_position;
    private String away_team_statistics_country;
    private String away_team_statistics_attempts_on_goal;
    private String away_team_statistics_on_target;
    private String away_team_statistics_off_target;
    private String away_team_statistics_blocked;
    private String away_team_statistics_woodwork;
    private String away_team_statistics_corners;
    private String away_team_statistics_offsides;
    private String away_team_statistics_ball_possession;
    private String away_team_statistics_pass_accuracy;
    private String away_team_statistics_num_passes;
    private String away_team_statistics_passes_completed;
    private String away_team_statistics_distance_covered;
    private String away_team_statistics_balls_recovered;
    private String away_team_statistics_tackles;
    private String away_team_statistics_clearances;
    private String away_team_statistics_yellow_cards;
    private String away_team_statistics_red_cards;
    private String away_team_statistics_fouls_committed;
    private String away_team_statistics_tactics;
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

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTemp_celsius() {
        return temp_celsius;
    }

    public void setTemp_celsius(String temp_celsius) {
        this.temp_celsius = temp_celsius;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getStage_name() {
        return stage_name;
    }

    public void setStage_name(String stage_name) {
        this.stage_name = stage_name;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getTarget() {
        return Target;
    }

    public void setTarget(String target) {
        Target = target;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getHome_team_goals() {
        return home_team_goals;
    }

    public void setHome_team_goals(String home_team_goals) {
        this.home_team_goals = home_team_goals;
    }

    public String getHome_team_penalties() {
        return home_team_penalties;
    }

    public void setHome_team_penalties(String home_team_penalties) {
        this.home_team_penalties = home_team_penalties;
    }

    public String getAway_team_goals() {
        return away_team_goals;
    }

    public void setAway_team_goals(String away_team_goals) {
        this.away_team_goals = away_team_goals;
    }

    public String getAway_team_penalties() {
        return away_team_penalties;
    }

    public void setAway_team_penalties(String away_team_penalties) {
        this.away_team_penalties = away_team_penalties;
    }

    public String getHome_team_events_0_type_of_event() {
        return home_team_events_0_type_of_event;
    }

    public void setHome_team_events_0_type_of_event(String home_team_events_0_type_of_event) {
        this.home_team_events_0_type_of_event = home_team_events_0_type_of_event;
    }

    public String getHome_team_events_0_player() {
        return home_team_events_0_player;
    }

    public void setHome_team_events_0_player(String home_team_events_0_player) {
        this.home_team_events_0_player = home_team_events_0_player;
    }

    public String getHome_team_events_1_type_of_event() {
        return home_team_events_1_type_of_event;
    }

    public void setHome_team_events_1_type_of_event(String home_team_events_1_type_of_event) {
        this.home_team_events_1_type_of_event = home_team_events_1_type_of_event;
    }

    public String getHome_team_events_1_player() {
        return home_team_events_1_player;
    }

    public void setHome_team_events_1_player(String home_team_events_1_player) {
        this.home_team_events_1_player = home_team_events_1_player;
    }

    public String getHome_team_events_2_type_of_event() {
        return home_team_events_2_type_of_event;
    }

    public void setHome_team_events_2_type_of_event(String home_team_events_2_type_of_event) {
        this.home_team_events_2_type_of_event = home_team_events_2_type_of_event;
    }

    public String getHome_team_events_2_player() {
        return home_team_events_2_player;
    }

    public void setHome_team_events_2_player(String home_team_events_2_player) {
        this.home_team_events_2_player = home_team_events_2_player;
    }

    public String getHome_team_events_3_type_of_event() {
        return home_team_events_3_type_of_event;
    }

    public void setHome_team_events_3_type_of_event(String home_team_events_3_type_of_event) {
        this.home_team_events_3_type_of_event = home_team_events_3_type_of_event;
    }

    public String getHome_team_events_3_player() {
        return home_team_events_3_player;
    }

    public void setHome_team_events_3_player(String home_team_events_3_player) {
        this.home_team_events_3_player = home_team_events_3_player;
    }

    public String getHome_team_events_4_type_of_event() {
        return home_team_events_4_type_of_event;
    }

    public void setHome_team_events_4_type_of_event(String home_team_events_4_type_of_event) {
        this.home_team_events_4_type_of_event = home_team_events_4_type_of_event;
    }

    public String getHome_team_events_4_player() {
        return home_team_events_4_player;
    }

    public void setHome_team_events_4_player(String home_team_events_4_player) {
        this.home_team_events_4_player = home_team_events_4_player;
    }

    public String getHome_team_events_5_type_of_event() {
        return home_team_events_5_type_of_event;
    }

    public void setHome_team_events_5_type_of_event(String home_team_events_5_type_of_event) {
        this.home_team_events_5_type_of_event = home_team_events_5_type_of_event;
    }

    public String getHome_team_events_5_player() {
        return home_team_events_5_player;
    }

    public void setHome_team_events_5_player(String home_team_events_5_player) {
        this.home_team_events_5_player = home_team_events_5_player;
    }

    public String getHome_team_events_6_type_of_event() {
        return home_team_events_6_type_of_event;
    }

    public void setHome_team_events_6_type_of_event(String home_team_events_6_type_of_event) {
        this.home_team_events_6_type_of_event = home_team_events_6_type_of_event;
    }

    public String getHome_team_events_6_player() {
        return home_team_events_6_player;
    }

    public void setHome_team_events_6_player(String home_team_events_6_player) {
        this.home_team_events_6_player = home_team_events_6_player;
    }

    public String getHome_team_events_7_type_of_event() {
        return home_team_events_7_type_of_event;
    }

    public void setHome_team_events_7_type_of_event(String home_team_events_7_type_of_event) {
        this.home_team_events_7_type_of_event = home_team_events_7_type_of_event;
    }

    public String getHome_team_events_7_player() {
        return home_team_events_7_player;
    }

    public void setHome_team_events_7_player(String home_team_events_7_player) {
        this.home_team_events_7_player = home_team_events_7_player;
    }

    public String getHome_team_events_8_type_of_event() {
        return home_team_events_8_type_of_event;
    }

    public void setHome_team_events_8_type_of_event(String home_team_events_8_type_of_event) {
        this.home_team_events_8_type_of_event = home_team_events_8_type_of_event;
    }

    public String getHome_team_events_8_player() {
        return home_team_events_8_player;
    }

    public void setHome_team_events_8_player(String home_team_events_8_player) {
        this.home_team_events_8_player = home_team_events_8_player;
    }

    public String getHome_team_events_9_type_of_event() {
        return home_team_events_9_type_of_event;
    }

    public void setHome_team_events_9_type_of_event(String home_team_events_9_type_of_event) {
        this.home_team_events_9_type_of_event = home_team_events_9_type_of_event;
    }

    public String getHome_team_events_9_player() {
        return home_team_events_9_player;
    }

    public void setHome_team_events_9_player(String home_team_events_9_player) {
        this.home_team_events_9_player = home_team_events_9_player;
    }

    public String getHome_team_events_10_type_of_event() {
        return home_team_events_10_type_of_event;
    }

    public void setHome_team_events_10_type_of_event(String home_team_events_10_type_of_event) {
        this.home_team_events_10_type_of_event = home_team_events_10_type_of_event;
    }

    public String getHome_team_events_10_player() {
        return home_team_events_10_player;
    }

    public void setHome_team_events_10_player(String home_team_events_10_player) {
        this.home_team_events_10_player = home_team_events_10_player;
    }

    public String getHome_team_events_11_type_of_event() {
        return home_team_events_11_type_of_event;
    }

    public void setHome_team_events_11_type_of_event(String home_team_events_11_type_of_event) {
        this.home_team_events_11_type_of_event = home_team_events_11_type_of_event;
    }

    public String getHome_team_events_11_player() {
        return home_team_events_11_player;
    }

    public void setHome_team_events_11_player(String home_team_events_11_player) {
        this.home_team_events_11_player = home_team_events_11_player;
    }

    public String getAway_team_events_0_type_of_event() {
        return away_team_events_0_type_of_event;
    }

    public void setAway_team_events_0_type_of_event(String away_team_events_0_type_of_event) {
        this.away_team_events_0_type_of_event = away_team_events_0_type_of_event;
    }

    public String getAway_team_events_0_player() {
        return away_team_events_0_player;
    }

    public void setAway_team_events_0_player(String away_team_events_0_player) {
        this.away_team_events_0_player = away_team_events_0_player;
    }

    public String getAway_team_events_1_type_of_event() {
        return away_team_events_1_type_of_event;
    }

    public void setAway_team_events_1_type_of_event(String away_team_events_1_type_of_event) {
        this.away_team_events_1_type_of_event = away_team_events_1_type_of_event;
    }

    public String getAway_team_events_1_player() {
        return away_team_events_1_player;
    }

    public void setAway_team_events_1_player(String away_team_events_1_player) {
        this.away_team_events_1_player = away_team_events_1_player;
    }

    public String getAway_team_events_2_type_of_event() {
        return away_team_events_2_type_of_event;
    }

    public void setAway_team_events_2_type_of_event(String away_team_events_2_type_of_event) {
        this.away_team_events_2_type_of_event = away_team_events_2_type_of_event;
    }

    public String getAway_team_events_2_player() {
        return away_team_events_2_player;
    }

    public void setAway_team_events_2_player(String away_team_events_2_player) {
        this.away_team_events_2_player = away_team_events_2_player;
    }

    public String getAway_team_events_3_type_of_event() {
        return away_team_events_3_type_of_event;
    }

    public void setAway_team_events_3_type_of_event(String away_team_events_3_type_of_event) {
        this.away_team_events_3_type_of_event = away_team_events_3_type_of_event;
    }

    public String getAway_team_events_3_player() {
        return away_team_events_3_player;
    }

    public void setAway_team_events_3_player(String away_team_events_3_player) {
        this.away_team_events_3_player = away_team_events_3_player;
    }

    public String getAway_team_events_4_type_of_event() {
        return away_team_events_4_type_of_event;
    }

    public void setAway_team_events_4_type_of_event(String away_team_events_4_type_of_event) {
        this.away_team_events_4_type_of_event = away_team_events_4_type_of_event;
    }

    public String getAway_team_events_4_player() {
        return away_team_events_4_player;
    }

    public void setAway_team_events_4_player(String away_team_events_4_player) {
        this.away_team_events_4_player = away_team_events_4_player;
    }

    public String getAway_team_events_5_type_of_event() {
        return away_team_events_5_type_of_event;
    }

    public void setAway_team_events_5_type_of_event(String away_team_events_5_type_of_event) {
        this.away_team_events_5_type_of_event = away_team_events_5_type_of_event;
    }

    public String getAway_team_events_5_player() {
        return away_team_events_5_player;
    }

    public void setAway_team_events_5_player(String away_team_events_5_player) {
        this.away_team_events_5_player = away_team_events_5_player;
    }

    public String getAway_team_events_6_type_of_event() {
        return away_team_events_6_type_of_event;
    }

    public void setAway_team_events_6_type_of_event(String away_team_events_6_type_of_event) {
        this.away_team_events_6_type_of_event = away_team_events_6_type_of_event;
    }

    public String getAway_team_events_6_player() {
        return away_team_events_6_player;
    }

    public void setAway_team_events_6_player(String away_team_events_6_player) {
        this.away_team_events_6_player = away_team_events_6_player;
    }

    public String getAway_team_events_7_type_of_event() {
        return away_team_events_7_type_of_event;
    }

    public void setAway_team_events_7_type_of_event(String away_team_events_7_type_of_event) {
        this.away_team_events_7_type_of_event = away_team_events_7_type_of_event;
    }

    public String getAway_team_events_7_player() {
        return away_team_events_7_player;
    }

    public void setAway_team_events_7_player(String away_team_events_7_player) {
        this.away_team_events_7_player = away_team_events_7_player;
    }

    public String getHome_team_statistics_country() {
        return home_team_statistics_country;
    }

    public void setHome_team_statistics_country(String home_team_statistics_country) {
        this.home_team_statistics_country = home_team_statistics_country;
    }

    public String getHome_team_statistics_attempts_on_goal() {
        return home_team_statistics_attempts_on_goal;
    }

    public void setHome_team_statistics_attempts_on_goal(String home_team_statistics_attempts_on_goal) {
        this.home_team_statistics_attempts_on_goal = home_team_statistics_attempts_on_goal;
    }

    public String getHome_team_statistics_on_target() {
        return home_team_statistics_on_target;
    }

    public void setHome_team_statistics_on_target(String home_team_statistics_on_target) {
        this.home_team_statistics_on_target = home_team_statistics_on_target;
    }

    public String getHome_team_statistics_off_target() {
        return home_team_statistics_off_target;
    }

    public void setHome_team_statistics_off_target(String home_team_statistics_off_target) {
        this.home_team_statistics_off_target = home_team_statistics_off_target;
    }

    public String getHome_team_statistics_blocked() {
        return home_team_statistics_blocked;
    }

    public void setHome_team_statistics_blocked(String home_team_statistics_blocked) {
        this.home_team_statistics_blocked = home_team_statistics_blocked;
    }

    public String getHome_team_statistics_woodwork() {
        return home_team_statistics_woodwork;
    }

    public void setHome_team_statistics_woodwork(String home_team_statistics_woodwork) {
        this.home_team_statistics_woodwork = home_team_statistics_woodwork;
    }

    public String getHome_team_statistics_corners() {
        return home_team_statistics_corners;
    }

    public void setHome_team_statistics_corners(String home_team_statistics_corners) {
        this.home_team_statistics_corners = home_team_statistics_corners;
    }

    public String getHome_team_statistics_offsides() {
        return home_team_statistics_offsides;
    }

    public void setHome_team_statistics_offsides(String home_team_statistics_offsides) {
        this.home_team_statistics_offsides = home_team_statistics_offsides;
    }

    public String getHome_team_statistics_ball_possession() {
        return home_team_statistics_ball_possession;
    }

    public void setHome_team_statistics_ball_possession(String home_team_statistics_ball_possession) {
        this.home_team_statistics_ball_possession = home_team_statistics_ball_possession;
    }

    public String getHome_team_statistics_pass_accuracy() {
        return home_team_statistics_pass_accuracy;
    }

    public void setHome_team_statistics_pass_accuracy(String home_team_statistics_pass_accuracy) {
        this.home_team_statistics_pass_accuracy = home_team_statistics_pass_accuracy;
    }

    public String getHome_team_statistics_num_passes() {
        return home_team_statistics_num_passes;
    }

    public void setHome_team_statistics_num_passes(String home_team_statistics_num_passes) {
        this.home_team_statistics_num_passes = home_team_statistics_num_passes;
    }

    public String getHome_team_statistics_passes_completed() {
        return home_team_statistics_passes_completed;
    }

    public void setHome_team_statistics_passes_completed(String home_team_statistics_passes_completed) {
        this.home_team_statistics_passes_completed = home_team_statistics_passes_completed;
    }

    public String getHome_team_statistics_distance_covered() {
        return home_team_statistics_distance_covered;
    }

    public void setHome_team_statistics_distance_covered(String home_team_statistics_distance_covered) {
        this.home_team_statistics_distance_covered = home_team_statistics_distance_covered;
    }

    public String getHome_team_statistics_balls_recovered() {
        return home_team_statistics_balls_recovered;
    }

    public void setHome_team_statistics_balls_recovered(String home_team_statistics_balls_recovered) {
        this.home_team_statistics_balls_recovered = home_team_statistics_balls_recovered;
    }

    public String getHome_team_statistics_tackles() {
        return home_team_statistics_tackles;
    }

    public void setHome_team_statistics_tackles(String home_team_statistics_tackles) {
        this.home_team_statistics_tackles = home_team_statistics_tackles;
    }

    public String getHome_team_statistics_clearances() {
        return home_team_statistics_clearances;
    }

    public void setHome_team_statistics_clearances(String home_team_statistics_clearances) {
        this.home_team_statistics_clearances = home_team_statistics_clearances;
    }

    public String getHome_team_statistics_yellow_cards() {
        return home_team_statistics_yellow_cards;
    }

    public void setHome_team_statistics_yellow_cards(String home_team_statistics_yellow_cards) {
        this.home_team_statistics_yellow_cards = home_team_statistics_yellow_cards;
    }

    public String getHome_team_statistics_red_cards() {
        return home_team_statistics_red_cards;
    }

    public void setHome_team_statistics_red_cards(String home_team_statistics_red_cards) {
        this.home_team_statistics_red_cards = home_team_statistics_red_cards;
    }

    public String getHome_team_statistics_fouls_committed() {
        return home_team_statistics_fouls_committed;
    }

    public void setHome_team_statistics_fouls_committed(String home_team_statistics_fouls_committed) {
        this.home_team_statistics_fouls_committed = home_team_statistics_fouls_committed;
    }

    public String getHome_team_statistics_tactics() {
        return home_team_statistics_tactics;
    }

    public void setHome_team_statistics_tactics(String home_team_statistics_tactics) {
        this.home_team_statistics_tactics = home_team_statistics_tactics;
    }

    public String getAway_team_statistics_country() {
        return away_team_statistics_country;
    }

    public void setAway_team_statistics_country(String away_team_statistics_country) {
        this.away_team_statistics_country = away_team_statistics_country;
    }

    public String getAway_team_statistics_attempts_on_goal() {
        return away_team_statistics_attempts_on_goal;
    }

    public void setAway_team_statistics_attempts_on_goal(String away_team_statistics_attempts_on_goal) {
        this.away_team_statistics_attempts_on_goal = away_team_statistics_attempts_on_goal;
    }

    public String getAway_team_statistics_on_target() {
        return away_team_statistics_on_target;
    }

    public void setAway_team_statistics_on_target(String away_team_statistics_on_target) {
        this.away_team_statistics_on_target = away_team_statistics_on_target;
    }

    public String getAway_team_statistics_off_target() {
        return away_team_statistics_off_target;
    }

    public void setAway_team_statistics_off_target(String away_team_statistics_off_target) {
        this.away_team_statistics_off_target = away_team_statistics_off_target;
    }

    public String getAway_team_statistics_blocked() {
        return away_team_statistics_blocked;
    }

    public void setAway_team_statistics_blocked(String away_team_statistics_blocked) {
        this.away_team_statistics_blocked = away_team_statistics_blocked;
    }

    public String getAway_team_statistics_woodwork() {
        return away_team_statistics_woodwork;
    }

    public void setAway_team_statistics_woodwork(String away_team_statistics_woodwork) {
        this.away_team_statistics_woodwork = away_team_statistics_woodwork;
    }

    public String getAway_team_statistics_corners() {
        return away_team_statistics_corners;
    }

    public void setAway_team_statistics_corners(String away_team_statistics_corners) {
        this.away_team_statistics_corners = away_team_statistics_corners;
    }

    public String getAway_team_statistics_offsides() {
        return away_team_statistics_offsides;
    }

    public void setAway_team_statistics_offsides(String away_team_statistics_offsides) {
        this.away_team_statistics_offsides = away_team_statistics_offsides;
    }

    public String getAway_team_statistics_ball_possession() {
        return away_team_statistics_ball_possession;
    }

    public void setAway_team_statistics_ball_possession(String away_team_statistics_ball_possession) {
        this.away_team_statistics_ball_possession = away_team_statistics_ball_possession;
    }

    public String getAway_team_statistics_pass_accuracy() {
        return away_team_statistics_pass_accuracy;
    }

    public void setAway_team_statistics_pass_accuracy(String away_team_statistics_pass_accuracy) {
        this.away_team_statistics_pass_accuracy = away_team_statistics_pass_accuracy;
    }

    public String getAway_team_statistics_num_passes() {
        return away_team_statistics_num_passes;
    }

    public void setAway_team_statistics_num_passes(String away_team_statistics_num_passes) {
        this.away_team_statistics_num_passes = away_team_statistics_num_passes;
    }

    public String getAway_team_statistics_passes_completed() {
        return away_team_statistics_passes_completed;
    }

    public void setAway_team_statistics_passes_completed(String away_team_statistics_passes_completed) {
        this.away_team_statistics_passes_completed = away_team_statistics_passes_completed;
    }

    public String getAway_team_statistics_distance_covered() {
        return away_team_statistics_distance_covered;
    }

    public void setAway_team_statistics_distance_covered(String away_team_statistics_distance_covered) {
        this.away_team_statistics_distance_covered = away_team_statistics_distance_covered;
    }

    public String getAway_team_statistics_balls_recovered() {
        return away_team_statistics_balls_recovered;
    }

    public void setAway_team_statistics_balls_recovered(String away_team_statistics_balls_recovered) {
        this.away_team_statistics_balls_recovered = away_team_statistics_balls_recovered;
    }

    public String getAway_team_statistics_tackles() {
        return away_team_statistics_tackles;
    }

    public void setAway_team_statistics_tackles(String away_team_statistics_tackles) {
        this.away_team_statistics_tackles = away_team_statistics_tackles;
    }

    public String getAway_team_statistics_clearances() {
        return away_team_statistics_clearances;
    }

    public void setAway_team_statistics_clearances(String away_team_statistics_clearances) {
        this.away_team_statistics_clearances = away_team_statistics_clearances;
    }

    public String getAway_team_statistics_yellow_cards() {
        return away_team_statistics_yellow_cards;
    }

    public void setAway_team_statistics_yellow_cards(String away_team_statistics_yellow_cards) {
        this.away_team_statistics_yellow_cards = away_team_statistics_yellow_cards;
    }

    public String getAway_team_statistics_red_cards() {
        return away_team_statistics_red_cards;
    }

    public void setAway_team_statistics_red_cards(String away_team_statistics_red_cards) {
        this.away_team_statistics_red_cards = away_team_statistics_red_cards;
    }

    public String getAway_team_statistics_fouls_committed() {
        return away_team_statistics_fouls_committed;
    }

    public void setAway_team_statistics_fouls_committed(String away_team_statistics_fouls_committed) {
        this.away_team_statistics_fouls_committed = away_team_statistics_fouls_committed;
    }

    public String getAway_team_statistics_tactics() {
        return away_team_statistics_tactics;
    }

    public void setAway_team_statistics_tactics(String away_team_statistics_tactics) {
        this.away_team_statistics_tactics = away_team_statistics_tactics;
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
