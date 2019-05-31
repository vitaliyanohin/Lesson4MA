public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

  private String[] keywords;

  public SpamAnalyzer(String[] keywords) {
    this.keywords = keywords;
  }

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
  protected  Label getLabel() {
    return Label.SPAM;
  }
}