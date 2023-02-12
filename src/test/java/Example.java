import me.lundy.jalorant.Jalorant;
import me.lundy.jalorant.entities.Player;

import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException {

        Player cosine = Jalorant.v1().getPlayer("cosine", "3893");
        Player cosineUuid = Jalorant.v1().getPlayer("50bd4e89-878d-589b-b9a4-33af19cd9447");
        System.out.println(cosine);
        System.out.println(cosineUuid);

    }

}
