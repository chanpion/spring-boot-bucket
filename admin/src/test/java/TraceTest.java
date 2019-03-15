import com.sun.btrace.AnyType;
import com.sun.btrace.annotations.*;

/**
 * @author April Chen
 * @date 2019/3/15 17:14
 */
@BTrace
public class TraceTest {
    @OnMethod(
            clazz = "Calculator",
            method = "add",
            location = @Location(Kind.RETURN)
    )
    public static void trace(@Return AnyType sum) {

    }
}
