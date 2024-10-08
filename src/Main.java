//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Playable[] playables = new Playable[3];
        playables[0] = (new Drum());
        playables[1] = (new Piano());
        playables[2] = (new Guitar());

        for (Playable playy : flyingCreatures) {
            playy.play();

    }
}