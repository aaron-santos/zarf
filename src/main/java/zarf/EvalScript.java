package zarf;

import javax.script.*;
import org.apache.felix.ipojo.annotations.Component;

@Component(name = "EvalScript")
public class EvalScript {
    public static void main(String[] args) throws Exception {
        // create a script engine manager
        ScriptEngineManager factory = new ScriptEngineManager();
        // create a Nashorn script engine
        ScriptEngine engine = factory.getEngineByName("nashorn");
        // evaluate JavaScript statement
        try {
            engine.eval("print('Hello, World!');");
        } catch (final ScriptException se) { se.printStackTrace(); }
    }
}
