package home;

public class CommandExecutorImp implements CommandExecutor {
    @Override
    public void runCommand(String command) throws Exception {
       Runtime.getRuntime().exec(command);
       MyUtils.log("COMMAND EXECUTOR", "command started");
        
    }
}
