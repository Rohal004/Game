

public class Computer extends Game {
    @Override
    public String computerChoice() {
        int com = random.nextInt(3);
        return choices[com];
    }
}
