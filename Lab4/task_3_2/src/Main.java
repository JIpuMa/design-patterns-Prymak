public class Main {
    public static void main(String[] args) {
        StringFormatting.StringFormattingBuilder builder = new StringFormatting.StringFormattingBuilder();
        builder
                .setText("123")
                .setAppendText("456")
                .setInsertText("000")
                .setIndex(1);
        StringFormatting stringFormatting = builder.build();
        System.out.println(stringFormatting.getText());
    }
}