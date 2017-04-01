package sdaacademy.pl.simplelistviewexample;


import android.content.res.Resources;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilePersonProvider extends PersonProvider {

    private final Resources resources;

    public FilePersonProvider(Resources resources) {
        this.resources = resources;
    }

    @Override
    public List<Person> provide() {
        InputStream inputStream = resources.openRawResource(R.raw.persons);
        Scanner scanner = new Scanner(inputStream);
        List<Person> result = new ArrayList<>();
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            try{
                result.add(parse(nextLine));
            }catch (Exception e) {}
        }
        scanner.close();

        return result;
    }

    private Person parse(String line) {
        String[] data = line.split(",");
        String name = data[0];
        String surname = data[1];
        int age = Integer.parseInt(data[2]);
        return new Person(name,surname, age);
    }
}
