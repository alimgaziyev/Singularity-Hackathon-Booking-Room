package kz.singularity.hackaton.backendhackatonvegetables.util;

import kz.singularity.hackaton.backendhackatonvegetables.models.ETime;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class AllDayActivity {
    private String meetingDescription;
    private String time;
    private boolean reserved;

    @Override
    public String toString() {
        return "AllDayActivity{" +
                "meetingDescription='" + meetingDescription + '\'' +
                ", time='" + time + '\'' +
                ", reserved=" + reserved +
                '}';
    }

    private List<AllDayActivity> allDayActivityList = new ArrayList<>();
    public AllDayActivity() {
        DayTimes dayTimes = new DayTimes();
        List<String> freeTimes = dayTimes.getTimeList();

        for (String time : freeTimes) {
            AllDayActivity activity = new AllDayActivity();

            activity.setTime(time);
            activity.setMeetingDescription(null);
            activity.setReserved(false);
            allDayActivityList.add(activity);
        }

    }

}