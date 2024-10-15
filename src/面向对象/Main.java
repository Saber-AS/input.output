package 面向对象;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.input("F:\\软体\\input_output\\src\\面向对象\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("F:\\软体\\input_output\\src\\面向对象\\output.txt");

    }
}
