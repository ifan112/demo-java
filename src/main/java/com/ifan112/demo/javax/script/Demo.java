package com.ifan112.demo.javax.script;


import javax.script.*;

public class Demo {

    public static void main(String[] args) {

        // 脚本引擎管理器
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();

        // ScriptEngine jsEngine = scriptEngineManager.getEngineByExtension("js");
        ScriptEngine nashornEngine = scriptEngineManager.getEngineByName("nashorn");

        try {
            nashornEngine.eval("print('Hello')");
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        scriptEngineManager.getEngineFactories().forEach(scriptEngineFactory -> {
            System.out.println("Engine Name: " + scriptEngineFactory.getEngineName());
            System.out.println("Language Name: " + scriptEngineFactory.getLanguageName());

            ScriptEngine scriptEngine = scriptEngineFactory.getScriptEngine();

            System.out.println(scriptEngine instanceof Compilable);
            System.out.println(scriptEngine instanceof Invocable);

        });



    }
}
