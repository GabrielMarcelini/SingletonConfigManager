package view;

import model.ConfigManager;

public class Main {

	public static void main(String[] args) {

        // Acessando a única instância do Singleton
        ConfigManager config1 = ConfigManager.getInstance();
        ConfigManager config2 = ConfigManager.getInstance();

        System.out.println("Nome da aplicação: " + config1.getAppName());
        System.out.println("Modo debug: " + config1.isModoDebug());

        // Alterando pelo primeiro objeto
        config1.setModoDebug(false);

        // Verificando pelo segundo (mesma instância)
        System.out.println("Modo debug após alteração: " + config2.isModoDebug());

        // Verificando se são realmente o mesmo objeto
        System.out.println("Mesma instância? " + (config1 == config2));
    }
}
