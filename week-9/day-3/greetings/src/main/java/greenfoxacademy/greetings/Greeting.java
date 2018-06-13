package greenfoxacademy.greetings;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    AtomicLong id;
    public String content;

    public Greeting(AtomicLong id, String content) {
        this.id=id;
        this.content = content;
    }

    public AtomicLong getId() {
        return id;
    }

    public long add() {
        return id.incrementAndGet();
    }


    public String getContent() {
        return content;
    }
}
