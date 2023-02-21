public class TheBeatles {
    String name;
    String instrument;
    boolean playing;

    void apresentation () {
        if (playing) {
            System.out.println(this.name + " is playing " + this.instrument + " today.");
        } else {
            System.out.println(this.name + " isn't playing " + this.instrument + " today.");
        }
    }
}

class Band {
    public static void main(String[] args) {
        TheBeatles[] beatle = new TheBeatles[5];

        int b = 0;

        System.out.println("Ladies and gentlemen. We'll present: THE BEATLES!\n");

        while(b < 4) {
            b = b + 1;
            beatle[b] = new TheBeatles();
            beatle[b].name = "John Lennon";
            beatle[b].instrument = "electric guitar";
            beatle[b].playing = true;

            if (b == 2) {
                beatle[b].name = "George Harrison";
                beatle[b].instrument = "electric guitar";
                beatle[b].playing = false;
            }
            if (b == 3) {
                beatle[b].name = "Paul McCartney";
                beatle[b].instrument = "bass";
                beatle[b].playing = true;
            }
            if (b == 4) {
                beatle[b].name = "Ringo Starr";
                beatle[b].instrument = "drum";
                beatle[b].playing = true;
            }
            beatle[b].apresentation();
        }
        System.out.println("\nThe band will play soon.");
    }
}
