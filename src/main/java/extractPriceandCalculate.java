//// [Extract the digits from the paragraph and calculate the price]
public class extractPriceandCalculate {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.";
        int laptopPrice = extractPrice(paragraph, "laptop");
        int mousePrice = extractPrice(paragraph, "mouse");

        double discount = 0.15; // 15% discount
        double laptopDiscountedPrice = laptopPrice - (laptopPrice * discount);
        double mouseDiscountedPrice = mousePrice - (mousePrice * discount);

        double totalCost = laptopDiscountedPrice + mouseDiscountedPrice;
        System.out.println("Total cost after 15% discount: " + totalCost + " tk");
    }

    public static int extractPrice(String paragraph, String item) {
        String[] words = paragraph.split(" ");
        int priceIndex = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(item) && i > 0) {
                try {
                    return Integer.parseInt(words[i - 1]);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
        return -1;

    }
}
