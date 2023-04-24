package ide;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Pattern;

public class ValidationIDE {
    private String url = "https://www.uid.admin.ch/Search.aspx?lang=fr";
    private String regex = "^CHE-[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}$";
    private Pattern pattern = Pattern.compile(regex);

    public ValidationIDE(String url, String regex, Pattern pattern) {
        this.url = url;
        this.regex = regex;
        this.pattern = pattern;
    }

    public void validerIDE(){

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }
}
