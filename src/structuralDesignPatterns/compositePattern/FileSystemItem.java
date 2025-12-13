package structuralDesignPatterns.compositePattern;

interface FileSystemItem {
    int getSize();
    void printStructure(String indent);
    void delete();
}
