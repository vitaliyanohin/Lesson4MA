public abstract class KeywordAnalyzer implements TextAnalyzer {

  abstract String[] getKeywords();

  abstract Label getLabel();
}
