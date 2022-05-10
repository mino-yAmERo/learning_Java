public class ArrayBasic1_2DForLoop {
    public static void main(String[] args) {
        String [][]products = {
            {"Chairs","Table","Lamp"},
            {"Keyboard","Mouse","Headset"},
            {"Soap","Shampoo","Roll-on"},
            {"Pizza"},
            {"Egg","Chicken"}
        }; 
        System.out.println("products[]length : (row) = "+products.length);
        System.out.println("Row : 0 , Column = "+products[0].length);
        System.out.println("Row : 1 , Column = "+products[1].length);
        System.out.println("Row : 2 , Column = "+products[2].length);
        System.out.println("Row : 3 , Column = "+products[3].length);
        System.out.println("Row : 4 , Column = "+products[4].length);
        
        System.out.println();
        
        for (int row=0;row<products.length;row++){
            System.out.println("***********************************");
            for(int column=0;column<products[row].length;column++){
                System.out.println("row : "+row+" column : "+column+ " = "+products[row][column]);
            }
        }
    }
    
}
