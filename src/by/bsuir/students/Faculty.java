package by.bsuir.students;

public enum Faculty {
    FCSN("Faculty of Computer Systems and Networks"),
    FITC("Faculty of Information Technologies and Control"),
    FEE("Faculty of Engineering and Economics"),
    FRE("Faculty of Radioengineering and Electronics");
    private final String fullName;
    Faculty(String fullName){
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
}

