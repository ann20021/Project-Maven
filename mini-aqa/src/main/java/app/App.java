package app;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class App {

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Привет, Гость!";
        }
        return "Привет, " + name + "!";
    }

    public static void main(String[] args) {
        Properties properties = new Properties();

        try (InputStream is = App.class.getResourceAsStream("/app.properties")) {
            if (is == null) {
                System.err.println("Файл app.properties не найден");
                return;
            }
            properties.load(new InputStreamReader(is, StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.err.println("Ошибка чтения app.properties: " + e.getMessage());
            return;
        }

        String studentName = properties.getProperty("student.name");
        App app = new App();
        System.out.println(app.greet(studentName));

    }
}
