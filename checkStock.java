public class checkStock
{
    public String inventoryCheck(String item) throws FileNotFoundException {
        String itemInv = "Sorry item not found";
        String itemName;
        File file = new File("Inventory.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNext())
        {
        	itemName = scan.next();
            if(item.equals(itemName))
            {
                itemInv = scan.next();
                return itemInv;
            }
            else
            {
                scan.next();
            }
        }
        return itemInv;
    }
    public String findStore(int zipCode) throws FileNotFoundException {
        String store = "";
        File file = new File("storeList.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNext())
        {
            if(scan.nextInt()==zipCode)
            {
                store = scan.next();
                return store;
            }
            else
            {
                scan.next();
            }
        }
        return "Store not found please try another zip code.";
    }
    public static void main(String[] args)
    {

    }
}
