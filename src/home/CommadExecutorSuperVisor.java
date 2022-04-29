package home;

public class CommadExecutorSuperVisor implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor command_executor;

    public CommadExecutorSuperVisor(String user_name,String password){

        if("akash".equalsIgnoreCase(user_name) && "poplu007".equals(password)) isAdmin=true;
        command_executor=new CommandExecutorImp();

    }


    @Override
    public void runCommand(String command) throws Exception {
        if(isAdmin){
            command_executor.runCommand(command);
        }else{
            if(command.trim().startsWith("rm")){
                throw new Exception("rm command not avail");
            }else{
                command_executor.runCommand(command);
            }
        }
        
    }
    
}
