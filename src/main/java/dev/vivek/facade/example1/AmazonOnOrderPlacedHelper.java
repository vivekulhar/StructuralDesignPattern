package dev.vivek.facade.example1;

public class AmazonOnOrderPlacedHelper {
    InvoiceGenerator invoiceGenerator;
    EmailNotificationService emailNotificationService;
    AppNotificationService appNotificationService;
    InventoryManagementService inventoryManagementService;
    SetterService setterService;

    AmazonOnOrderPlacedHelper(InvoiceGenerator invoiceGenerator,
                              EmailNotificationService emailNotificationService,
                              AppNotificationService appNotificationService,
                              InventoryManagementService inventoryManagementService,
                              SetterService setterService) {
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotificationService = emailNotificationService;
        this.appNotificationService = appNotificationService;
        this.inventoryManagementService = inventoryManagementService;
        this.setterService = setterService;
    }
    public void orderPlaced(){
        System.out.println("AmazonOnOrderPlacedHelper: orderPlaced");
        invoiceGenerator.generateInvoice();
        emailNotificationService.sendEmail();
        appNotificationService.sendNotification();
        inventoryManagementService.updateInventory();
        setterService.set();
    }

}
