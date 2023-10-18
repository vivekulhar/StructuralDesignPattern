package dev.vivek.facade.example1;

public class Amazon {
    AmazonOnOrderPlacedHelper amazonOnOrderPlacedHelper;

    Amazon(InvoiceGenerator invoiceGenerator,
            EmailNotificationService emailNotificationService,
            AppNotificationService appNotificationService,
            InventoryManagementService inventoryManagementService,
            SetterService setterService) {
        amazonOnOrderPlacedHelper = new AmazonOnOrderPlacedHelper(
                invoiceGenerator,
                emailNotificationService,
                appNotificationService,
                inventoryManagementService,
                setterService);
    }

    public void onOrderPlaced(){
        amazonOnOrderPlacedHelper.orderPlaced();
    }
}
