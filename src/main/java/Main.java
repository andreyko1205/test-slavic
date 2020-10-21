import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class Main {

    public static void main(String[] args) {
        System.out.println(getVersionInfo());
    }

    private static String getVersionInfo() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://ww2staging.slavic401k.com/swal/version";

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<?> entity = new HttpEntity<>(headers);

        HttpEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                String.class);
        return response.getBody();
    }

}
