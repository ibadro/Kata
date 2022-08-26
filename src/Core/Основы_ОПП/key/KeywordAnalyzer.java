package Core.Основы_ОПП.key;
public abstract class KeywordAnalyzer implements Main.TextAnalyzer {
    public abstract String[] getKeywords();
    public abstract Main.Label getLabel();
    public Main.Label processText(String text) {
        String[] keywords = getKeywords();
        Main.Label label = getLabel();
        for (String str : keywords) {
            if (text.toLowerCase().contains(str)) {
                return label;
            }
        }
        return Main.Label.OK;
    }
}