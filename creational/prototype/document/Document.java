package creational.prototype.document;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Document implements Copyable {
    private int id;
    private String title;
    private String content;
    private String author;
    private List<String> tags;

    public Document(int id, String title, String content, String author, List<String> tags) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.tags = new ArrayList<>(Objects.requireNonNull(tags, "tags must not be null"));
    }

    public Document(Document target) {
        Objects.requireNonNull(target, "target must not be null");
        this.id = target.id;
        this.title = target.title;
        this.content = target.content;
        this.author = target.author;
        this.tags = new ArrayList<>(target.tags);
    }

    @Override
    public Document clone() {
        return new Document(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = new ArrayList<>(Objects.requireNonNull(tags, "tags must not be null"));
    }

    @Override
    public String toString() {
        return "Document {id=" + id
                + ", title='" + title + '\''
                + ", content='" + content + '\''
                + ", author='" + author + '\''
                + ", tags=" + tags + '}';
    }
}
