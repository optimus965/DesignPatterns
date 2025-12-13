package behavioralDesignPatterns.mementopattern;

public class MementoMain {
    public static void main(String[] args) {
//  The Memento Pattern captures an object’s internal state at a specific moment and allows
//  you to restore that state later without exposing the object’s internal details.

//        Memento = Snapshot + Restore
//        (without exposing private data)
//        ✔ The object (Originator) creates a Memento of itself
//        ✔ The caretaker stores it
//        ✔ The object can be restored from that Memento later
//        ✔ No one else can see the internal state

//        Memento lets you “undo” by restoring saved snapshots of an object.

        TextEditor editor = new TextEditor();
        TextEditorUndoManager undoManager = new TextEditorUndoManager();

        editor.type("Hello");
        undoManager.save(editor); // save state: Hello

        editor.type(" World");
        undoManager.save(editor); // save state: Hello World

        editor.type("!");
        System.out.println("Current Content: " + editor.getContent()); // Hello World!

        System.out.println("\n--- Undo 1 ---");
        undoManager.undo(editor); // Back to: Hello World

        System.out.println("\n--- Undo 2 ---");
        undoManager.undo(editor); // Back to: Hello

        System.out.println("\n--- Undo 3 ---");
        undoManager.undo(editor); // Nothing left to undo
    }
}
