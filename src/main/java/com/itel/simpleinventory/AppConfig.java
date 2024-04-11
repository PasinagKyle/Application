package simpleinventory;

@Configuration
public class AppConfig {
    @bean
    public Map<String, Product> inventory(){
        return new HashMap<>();
    }
}