package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {
    private final String name;
    private final List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem component) {
        children.add(component);
    }

    public void remove(FileSystem component) {
        children.remove(component);
    }

    @Override
    public void show() {
        print("");
    }

    private void print(String indent) {
        System.out.println(indent + "Folder: " + name);
        for (FileSystem component : children) {
            if (component instanceof Folder) {
                ((Folder) component).print(indent + "    ");
            } else if (component instanceof File) {
                System.out.println(indent + "    File: " + ((File) component).getName());
            }
        }
    }
}
