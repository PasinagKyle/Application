package simpleinventory;

@Service
public class InventoryService {

    @Autowired
    private InventoryService(Map<String, Product> inventory){
        this.inventory = inventory;
    }
    public void addItemToInventory (String name, BigDecimal price, Long qunatity, Category category, Status status){
        inventory.put(name, new Product(name, price, quantity, category, status));
    }
    public List<Product> getInventory(){
        return new ArrayList<>(inventory.values())
    }
}