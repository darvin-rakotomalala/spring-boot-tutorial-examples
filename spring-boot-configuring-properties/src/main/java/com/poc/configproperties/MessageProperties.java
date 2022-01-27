package com.poc.configproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration // dira à Spring de créer un bean de cette classe.
@ConfigurationProperties(prefix = "message.default") // initialisera les champs avec les noms de propriété correspondants.
public class MessageProperties {
    private String welcome;
    private String goodbye;

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    public String getGoodbye() {
        return goodbye;
    }

    public void setGoodbye(String goodbye) {
        this.goodbye = goodbye;
    }
}
