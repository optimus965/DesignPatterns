package structuralDesignPatterns.compositePattern;

public class CompositeMain {
    public static void main(String[] args) {
        // composite pattern is a structural pattern that lets you treat individual objects and composite of objects uniformly
//        It solves this real-world problem:
//
//“We have objects that form a tree structure (like folders, menus, UI components).
//        Some objects are simple items.
//                Some objects contain other items.
//        But I want to treat ALL OF THEM exactly the same way.”
//
//        In other words:
//
//        A single object (leaf)
//
//        A collection of objects (composite)
//
//                should have one common interface so the client does not need to care.
        System.out.println("composite Pattern");

        FileSystemItem file1 = new File("readme.txt", 5);
        FileSystemItem file2 = new File("photo.jpg", 1500);
        FileSystemItem file3 = new File("data.csv", 300);

        Folder documents = new Folder("Documents");
        documents.addItem(file1);
        documents.addItem(file3);

        Folder pictures = new Folder("Pictures");
        pictures.addItem(file2);

        Folder home = new Folder("Home");
        home.addItem(documents);
        home.addItem(pictures);

        System.out.println("---- File Structure ----");
        home.printStructure("");

        System.out.println("\nTotal Size: " + home.getSize() + " KB");

        System.out.println("\n---- Deleting All ----");
        home.delete();
    }
}
