package model;

public class ConfigManager {

	 // Instância única estática
    private static ConfigManager instance;

    // Dados de configuração (somente exemplo)
    private String appName = "Meu Sistema XPTO";
    private boolean modoDebug = true;

    // Construtor privado impede criação externa
    private ConfigManager() {
        System.out.println("ConfigManager inicializado!");
    }

    // Método de acesso global à instância
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    // Métodos de manipulação
    public String getAppName() {
        return appName;
    }

    public boolean isModoDebug() {
        return modoDebug;
    }

    public void setModoDebug(boolean value) {
        this.modoDebug = value;
    }
}
