public class checkStock
{
    public int inventoryCheck(String store, int itemID) throws FileNotFoundException {
        int count = 0;
        int itemNum, itemStock, numItems, itemInv=0;
        File file = new File(store+".txt");
        Scanner scan = new Scanner(file);
        numItems = scan.nextInt();
        int[][] items = new int[numItems][2];
        while(scan.hasNext())
        {
            itemNum = scan.nextInt();
            itemStock = scan.nextInt();
            items[count][0] = itemNum;
            items[count][1] = itemStock;
            count++;
        }
        for(int i = 0; i<numItems; i++)
        {
            if(itemID==items[i][0])
            {
                itemInv = items[i][1];
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
