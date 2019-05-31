public class MainApplication {
  static byte[] arrayAsciiCharCode = new byte[94];

  public static void main(String[] args) {
    arrayAsciiBuilder();
    EasyTasks easyTasks = new EasyTasks();
    System.out.println(easyTasks.sqrt(20) + " Погрешность +-0.05");
    System.out.println(Math.sqrt(30));
    System.out.println(easyTasks.sqrt(30) + " Погрешность +-0.05");
    System.out.println("Next:");
    System.out.println(easyTasks.factorial(3));
    System.out.println("Next:");
    System.out.println(easyTasks.isPalindrome("Madam, I'm Adam!"));
    System.out.println("Next:");
    TextAnalyzer[] analyzers = {new SpamAnalyzer(new String[]{"spam", "spam test"}),
                                new NegativeTextAnalyzer(),
                                new TooLongTextAnalyzer(28)};
    System.out.println(checkLabels(analyzers, "v b spam test  орпроf"));
    System.out.println(checkLabels(analyzers, "v      орпроf"));
    System.out.println(checkLabels(analyzers, "v    :(  орпроf"));
    System.out.println(checkLabels(analyzers, "Длинна этой строки 30 символов"));
    AsciiCharSequence asciiCharSequence = new AsciiCharSequence(arrayAsciiCharCode);
    System.out.println("Next:");
    System.out.println(asciiCharSequence);
    System.out.println(asciiCharSequence.subSequence(20, 94));
  }

  private static TextAnalyzer.Label checkLabels(TextAnalyzer[] analyzers, String text) {
    for (TextAnalyzer analyzer : analyzers) {
      if (analyzer.processText(text) != TextAnalyzer.Label.OK) {
        return analyzer.processText(text);
      }
    }
    return TextAnalyzer.Label.OK;
  }

  private static void arrayAsciiBuilder() {
    int a = 0;
    for (int i = 33; i < 127; i++) {
      arrayAsciiCharCode[a] = (byte) i;
      a++;
    }
  }
}
