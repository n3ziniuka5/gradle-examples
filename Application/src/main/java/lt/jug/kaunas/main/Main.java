package lt.jug.kaunas.main;

import lt.jug.kaunas.config.Context;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class Main {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Context.class);
        applicationContext.getBean(Main.class).run();
    }

    public void run() throws Exception {
        Files.list(Paths.get("build/checksum")).forEach(this::printChecksum);
    }

    private void printChecksum(Path file) {
        try {
            System.out.println(file.getFileName() + " Checksum: " + new String(Files.readAllBytes(file)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}