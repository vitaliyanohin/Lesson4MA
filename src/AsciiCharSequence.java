public class AsciiCharSequence implements java.lang.CharSequence {
 private byte[] arr;

  public AsciiCharSequence(byte[] arr) {
    this.arr = arr;
  }

  @Override
  public int length() {
    return arr.length;
  }

  @Override
  public char charAt(int index) {
    return (char) arr[index];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    byte[] subArray = new byte[end - start];
    int incrementArrayIndex = 0;
    while (start < end) {
      subArray[incrementArrayIndex++] = this.arr[start++];
    }
    return new AsciiCharSequence(subArray);
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder("");
    for (int i = 0; i < arr.length; i++) {
      result.append(charAt(i)).append(" ");
    }
    return String.valueOf(result);
  }
}
