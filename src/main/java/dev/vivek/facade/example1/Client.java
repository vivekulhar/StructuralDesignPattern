package dev.vivek.facade.example1;

public class Client {
    public static void main(String[] args) {
        InventoryManagementService inventoryManagementService = new InventoryManagementService();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        EmailNotificationService emailNotificationService = new EmailNotificationService();
        AppNotificationService appNotificationService = new AppNotificationService();
        SetterService setterService = new SetterService();

        Amazon amazon = new Amazon(invoiceGenerator,
                emailNotificationService,
                appNotificationService,
                inventoryManagementService,
                setterService);
        amazon.onOrderPlaced();
    }
}
