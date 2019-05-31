public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

  String[] keywords = {":(", "=(", ":|"};

  @Override
  public Label processText(String text) {
    for (String spam : getKeywords()) {
      if (text.contains(spam)) {
        return getLabel();
      }
    }
    return Label.OK;
  }

  @Override
  protected String[] getKeywords() {
    return keywords;
  }

  @Override
  protected Label getLabel() {
    return Label.NEGATIVE_TEXT;
  }
}