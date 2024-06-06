public class StringFormatting {

    public static class StringFormattingBuilder {
        private String text = "";
        public StringFormattingBuilder setText(String text) {
            this.text = text;
            return this;
        }

        private String appendText = "";
        public StringFormattingBuilder setAppendText(String appendText) {
            this.appendText = appendText;
            return this;
        }

        private String insertText = "";
        public StringFormattingBuilder setInsertText(String insertText) {
            this.insertText = insertText;
            return this;
        }

        private int index = 0;
        public StringFormattingBuilder setIndex(int index) {
            this.index = index;
            return this;
        }

        public StringFormatting build() {
            return new StringFormatting(text, appendText, insertText, index);
        }
    }

    private String text;
    private String appendText;
    private String insertText;
    private int index;

    public StringFormatting(String text, String appendText, String insertText, int index) {
        this.text = text;
        append(appendText);
        insert(insertText, index);
    }

    public String getText() {
        return this.text;
    }

    public void append(String appendText) {
        this.text += appendText;
    }

    public void insert(String insertText, int index) {
        if (index < 0 || index > this.text.length()) {
            throw new IndexOutOfBoundsException();
        }
        this.text = this.text.substring(0, index) + insertText + this.text.substring(index);
    }
}
