package Core.Основы_ОПП.key;
class NegativeTextAnalyzer extends KeywordAnalyzer implements Main.TextAnalyzer {
    private final String[] keywords = {":(" , "=(", ":|"};
    public String[] getKeywords() {
        return this.keywords;
    }
    public Main.Label getLabel(){
        return Main.Label.NEGATIVE_TEXT;
    }
}