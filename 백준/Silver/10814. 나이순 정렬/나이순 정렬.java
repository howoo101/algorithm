import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    int age;
    String name;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return
                age + " " + name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Person> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int age = Integer.parseInt(s[0]);
            String name = s[1];
            list.add(new Person(age, name));
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}