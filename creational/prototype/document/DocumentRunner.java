package creational.prototype.document;

import java.util.ArrayList;
import java.util.List;

public class DocumentRunner {
    public static void main(String[] args) {
        List<String> originalTags = new ArrayList<>();
        originalTags.add("java");
        originalTags.add("programming");

        Document original = new Document(
                1,
                "Java Asoslari",
                "Design Patterns haqida umumiy tushuncha",
                "Hamidulloh",
                originalTags);
        System.out.println("Original:   " + original);

        DocumentFactory factory = new DocumentFactory(original);
        Document docClone1 = factory.cloneDocument();
        Document docClone2 = factory.cloneDocument();

        docClone1.setTitle("Advanced Java");
        docClone1.setContent("Prototype Pattern chuqur tahlili");
        docClone1.getTags().add("prototype");

        docClone2.setTitle("Java Patterns");
        docClone2.setContent("Singleton va Factory haqida");
        docClone2.getTags().set(0, "advanced-java");

        System.out.println("Clone 1:    " + docClone1);
        System.out.println("Clone 2:    " + docClone2);
        System.out.println("Original (o'zgarmaganligi tekshirilmoqda): " + original);
    }
}
