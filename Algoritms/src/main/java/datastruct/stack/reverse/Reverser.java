package datastruct.stack.reverse;

public class Reverser {
    private String input;// Входная строка
    private String output;// Выходная строка

    public Reverser(String in) {
        input = in;
    }// конструктор

    public String doRev() {// Перестановка символов
        int stackSize = input.length();   // Определение размера стека
        StackX theStack = new StackX(stackSize);  // создание стека

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // Чтение символа из входного потока
            theStack.push(ch);// размещение в стек
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output + ch;

        }
        return output;
    }
}
