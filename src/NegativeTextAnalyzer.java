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
  String[] getKeywords() {
    return keywords;
  }

  @Override
  Label getLabel() {
    return Label.NEGATIVE_TEXT;
  }
}
