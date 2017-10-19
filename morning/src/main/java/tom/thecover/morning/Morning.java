package tom.thecover.morning;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by tom on 17/10/20.
 */

public class Morning {

    public static void say(Context context) {
        Toast.makeText(context, "Good Morning, Tom", Toast.LENGTH_SHORT).show();
    }
}
