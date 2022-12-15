import java.io.*;
import java.util.Arrays;

class Student implements Comparable<Student> {
    private final String name;
    private final int kor;
    private final int eng;
    private final int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return "Student" +
                "{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                "}\n";

    }

    @Override
    public int compareTo(Student s) {
        if (this.kor != s.kor)
            return s.kor - this.kor;
        if (this.eng != s.eng)
            return this.eng - s.eng;
        if (this.math != s.math)
            return s.math - this.math;
        return this.name.compareTo(s.name);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Student[] answer = new Student[N];

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            answer[i] = new Student(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
        }
        Arrays.stream(answer).sorted()
                .map(Student::getName)
                .forEach(s -> {
                    try {
                        bw.write(s);
                        bw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        bw.flush();
        bw.close();
        br.close();
    }

}
