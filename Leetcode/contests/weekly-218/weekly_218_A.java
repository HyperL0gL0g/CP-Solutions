class Solution {
    public String interpret(String command) {
      command = command.replace('(','#');
        command = command.replace(')','#');
        
        command = command.replaceAll("#al#","al");

        return command;
        
    }
}