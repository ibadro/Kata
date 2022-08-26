package Core.Основы_ОПП.key;
class TooLongTextAnalyzer implements Main.TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public Main.Label processText(String text) {
        return (text.length() > maxLength)? Main.Label.TOO_LONG: Main.Label.OK;
    }
}