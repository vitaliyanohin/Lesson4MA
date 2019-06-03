public class TooLongTextAnalyzer implements TextAnalyzer {
  private int maxLength;

  public TooLongTextAnalyzer(int maxLength) {
    this.maxLength = maxLength;
  }

  @Override
  public Label processText(String text) {
    if (maxLength < text.length()) {
      return getLabel();
    }
    return Label.OK;
  }

 private Label getLabel() {
    return Label.TOO_LONG;
  }
}
