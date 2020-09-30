package cn.acey.integrate.usmartbox.sign;

import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Sign {
    public static String signature(String apikey, String apisecret, String nonce, Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        builder.append(apikey);
        params.keySet().stream().filter(item->{return null!=item;}).sorted().forEach(key -> {
            builder.append(params.get(key));
        });

        builder.append(nonce);
        builder.append(apisecret);
        return DigestUtils.md5DigestAsHex(builder.toString().getBytes(StandardCharsets.UTF_8));
    }

    public static boolean verify(String apisecret,Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        builder.append(params.remove("apikey"));

        String sign = params.remove("sign");
        String nonce = params.remove("nonce");

        params.keySet().stream().sorted().forEach(key -> {
            builder.append(params.get(key));
        });

        builder.append(nonce);
        builder.append(apisecret);
        return  sign.equalsIgnoreCase(DigestUtils.md5DigestAsHex(builder.toString().getBytes(StandardCharsets.UTF_8)));

    }


}
