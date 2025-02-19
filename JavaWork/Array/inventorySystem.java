public class inventorySystem {
    public static void main(String[] args) {

        //Array of int with 5 values
        int[] productQuantities = {10, 15, 20, 5, 8};

        //Changing the amount of third product
        productQuantities[2] = 25; // within index 2, before value of amount of product is 20, after change the amount in 25

        // Initial inventory, this variables will be used to sum all the product quantities
        int totalInventory = 0;

        // Through the array and add sum all the product quantities to get the total inventory.
        for (int i = 0; i < productQuantities.length; i++) {  // variable i stored the index of array; while i minor of 5; 
                                                              // index +1, iterating  0, 1, 2, 3, 4 indexs of array
            //
            totalInventory += productQuantities[i]; // totalInventory = totalInventort + productQuantities[i]
        }

        System.out.println("Total inventory: " + totalInventory);
    }
}