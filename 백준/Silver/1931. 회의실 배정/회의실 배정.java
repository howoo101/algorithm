import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        ArrayList<Meeting> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] spentTime = br.readLine().split(" ");
            int start = Integer.parseInt(spentTime[0]);
            int end = Integer.parseInt(spentTime[1]);
            Meeting meeting = new Meeting(start,end);
            list.add(meeting);
        }
        Collections.sort(list);
        int answer = 1;
        int prevEnd = list.get(0).getEnd();
        for (int i = 1; i < list.size(); i++) {
            Meeting meeting = list.get(i);
            Integer start = meeting.getStart();
            if(prevEnd <= start) {
                answer++;
            prevEnd = meeting.getEnd();
        }

        }
        System.out.println(answer);

    }

}
class Meeting implements Comparable<Meeting>{
    private final Integer start;
    private final Integer end;

    public Integer getStart() {
        return start;
    }

    public Integer getEnd() {
        return end;
    }

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return start + " " + end;
    }

    @Override
    public int compareTo(Meeting o) {
        if(this.end > o.end) return 1;
        else if(this.end.equals(o.end)) {
            return this.start.compareTo(o.start);
        }else {
            return -1;
        }
    }
}
