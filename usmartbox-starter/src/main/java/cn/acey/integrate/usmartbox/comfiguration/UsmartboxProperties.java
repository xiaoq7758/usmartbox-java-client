package cn.acey.integrate.usmartbox.comfiguration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

@Data
@ConfigurationProperties(prefix = "acey.integrate.usmartbox")
public class UsmartboxProperties{
    private String host;
    private String apikey;
    private String apisecret;

}
