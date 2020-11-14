package com.jcirmodelsquad.tcjcir.features.eti.jcirmonitor;


import java.time.LocalTime;
import java.util.ArrayList;

public class AdvancedDetailsObject {
        public String trainType = "";
        public String trainName = "";
        public String trainNumber = "";
        public ArrayList<Station> stations;
        public LocalTime lastMills;

        public AdvancedDetailsObject() {
        }

        public AdvancedDetailsObject(String tt, String tn, String tnn, ArrayList<Station> theStations) {
            trainType = tt;
            trainName = tn;
            trainNumber = tnn;
            stations = theStations;
        }
}
