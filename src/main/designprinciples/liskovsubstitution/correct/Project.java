package main.designprinciples.liskovsubstitution.correct;

import java.util.List;


// With this approach there is no risk of breaking the existing
// functionality. The parent class Document is a read-only type
// while the child class is a writable type which extends the
// open() operation of the parent and adds the save() operation.
// If the client calls the open() operation on both the parent
// and the child object it behaves in the same way.
public class Project {
    public void openAll(List<Document> documents){
        documents.forEach(document -> System.out.println("opening" + document));
    }

    public void saveAll(List<WritableDocument> documents, String newData){
        documents.forEach(document -> document.save(newData));
    }
}
