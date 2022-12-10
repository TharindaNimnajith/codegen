import java.util.ArrayList;
import java.util.Collection;

class LanguageStudent {
    private final Collection<String> languages = new ArrayList<>();

    public void addLanguage(String language) {
        languages.add(language);
    }

    public Collection<String> getLanguages() {
        return languages;
    }
}

public class LanguageTeacher extends LanguageStudent {
    public static void main(String[] args) {
        LanguageTeacher teacher = new LanguageTeacher();
        teacher.addLanguage("English");

        LanguageStudent student = new LanguageStudent();
        teacher.teach(student, "English");

        for (String language : student.getLanguages()) {
            System.out.println(language);
        }
    }

    @SuppressWarnings({"SameParameterValue", "UnusedReturnValue"})
    private boolean teach(LanguageStudent student, String language) {
        if (student.getLanguages().contains(language)) {
            student.addLanguage(language);
            return true;
        } else {
            return false;
        }
    }
}
