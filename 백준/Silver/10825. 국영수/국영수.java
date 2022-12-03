import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student>{
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
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
        if(this.kor != s.kor)
            return s.kor - this.kor;
        if(this.eng != s.eng)
            return this.eng - s.eng;
        if (this.math != s.math)
            return s.math - this.math;
        return this.name.compareTo(s.name);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());

        Student[] answer = new Student[N];

        for (int i = 0; i < N; i++) {
            String[] arr = bf.readLine().split(" ");
            answer[i] = new Student(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
        }
        Arrays.stream(answer).sorted().map(student -> student.name).forEach(s -> {
            try {
                bw.write(s);
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        bw.flush();
    }

}
