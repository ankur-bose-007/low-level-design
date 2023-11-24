package main.designprinciples.liskovsubstitution.wrong;

import java.util.List;

// The problem with this implementation is that the sub-class
// ReadOnlyDocument doesn't support save operation. This violates
// Liskov Substitution principle because if the client replaces
// the parent object reference with child object reference the
// functionality will start breaking for the save() operation.
public class Project {
    public void openAll(List<Document> documents){
        documents.forEach(document -> System.out.println("opening" + document));
    }

    public void saveAll(List<Document> documents){
        documents.forEach(document -> {
            if(!(document instanceof ReadOnlyDocument))
                document.save();
        });
    }
}
