package qingke;

public class CommandManagerProducer {
	public static AbstractCommandManager getFactory(String choice){
	      if(choice.equalsIgnoreCase("System")){
	         return new SystemCommandManagerFactory();
	      } else if(choice.equalsIgnoreCase("Console")){
	         return new ConsoleCommandManagerFacotry();
	      }
	      return null;
	   }
}
