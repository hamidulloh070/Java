package creational.prototype.document;

import java.util.Objects;

public class DocumentFactory {
    private Document prototype;

    public DocumentFactory(Document prototype) {
        this.prototype = Objects.requireNonNull(prototype, "prototype must not be null");
    }

    public void setPrototype(Document prototype) {
        this.prototype = Objects.requireNonNull(prototype, "prototype must not be null");
    }

    public Document cloneDocument() {
        return prototype.clone();
    }
}
