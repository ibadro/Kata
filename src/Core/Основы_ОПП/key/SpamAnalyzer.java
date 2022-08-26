package Core.Основы_ОПП.key;
class SpamAnalyzer extends KeywordAnalyzer implements Main.TextAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }
    public String[] getKeywords() {
        return this.keywords;
    }
    public Main.Label getLabel(){
        return Main.Label.SPAM;
    }
}